package space.novoselov.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.novoselov.dto.UserInfo;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping("/api/")
public class UserController {

    @GetMapping("users")
    public ResponseEntity<List<UserInfo>> getUsers() {
        return new ResponseEntity<>(getUserList(), HttpStatus.OK);
    }

    private List<UserInfo> getUserList() {
        List<UserInfo> userList = new ArrayList<>();
        userList.add(new UserInfo(1L, "Tommy", "password", true, false));
        return userList;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserInfo> getUserById(@PathVariable(name="id") Long userId) {
        return new ResponseEntity<>(
                getUser(userId),
                HttpStatus.OK);
    }

    private UserInfo getUser(Long userId) {
        return new UserInfo(userId, "GeneratedUser", "password", true, false);
    }

}
