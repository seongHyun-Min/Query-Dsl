package study.querydsl.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.querydsl.entity.Member;

import javax.transaction.Transactional;

import java.util.List;


@SpringBootTest
@Transactional
class MemberRepositoryTest {



    @Autowired MemberRepository memberRepository;

    @Test
    public void basicTest(){
        Member member = new Member("member1", 10);
        memberRepository.save(member);


        Member findMember = memberRepository.findById(member.getId()).get();


        Assertions.assertThat(findMember).isEqualTo(member);

        List<Member> result1 = memberRepository.findAll();

        Assertions.assertThat(result1).containsExactly(member);


        List<Member> result2 = memberRepository.findByUsername("member1");

        Assertions.assertThat(result2).containsExactly(member);

        //테스트 코드 추가


    }

}