package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import thewebsemantic.annotations.Id;

/**
 * PersonAddParamsValues generated by hbm2java
 */
public class PersonAddParamsValues implements java.io.Serializable {

    @Id
    private PersonAddParamsValuesId id;
    private PersonAditionalParams personAditionalParams;
    private Person person;
    private String paramValue;

    public PersonAddParamsValues() {
    }

    public PersonAddParamsValues(PersonAddParamsValuesId id, PersonAditionalParams personAditionalParams, Person person, String paramValue) {
        this.id = id;
        this.personAditionalParams = personAditionalParams;
        this.person = person;
        this.paramValue = paramValue;
    }

    public PersonAddParamsValuesId getId() {
        return this.id;
    }

    public void setId(PersonAddParamsValuesId id) {
        this.id = id;
    }

    public PersonAditionalParams getPersonAditionalParams() {
        return this.personAditionalParams;
    }

    public void setPersonAditionalParams(PersonAditionalParams personAditionalParams) {
        this.personAditionalParams = personAditionalParams;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getParamValue() {
        return this.paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}


