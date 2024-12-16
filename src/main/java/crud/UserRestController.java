package crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {


    Map<Long, User> db = new HashMap<Long, User>();

    public UserRestController() {
        // 10 + 알파벳 l long타입으로 id를 넣었기 때문. long타입은 무수히 큰 숫자까지 저장 할 수 있기 때문에 id는 주로 long타입으로 저장한다
        db.put(10l, new User("aa11", "AAA", "aaa", ""));
        db.put(11l, new User("bb22", "BBB", "bbb", ""));
        db.put(12l, new User("cc33", "CCC", "ccc", ""));
        db.put(13l, new User("dd44", "DDD", "ddd", ""));

    }

    @GetMapping("/profile/{userId}")  //@GetMapping, @PathVariable 만 제외하면 Java 함수와 구조가 동일. 일단 함수로 만든뒤 @를 붙이는게 좋음
    UserResponse getProfile(@PathVariable(name = "userId") Long userId){  //(name = "userId"는 생략가능)  생략하려면 프로필/{userID}와 Long userId가 같아야 한다

        User user = db.get(userId);
        return new UserResponse(
                user.getLoginId(),
                user.getNickname(),
                user.getName());


    }

//    @GetMapping("/profile")
//    UserResponse getProfile(){
//    User user = new User("aaa11", "AA", "김", "12345");  //실제 저장하고 관리하는 데이터
//    UserResponse userResponse = new UserResponse(
//                                user.getLoginId(),
//                                user.getNickname(),
//                                user.getName());
//
//    return userResponse;
//    }


}
