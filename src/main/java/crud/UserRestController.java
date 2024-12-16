package crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {


    @GetMapping("/profile")
    UserResponse getProfile(){
    User user = new User("aaa11", "AA", "김", "12345");  //실제 저장하고 관리하는 데이터
    UserResponse userResponse = new UserResponse(
                                user.getLoginId(),
                                user.getNickname(),
                                user.getName());

    return userResponse;
    }
}
