package suxinhaixp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
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
    private String nationality;//民族
    private String birthday;
    private String Of_Student;
    private String college;//学院
    private String major;//专业
    private String year_all;//学制
    private String year_in;//入学批次
    private String status;//当前状态
    private String classno;//班号
    private String date;//入学日期
    private String remarks;//备注

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public User(Long id, String username, String sex, String nationality, String birthday, String of_Student, String college, String major, String year_all, String year_in, String status, String classno, String date, String remarks) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.nationality = nationality;
        this.birthday = birthday;
        this.Of_Student = of_Student;
        this.college = college;
        this.major = major;
        this.year_all = year_all;
        this.year_in = year_in;
        this.status = status;
        this.classno = classno;
        this.date = date;
        this.remarks = remarks;
    }

    public User(Long id) {
        this.id = id;
    }

    public User() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOf_Student() {
        return Of_Student;
    }

    public void setOf_Student(String of_Student) {
        Of_Student = of_Student;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear_all() {
        return year_all;
    }

    public void setYear_all(String year_all) {
        this.year_all = year_all;
    }

    public String getYear_in() {
        return year_in;
    }

    public void setYear_in(String year_in) {
        this.year_in = year_in;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
