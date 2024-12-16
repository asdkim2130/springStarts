package crud;

public class UserResponse {
    private String loginId;
    private String nickname;
    private String name;

    public UserResponse(String loginId, String nickname, String name) {
        this.loginId = loginId;
        this.nickname = nickname;
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }
    //오브젝터의 getter를 사용하지 않더라도 만들어야 함. JASON 데이터로 변환이 되어야 하기 때문에(Spring에서 JASON으로 변환할 때 필요함)


    //DTO 데이터 운반 오브젝트. 데이터 운반 말고는 다른 기능이 없음
}
