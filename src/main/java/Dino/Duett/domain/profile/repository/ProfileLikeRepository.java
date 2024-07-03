package Dino.Duett.domain.profile.repository;

import Dino.Duett.domain.member.entity.Member;
import Dino.Duett.domain.profile.entity.Profile;
import Dino.Duett.domain.profile.entity.ProfileLike;
import Dino.Duett.domain.profile.entity.ProfileUnlock;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileLikeRepository extends JpaRepository<ProfileLike, Long> {
    List<ProfileLike> findByMember(Member member);
    List<ProfileLike> findByLikedProfile(Profile profile);
    ProfileLike findByMemberAndLikedProfile(Member member, Profile likedProfile);
}

