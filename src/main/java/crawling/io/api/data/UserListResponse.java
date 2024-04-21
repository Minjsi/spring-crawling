package crawling.io.api.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class UserListResponse {
   private List<UserEntity> userEntityList;
}
