package zoo.apps.user.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer age;
    private String password;
    private String alias;
}
