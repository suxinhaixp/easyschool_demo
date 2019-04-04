package suxinhaixp.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="secondclass")
@JsonIgnoreProperties(ignoreUnknown = true)
public class secondclass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Long idno;
    private String decq;//学分
    private String credit;

    public secondclass(Long idno, String decq, String credit) {
        this.idno = idno;
        this.decq = decq;
        this.credit = credit;
    }

    public secondclass() {
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

    public String getDecq() {
        return decq;
    }

    public void setDecq(String decq) {
        this.decq = decq;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
