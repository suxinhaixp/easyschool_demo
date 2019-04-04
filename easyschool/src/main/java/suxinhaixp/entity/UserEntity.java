package suxinhaixp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.mapping.Map;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/12.
 */

@Entity(name="usermodel")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity {
    private static final long serialVersionUID = 1L;

    @Id
@GeneratedValue

    private Long id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;
    private String username;
    private String password;
    private boolean root;

    public UserEntity(User user, String username, String password, boolean root) {
        this.user = user;
        this.username = username;
        this.password = password;
        this.root = root;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserEntity(Long id, String password){

    this.id = id;
    this.password = password;

}
    public UserEntity(){


    }



    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
