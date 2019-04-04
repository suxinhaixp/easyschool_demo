package suxinhaixp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;



    @Entity(name = "teacher")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Teacher  {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(generator = "myForeignGenerator")
        @GenericGenerator(name = "myForeignGenerator",
                strategy = "foreign",
                parameters = @Parameter(name = "property", value = "userEntity"))
        private Long id;

        @OneToOne(optional = false)
        @PrimaryKeyJoinColumn
        private UserEntity userEntity;
        private String username;
        private String sex;
        private String idcard;
        private String professional;
        private String college;

        public Teacher(UserEntity userEntity, String username, String sex, String idcard, String professional, String college) {
            this.userEntity = userEntity;
            this.username = username;
            this.sex = sex;
            this.idcard = idcard;
            this.professional = professional;
            this.college = college;
        }

        public Teacher() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public UserEntity getUserEntity() {
            return userEntity;
        }

        public void setUserEntity(UserEntity userEntity) {
            this.userEntity = userEntity;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public String getProfessional() {
            return professional;
        }

        public void setProfessional(String professional) {
            this.professional = professional;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }
    }

