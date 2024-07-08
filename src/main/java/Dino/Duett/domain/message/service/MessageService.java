package Dino.Duett.domain.message.service;

import Dino.Duett.domain.member.entity.Member;
import Dino.Duett.domain.member.exception.MemberException;
import Dino.Duett.domain.member.repository.MemberRepository;
import Dino.Duett.domain.message.dto.request.MessageDeleteRequest;
import Dino.Duett.domain.message.dto.request.MessageSendRequest;
import Dino.Duett.domain.message.dto.response.MessageDeleteResponse;
import Dino.Duett.domain.message.dto.response.MessageResponse;
import Dino.Duett.domain.message.entity.Message;
import Dino.Duett.domain.message.repository.MessageRepository;
import Dino.Duett.global.enums.LimitConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
@Log4j2(topic = "messageServiceLogger")
public class MessageService {
    private final MessageRepository messageRepository;
    private final MemberRepository memberRepository;

    // 사용자의 모든 수신 메시지 조회
    @Transactional(readOnly = true)
    public List<MessageResponse> getAllReceiveMessages(Long receiverId, Integer page) {
        Pageable pageable = PageRequest.of(page, LimitConstants.MESSAGE_MAX_LIMIT.getLimit(), Sort.by(Sort.Direction.ASC, "createdDate"));
        List<Message> messageList =  messageRepository.findAllByReceiverId(receiverId, pageable);

        return messageList.stream()
                .map(message -> {
                    Long senderId = message.getSender().getId();
                    return MessageResponse.of(senderId, receiverId, message.getContent());
                }).toList();
    }

    // 사용자의 모든 발신 메시지 조회
    @Transactional(readOnly = true)
    public List<MessageResponse> getAllSendMessages(Long senderId, Integer page) {
        Pageable pageable = PageRequest.of(page, LimitConstants.MESSAGE_MAX_LIMIT.getLimit(), Sort.by(Sort.Direction.ASC, "createdDate"));
        List<Message> messageList =  messageRepository.findAllBySenderId(senderId, pageable);

        return messageList.stream()
                .map(message -> {
                    Long receiverId = message.getReceiver().getId();
                    return MessageResponse.of(senderId, receiverId, message.getContent());
                }).toList();
    }

    // 메시지 전송
    @Transactional
    public MessageResponse sendMessage(Long senderId, MessageSendRequest messageSendRequest) {
        // senderId로 회원을 찾아서 없으면 예외처리
        Member sender = memberRepository.findById(senderId).orElseThrow(
                () -> {
                    Map<String, String> error = new HashMap<>();
                    error.put("해당하는 회원을 찾을 수 없습니다.", "senderId: " + senderId);
                    return new MemberException.MemberNotFoundException(error);
                }
        );
        // receiverId로 회원을 찾아서 없으면 예외처리
        Member receiver = memberRepository.findById(messageSendRequest.getReceiverId()).orElseThrow(
                () -> {
                    Map<String, String> error = new HashMap<>();
                    error.put("해당하는 회원을 찾을 수 없습니다.", "receiverId: " + messageSendRequest.getReceiverId());
                    return new MemberException.MemberNotFoundException(error);
                }
        );
        // message 생성
        Message message = Message.builder()
                .content(messageSendRequest.getContent())
                .sender(sender)
                .receiver(receiver)
                .build();
        messageRepository.save(message);

        return MessageResponse.of(sender.getId(), receiver.getId(), messageSendRequest.getContent());
    }

    // 받은 메시지 삭제. 삭제된 메시지의 id만 반환
    @Transactional
    public MessageDeleteResponse deleteMessage(Long receiverId, MessageDeleteRequest messageDeleteRequest) {
        Long[] deleteMessageIds = Arrays.stream(messageDeleteRequest.getMessageIds()).filter(
                messageId -> messageRepository.findById(messageId).map(
                        message -> message.getReceiver().getId().equals(receiverId)
                ).orElse(false)
        ).toArray(Long[]::new);

        return MessageDeleteResponse.of(deleteMessageIds);
    }
}
