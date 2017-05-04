package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

import thewebsemantic.annotations.Id;

/**
 * HearingDefect generated by hbm2java
 */
public class HearingDefect implements java.io.Serializable {

    @Id
    private int hearingDefectId;
    private String description;
    private Set<Person> persons = new HashSet<Person>(0);

    public HearingDefect() {
    }

    public HearingDefect(int hearingDefectId, String description) {
        this.hearingDefectId = hearingDefectId;
        this.description = description;
    }

    public HearingDefect(int hearingDefectId, String description, Set<Person> persons) {
        this.hearingDefectId = hearingDefectId;
        this.description = description;
        this.persons = persons;
    }

    public int getHearingDefectId() {
        return this.hearingDefectId;
    }

    public void setHearingDefectId(int hearingDefectId) {
        this.hearingDefectId = hearingDefectId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}


