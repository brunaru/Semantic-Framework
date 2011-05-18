
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.sql.Timestamp;
import thewebsemantic.*;

/**
 * Person generated by hbm2java
 */
//@Namespace("http://www.w3c.org/prostornik/")
//@RdfType("Osoba")
//@Transitive
//@Symmetric
//@Inverse("http://www.kiv.zcu.cz/eeg/Weather")
//@VersionInfo("Stara verze")
//@OnProperty("http://www.kiv.zcu.cz/#hasMaker-Person23")
//@AllValuesFrom("http://www.kiv.zcu.cz/#Person23")
//@Comment("http://www.kiv.zcu.cz/commenttridy")
//@SeeAlso ("http://www.kiv.zcu.cz/koukniTaky_trida")
//@Label("http://www.kiv.zcu.cz/labelnadtridou")
//@Cardinality(4)
//@SomeValuesFrom("http://www.kiv.zcu.cz/nejakyHodnotyProPerson")
@EquivalentClass("http://www.kiv.zcu.cz/ekvivalentnitridaktrideHuman")
//@EquivalentProperty("http://www.kiv.zcu.cz/ekvivalentnipropertyktrideHuman")
//@SameAs("http://www.kiv.zcu.cz/stejnatridajakoHuman")
//@DifferentFrom("http://www.kiv.zcu.cz/jina_trida_Person")
@AllDifferent({"http://www.kiv.zcu.cz/Ruzne_tridy_1", "http://www.kiv.zcu.cz/Ruzne_tridy_2", "http://www.kiv.zcu.cz/Ruzne_tridy_3"})
public class Person{

    @Id
    private int personId;
    
    //@Comment("http://www.kiv.zcu.cz/comment_atributu")
    @Label("http://www.kiv.zcu.cz/givenname")
    @SeeAlso("http://www.kiv.zcu.cz/koukniTaky_atribut")
    //@IsDefinedBy("http://www.kiv.zcu.cz/isdefinedby")
    private String givenname;
    
    //@RdfProperty(symmetric=true, inverseOf="http://www.kiv.zcu.cz/eeg/Person/4")
    //@Symmetric
    //@RdfProperty(transitive=true, symmetric=true)
    //@Inverse("http://www.kiv.zcu.cz/eeg/email")
    //@DataRange("http://www.kiv.zcu.cz/datatypes/eegDef#vek")
    //@Transitive
    private String surname;
    
    private Timestamp dateOfBirth;
    
    //@DataRange("http://www.kiv.zcu.cz/datatypes/eegDef#gender")
    //@Transitive
    //@Symmetric
    //@VersionInfo("Nova verze")
    private char gender;
    private String email;
    //@DataRange("nonNegativeInteger")
    private String phoneNumber;
    private String note;
    private String username;
    private String password;
    private String authority;
    

    public Person() {
    }

    public Person(int personId, String surname, char gender) {
        this.personId = personId;
        this.surname = surname;
        this.gender = gender;
    }

    public Person(int personId, String givenname, String surname, Timestamp dateOfBirth, char gender, String email, String phoneNumber, String note, String username, String password, String authority) {
        this.personId = personId;
        this.givenname = givenname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.note = note;
        this.username = username;
        this.password = password;
        this.authority = authority;
     
    }
    
    public int getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public String getGivenname() {
        return this.givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Timestamp getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

   
}

