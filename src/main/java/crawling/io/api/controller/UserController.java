package crawling.io.api.controller;

import crawling.io.api.data.UserListResponse;
import crawling.io.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/save")
    public void save() {
        userService.save();
    }

    @GetMapping("/get")
    public UserListResponse get() {
        return userService.get();
    }
}
