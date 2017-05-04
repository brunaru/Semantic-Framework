package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import thewebsemantic.annotations.Id;

/**
 * PersonAddParamsValuesId generated by hbm2java
 */
public class PersonAddParamsValuesId implements java.io.Serializable {

    @Id
    private int personId;
    private int personAdditionalParamId;

    public PersonAddParamsValuesId() {
    }

    public PersonAddParamsValuesId(int personId, int personAdditionalParamId) {
        this.personId = personId;
        this.personAdditionalParamId = personAdditionalParamId;
    }

    public int getPersonId() {
        return this.personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonAdditionalParamId() {
        return this.personAdditionalParamId;
    }

    public void setPersonAdditionalParamId(int personAdditionalParamId) {
        this.personAdditionalParamId = personAdditionalParamId;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof PersonAddParamsValuesId)) {
            return false;
        }
        PersonAddParamsValuesId castOther = (PersonAddParamsValuesId) other;

        return (this.getPersonId() == castOther.getPersonId()) && (this.getPersonAdditionalParamId() == castOther.getPersonAdditionalParamId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getPersonId();
        result = 37 * result + this.getPersonAdditionalParamId();
        return result;
    }
}


