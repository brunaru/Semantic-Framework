package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import odml.core.Section;
import thewebsemantic.*;
import thewebsemantic.annotations.Id;
import thewebsemantic.annotations.Ignore;

/**
 * Experiment generated by hbm2java
 */
public class Experiment implements java.io.Serializable {

    @Id
    private int measurationId;
    private Weather weather;
    private Scenario scenario;
    private Person personByOwnerId;
    private ResearchGroup researchGroup;
    private Person personByPersonId;
    private Timestamp startTime;
    private Timestamp endTime;
//    @RdfProperty("http://semanticbible.org/ns/2006/NTNames#teplotka")
    private int temperature;
//    @RdfProperty("http://semanticbsible.orgsd/NTNames#pocasko")
    private String weathernote;
    private Set<MeasAddParamsValues> measAddParamsValueses = new HashSet<MeasAddParamsValues>(0);
    private Set<Hardware> hardwares = new HashSet<Hardware>(0);
    private Set<Person> persons = new HashSet<Person>(0);
    private Set<Data> datas = new HashSet<Data>(0);
    private Vector<String> testVector = new Vector<String>();
    private Section metadata;

    public Experiment() {
    }

    public Experiment(int measurationId, Weather weather, Scenario scenario, Person personByOwnerId, ResearchGroup researchGroup, Person personByPersonId) {
        this.measurationId = measurationId;
        this.weather = weather;
        this.scenario = scenario;
        this.personByOwnerId = personByOwnerId;
        this.researchGroup = researchGroup;
        this.personByPersonId = personByPersonId;
    }

    public Experiment(int measurationId, Weather weather, Scenario scenario, Person personByOwnerId, ResearchGroup researchGroup, Person personByPersonId, Timestamp startTime, Timestamp endTime, int temperature, String weathernote, Set<MeasAddParamsValues> measAddParamsValueses, Set<Hardware> hardwares, Set<Person> persons, Set<Data> datas) {
        this.measurationId = measurationId;
        this.weather = weather;
        this.scenario = scenario;
        this.personByOwnerId = personByOwnerId;
        this.researchGroup = researchGroup;
        this.personByPersonId = personByPersonId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.temperature = temperature;
        this.weathernote = weathernote;
        this.measAddParamsValueses = measAddParamsValueses;
        this.hardwares = hardwares;
        this.persons = persons;
        this.datas = datas;
    }
    
    public int getMeasurationId() {
        return this.measurationId;
    }

    public void setMeasurationId(int measurationId) {
        this.measurationId = measurationId;
    }
    
    public Weather getWeather() {
        return this.weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
    
    public Scenario getScenario() {
        return this.scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
    
    public Person getPersonByOwnerId() {
        return this.personByOwnerId;
    }

    public void setPersonByOwnerId(Person personByOwnerId) {
        this.personByOwnerId = personByOwnerId;
    }
    
    public ResearchGroup getResearchGroup() {
        return this.researchGroup;
    }

    public void setResearchGroup(ResearchGroup researchGroup) {
        this.researchGroup = researchGroup;
    }
    
    public Person getPersonByPersonId() {
        return this.personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
    
    public Timestamp getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
    
    public Timestamp getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    
    public int getTemperature() {

        return this.temperature;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
   
    public String getWeathernote() {
        return this.weathernote;
    }

    public void setWeathernote(String weathernote) {
        this.weathernote = weathernote;
    }
    
    public Set<MeasAddParamsValues> getMeasAddParamsValueses() {
        return this.measAddParamsValueses;
    }

    public void setMeasAddParamsValueses(Set<MeasAddParamsValues> measAddParamsValueses) {
        this.measAddParamsValueses = measAddParamsValueses;
    }
    
    public Set<Hardware> getHardwares() {
        return this.hardwares;
    }

    public void setHardwares(Set<Hardware> hardwares) {
        this.hardwares = hardwares;
    }
    
    public Set<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
  
    public Set<Data> getDatas() {
        return this.datas;
    }

    public void setDatas(Set<Data> datas) {
        this.datas = datas;
    }



    public Vector<String> getTestVector() {
        return testVector;
    }

    public void setTestVector(Vector<String> testVector) {
        this.testVector = testVector;
    }

    public Section getMetadata() {
        return metadata;
    }

    public void setMetadata(Section metadata) {
        this.metadata = metadata;
    }
}


