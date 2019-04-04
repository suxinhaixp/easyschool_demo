package suxinhaixp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginParamater {
    private Long id;
    private String password;

    public LoginParamater(Long id, String password) {
        this.id = id;
        this.password = password;
    }
    public LoginParamater() {
    }

    public LoginParamater(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}