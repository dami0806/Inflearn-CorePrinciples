package hello.core.member;

public interface MemberRepository {
    //기능 2가지: 회원 저장, 회원 아이디찾기
    void save(Member member);
    Member findById(Long memberId);
}
