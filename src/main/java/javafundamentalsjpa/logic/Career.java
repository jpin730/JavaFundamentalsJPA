package javafundamentalsjpa.logic;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;

    @OneToMany(mappedBy = "career")
    private LinkedList<Subject> subjects;

    public Career() {
    }

    public Career(String name, LinkedList<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(LinkedList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Career{" + "id=" + id + ", name=" + name + ", subjects=" + subjects + '}';
    }

}
