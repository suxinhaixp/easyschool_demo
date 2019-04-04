package suxinhaixp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="SelfRepairClassroom")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelfRepairClassroom {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    private String classroomname;
    private String number;
    private String area;

    public SelfRepairClassroom(String classroomname, String number, String area) {
        this.classroomname = classroomname;
        this.number = number;
        this.area = area;
    }

    public SelfRepairClassroom() {
    }

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
