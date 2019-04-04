package suxinhaixp.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="lesson")
@JsonIgnoreProperties(ignoreUnknown = true)
public class lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long idno;
    private String classcode;
    private String classname;
    private String decq;//学分
    private Long term;//学期
    private String time;

    public lesson(Long idno, String classcode, String classname, String decq, Long term, String time) {
        this.idno = idno;
        this.classcode = classcode;
        this.classname = classname;
        this.decq = decq;
        this.term = term;
        this.time = time;
    }

    public lesson() {
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

    public Long getTerm() {
        return term;
    }

    public void setTerm(Long term) {
        this.term = term;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
