package study.querydsl.dto;


import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MemberTeamDto {

    private Long memberId;
    private String username;
    private int age;
    private Long teamid;

    private String teamName;



    //Dto가 쿼리프로젝션이라는 라이브러리를 의존하는 단점
    @QueryProjection
    public MemberTeamDto(Long memberId, String username, int age, Long teamid, String teamName) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
        this.teamid = teamid;
        this.teamName = teamName;
    }
}
