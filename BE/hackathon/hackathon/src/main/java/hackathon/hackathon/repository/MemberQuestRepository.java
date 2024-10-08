package hackathon.hackathon.repository;

import hackathon.hackathon.domain.MemberQuest;
import hackathon.hackathon.domain.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberQuestRepository extends JpaRepository<MemberQuest, Long> {
    List<MemberQuest> findByMember_UuidOrderByDateDesc(String uuid);

    List<MemberQuest> findByQuest(Quest quest);
}
