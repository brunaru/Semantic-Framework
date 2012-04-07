package data.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

import thewebsemantic.annotations.Id;

/**
 * ResearchGroup generated by hbm2java
 */
public class ResearchGroup implements java.io.Serializable {

    @Id
    private int researchGroupId;
    private Person person;
    private String title;
    private String description;
    private Set<Scenario> scenarios = new HashSet<Scenario>(0);
    private Set<Measuration> measurations = new HashSet<Measuration>(0);
    private Set<ResearchGroupMembership> researchGroupMemberships = new HashSet<ResearchGroupMembership>(0);

    public ResearchGroup() {
    }

    public ResearchGroup(int researchGroupId, Person person, String title, String description) {
        this.researchGroupId = researchGroupId;
        this.person = person;
        this.title = title;
        this.description = description;
    }

    public ResearchGroup(int researchGroupId, Person person, String title, String description, Set<Scenario> scenarios, Set<Measuration> measurations, Set<ResearchGroupMembership> researchGroupMemberships) {
        this.researchGroupId = researchGroupId;
        this.person = person;
        this.title = title;
        this.description = description;
        this.scenarios = scenarios;
        this.measurations = measurations;
        this.researchGroupMemberships = researchGroupMemberships;
    }

    public int getResearchGroupId() {
        return this.researchGroupId;
    }

    public void setResearchGroupId(int researchGroupId) {
        this.researchGroupId = researchGroupId;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Scenario> getScenarios() {
        return this.scenarios;
    }

    public void setScenarios(Set<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    public Set<Measuration> getMeasurations() {
        return this.measurations;
    }

    public void setMeasurations(Set<Measuration> measurations) {
        this.measurations = measurations;
    }

    public Set<ResearchGroupMembership> getResearchGroupMemberships() {
        return this.researchGroupMemberships;
    }

    public void setResearchGroupMemberships(Set<ResearchGroupMembership> researchGroupMemberships) {
        this.researchGroupMemberships = researchGroupMemberships;
    }
}

