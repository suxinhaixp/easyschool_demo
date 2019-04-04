package suxinhaixp.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Outschool")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OutSchool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long idno;
    private String classname;
    private String score;//学分

    public OutSchool(Long idno, String classname, String score) {
        this.idno = idno;
        this.classname = classname;
        this.score = score;
    }

    public OutSchool() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getIdno() {
        return idno;
    }

    public void setIdno(Long idno) {
        this.idno = idno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
