package suxinhaixp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="score")
@JsonIgnoreProperties(ignoreUnknown = true)


public @Data class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long idno;
    private String classcode;
    private String classname;
    private String decq;//学分
    private String daily_score;//平时成绩
    private String middle_score;//期中
    private String last_score;//期末
    private String all_score;
    private Long term;//学期


    public Score(Long idno, String classcode, String classname, String decq, String daily_score, String middle_score, String last_score, String all_score, Long term) {
        this.idno = idno;
        this.classcode = classcode;
        this.classname = classname;
        this.decq = decq;
        this.daily_score = daily_score;
        this.middle_score = middle_score;
        this.last_score = last_score;
        this.all_score = all_score;
        this.term = term;
    }

    public Long getIdno() {
        return idno;
    }

    public void setIdno(Long idno) {
        this.idno = idno;
    }

    public Score() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDecq() {
        return decq;
    }

    public void setDecq(String decq) {
        this.decq = decq;
    }

    public String getDaily_score() {
        return daily_score;
    }

    public void setDaily_score(String daily_score) {
        this.daily_score = daily_score;
    }

    public String getMiddle_score() {
        return middle_score;
    }

    public void setMiddle_score(String middle_score) {
        this.middle_score = middle_score;
    }

    public String getLast_score() {
        return last_score;
    }

    public void setLast_score(String last_score) {
        this.last_score = last_score;
    }

    public String getAll_score() {
        return all_score;
    }

    public void setAll_score(String all_score) {
        this.all_score = all_score;
    }

    public Long getTerm() {
        return term;
    }

    public void setTerm(Long term) {
        this.term = term;
    }
}
