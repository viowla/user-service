package kz.iitu.userservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String id;
    private String fullName;
    private String gender;

    public User() {
    }

    public User(String id, String fullName, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
    }
}
