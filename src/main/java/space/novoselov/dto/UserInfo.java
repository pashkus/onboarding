package space.novoselov.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private Long id;

    private String login;

    private String password;

    private Boolean isActive;

    private Boolean isDeleted;
}
