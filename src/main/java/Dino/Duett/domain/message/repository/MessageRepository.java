package Dino.Duett.domain.message.repository;

import Dino.Duett.domain.message.entity.Message;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findAllByReceiverId(Long memberId, Pageable page);
}