package crawling.io.api.service;

import crawling.io.api.data.UserEntity;
import crawling.io.api.data.UserListResponse;
import crawling.io.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("test");
        userEntity.setBirth("19900101");
        userEntity.setPhone("01012345678");
        userEntity.setEmail("alswltn09@naver.com");
        userEntity.setPassword("1234");
        userEntity.setGender("M");
        userEntity.setNickname("asdf");
        userEntity.setVerifiedEmail(1);
        userRepository.save(userEntity);


        UserEntity testEntity = userRepository.findByNickname("asdf");

        System.out.println();
    }
    public UserListResponse get() {
        List<UserEntity> userEntity = userRepository.findAll();
        UserListResponse userListResponse = new UserListResponse(userEntity);
        return userListResponse;
    }
}
