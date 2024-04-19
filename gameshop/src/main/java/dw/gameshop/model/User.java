package dw.gameshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
    @Id
    @Column(name = "user_id", length = 100)
    private String userId;
    @Column(name = "user_name", length = 255, nullable = false)
    private String UserName;
    @Column(name = "email", length = 255, nullable = false)
    private String email;

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userId, String userName, String email) {
        this.userId = userId;
        UserName = userName;
        this.email = email;

    }
}
