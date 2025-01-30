# Duett

<img width="1920" alt="duett" src="https://github.com/user-attachments/assets/8b90dd98-cd99-4c4a-86fd-59bb7eef4e78" />



### **Duett**은 **음악을 매개로 사람들을 연결하는 소셜 매칭 서비스**입니다.

사용자는 자신의 음악 취향을 반영한 **인생곡**과 좋아하는 **음악 장르, 취미**를 설정하여 공통된 관심사를 가진 상대를 찾을 수 있습니다.

단순한 프로필 탐색뿐 아니라 상대방이 **좋아하는 노래를 직접 감상**하며 공감대를 형성할 수 있는 기능을 제공합니다.

이를 통해 "**음악**"을 기반으로 **진솔한 교감과 깊이 있는 관계 형성**을 추구합니다.

### 🌐 배포 주소
- https://duett.bio
- 모바일로만 로그인 가능합니다.

## ✨ 주요 기능
###  📝 **프로필 카드 생성 및 관리**
   - 사용자는 자신의 별칭, 생년월일, MBTI, 사진, 한 줄 소개 등을 입력하고 상대에게 보여질 **프로필 카드를 완성**합니다.
   - 좋아하는 **노래를 검색**하고 **인생곡을 등록**해서 나만의 **음악 취향**을 표현합니다.
   - **음악 장르**와 **취미 태그**를 선택하여 **나의 개성과 관심사**를 표현합니다.
###  🎧 **음악 취향 기반 매칭**
   - 사용자의 음악/취미 태그와 인생곡을 바탕으로 상대의 **프로필 카드 탐색**이 가능합니다.
   - 사용자가 **재화를 소비**하여 상대방의 **상세 프로필 정보를 확인**합니다.
   - 상대가 등록한 노래에 대한 **뮤직 비디오를 시청**할 수 있습니다.
   - 자신이 최근 **열어본 프로필**을 확인할 수 있습니다.
###  💌 **좋아요 및 메시지 기능**
   - 사용자는 다른 사용자의 프로필에 **좋아요**를 남길 수 있습니다.
   - 마음에 드는 상대에게 **메시지**를 전송할 수 있습니다.
   

## 🛠️ 스택
### Environment
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)


### Framework & Language
**Back-end**
  
![Java 17](https://img.shields.io/badge/Java%2017-007396?style=for-the-badge&logo=java&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot%203-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) 

**Front-end**
  
![TypeScript](https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white)
![React](https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=black)

### Database
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white) ![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white) 

### Infra
![GCP](https://img.shields.io/badge/Google%20Cloud-4285F4?style=for-the-badge&logo=google-cloud&logoColor=white)
![Cloud Storage](https://img.shields.io/badge/Cloud%20Storage-FF9900?style=for-the-badge&logo=google-cloud&logoColor=white)
![Firebase](https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=white)
![NGINX](https://img.shields.io/badge/NGINX-009639?style=for-the-badge&logo=nginx&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white) 
![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white)

### Third-party APIs
![YouTube Data API v3](https://img.shields.io/badge/YouTube%20Data%20API%20v3-FF0000?style=for-the-badge&logo=youtube&logoColor=white)

### Communication
![Notion](https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=notion&logoColor=white)
![Jira](https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white)


## ⚙️ 아키텍처

![duett-arch](https://github.com/user-attachments/assets/40f9f099-abd7-46c3-bb0e-f33a34098c9d)

## 📍 Roadmap
**🔐 인증/인가**
> - [x] 로그인
> - [x] 인증 코드 요청
> - [x] refesh token reissue 요청
> - [x] 회원가입 여부 확인(kakao id, user id)
> - [x] 회원 탈퇴

**📜 약관**
> - [x] 회원가입 약관 생성
> - [x] 개인정보 처리방침 약관 생성
> - [x] 최근 약관 조회

**📇 프로필 카드**
> - [x] 프로필 카드 상세 조회
> - [x] 코인을 사용해 상세 조회
> - [x] 반경 내 프로필카드 요약 목록 조회
> - [x] 열어본 프로필 카드 목록 조회

**❤️ 좋아요**
> - [x] 좋아요한 목록 조회
> - [x] 좋아요/좋아요 해제
> - [x] 나를 좋아요 한 프로필 목록 조회

**💬 메시지**
> - [x] 메시지 전송
> - [x] 발신 메시지 목록 조회
> - [x] 수신 메시지 목록 조회
> - [x] 받은 메시지 삭제

**👤 마이페이지**
> **🏠 홈**
>   - [x] 마이페이지 홈 정보(유저 기본 정보, 프로필 진행 완료 정도) 조회

> **📄 내 정보**
>   - [x] 내 정보 조회
>   - [x] 내 정보 등록/수정

> **📝 내 소개**
>   - [x] 내 소개 조회
>   - [x] 내 소개 등록/수정
>   - [x] 선택 가능한 모든 태그 조회

> **🎵 음악 취향**
>   - [x] 인생곡 추가/수정/삭제
>   - [x] 무드 등록/수정
>   - [x] 유튜브 API로 비디오 검색
>   - [x] 자신의 음악 취향 조회

> **🎤 나의 Duett**
>   - [x] 프로필 위치 수정


## 🧑🏻‍💻 기여자
| BE  | BE  | BE  |
| :-------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------: |
| ![](https://images.weserv.nl/?url=https://avatars.githubusercontent.com/Feedbaek?v=4&h=250&w=250&fit=cover&mask=circle&maxage=7d) | ![](https://images.weserv.nl/?url=https://avatars.githubusercontent.com/sor999?v=4&h=250&w=250&fit=cover&mask=circle&maxage=7d) | ![](https://images.weserv.nl/?url=https://avatars.githubusercontent.com/ddr4869?v=4&h=250&w=250&fit=cover&mask=circle&maxage=7d) |
| [Feedbaek](https://github.com/Feedbaek) | [sor999](https://github.com/sor999) | [ddr4869](https://github.com/ddr4869) |
