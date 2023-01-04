package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member("kim", 30);

        //when
        Member savedMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(savedMember.getId());
        Assertions.assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll() {
        Member member1 = new Member("kim", 30);
        Member member2 = new Member("park", 22);

        memberRepository.save(member1);
        memberRepository.save(member2);

        for (Member member : memberRepository.findAll()) {
            System.out.println(member.getUsername());
        }

        Assertions.assertThat(memberRepository.findAll().size()).isEqualTo(2);
    }
}
