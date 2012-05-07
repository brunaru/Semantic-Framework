package example.pojo;

// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import thewebsemantic.*;
import thewebsemantic.annotations.AllValuesFrom;
import thewebsemantic.annotations.Comment;
import thewebsemantic.annotations.ComplementOf;
import thewebsemantic.annotations.DataRange;
import thewebsemantic.annotations.DisjointWith;
import thewebsemantic.annotations.EquivalentClass;
import thewebsemantic.annotations.EquivalentProperty;
import thewebsemantic.annotations.FunctionalProperty;
import thewebsemantic.annotations.HasValue;
import thewebsemantic.annotations.Id;
import thewebsemantic.annotations.InverseFunctionalProperty;
import thewebsemantic.annotations.InverseOf;
import thewebsemantic.annotations.IsDefinedBy;
import thewebsemantic.annotations.Label;
import thewebsemantic.annotations.MaxCardinality;
import thewebsemantic.annotations.Namespace;
import thewebsemantic.annotations.SeeAlso;
import thewebsemantic.annotations.SomeValuesFrom;
import thewebsemantic.annotations.SymmetricProperty;
import thewebsemantic.annotations.Ignore;
import thewebsemantic.annotations.TransitiveProperty;
import thewebsemantic.annotations.VersionInfo;


/**
 * Person generated by hbm2java
 */
@Comment(value="Jednotlivé instance třídy odpovídají jednotlivým osobám.", lang="cs")
@SeeAlso("http://www.nejaka.adresa.cz/podobne_tema")
@Label("Person (osoba)")
@VersionInfo("Stará verze třídy Person")
@Namespace("http://www.moje.namespace")

// @RdfType("Osoba")
@EquivalentClass("http://www.jina.adresa.cz/Human")
// @Deprecated
@DisjointWith("http://kiv.zcu.cz/pojo#Animal")
@ComplementOf("http://kiv.zcu.cz#nonPerson")
public class Person implements java.io.Serializable {

	@Id
	private int personId;


	@Comment(value="Komentář ke křestnímu jménu.", lang="cs")
	@Label(value="Křestní jméno", lang="cs")
	@SeeAlso("http://www.kiv.zcu.cz/koukniTaky_atribut")
	@IsDefinedBy("http://www.kiv.zcu.cz/isdefinedby")
	@EquivalentProperty("http://www.jina.adresa.cz/ontologie#krestni_jmeno")
	//@SomeValuesFrom(uri="http://www.nejaka.adresa.cz/ceskaJmena")
	//@AllValuesFrom(uri="http://ontology#names")
	//@HasValue(stringValue="Jakub")
	private String givenname;


	// @RdfProperty(symmetric=true,inverseOf="http://www.kiv.zcu.cz/eeg/Person/4")
	// @Symmetric
	// @RdfProperty(transitive=true, symmetric=true)
	@InverseOf("http://www.kiv.zcu.cz/eeg/email")
	// @DataRange("http://www.kiv.zcu.cz/datatypes/eegDef#vek")
	// @Transitive
	// @AllValuesFrom("http://www.jina.adresa.cz/#vsechna_prijmeni")
	// @Cardinality(1)
	@EquivalentProperty("http://www.jina.adresa.cz/ontologie#prijmeni")
	// @Id
	@FunctionalProperty
	private String surname;	
	
	private Timestamp dateOfBirth;

	@AllValuesFrom(charValues={'M', 'F'})
	private char gender;
	
	@InverseFunctionalProperty
	private Person partner;
	
	// @Deprecated
	private String email;
	@DataRange("nonNegativeInteger")
	private String phoneNumber;
	private String note;
	private String username;
	
	@Ignore
	private String password = "sdvffhbcbgfjhgnvbgn";
	
	private String authority;
	private Set<Measuration> measurationsForOwnerId = new HashSet<Measuration>(0);
	
	@SymmetricProperty
	private Set<Scenario> scenarios = new HashSet<Scenario>(0);
	
	private Set<PersonAddParamsValues> personAddParamsValueses = new HashSet<PersonAddParamsValues>(
			0);
	private Set<ResearchGroupMembership> researchGroupMemberships = new HashSet<ResearchGroupMembership>(
			0);
	
	//@MaxCardinality(3)
	private Set<EyesDefect> eyesDefects = new HashSet<EyesDefect>(0);
	private Set<Measuration> measurationsForPersonId = new HashSet<Measuration>(0);
	private Set<ResearchGroup> researchGroups = new HashSet<ResearchGroup>(0);
	private Set<Measuration> measurations = new HashSet<Measuration>(0);
	private Set<HearingDefect> hearingDefects = new HashSet<HearingDefect>(0);


	public Person() {
	}


	public Person(int personId, String surname, char gender) {
		this.personId = personId;
		this.surname = surname;
		this.gender = gender;
	}


	public Person(int personId, String givenname, String surname, Timestamp dateOfBirth,
			char gender, String email, String phoneNumber, String note, String username,
			String password, String authority, Set<Measuration> measurationsForOwnerId,
			Set<Scenario> scenarios, Set<PersonAddParamsValues> personAddParamsValueses,
			Set<ResearchGroupMembership> researchGroupMemberships, Set<EyesDefect> eyesDefects,
			Set<Measuration> measurationsForPersonId, Set<ResearchGroup> researchGroups,
			Set<Measuration> measurations, Set<HearingDefect> hearingDefects) {
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
		this.measurationsForOwnerId = measurationsForOwnerId;
		this.scenarios = scenarios;
		this.personAddParamsValueses = personAddParamsValueses;
		this.researchGroupMemberships = researchGroupMemberships;
		this.eyesDefects = eyesDefects;
		this.measurationsForPersonId = measurationsForPersonId;
		this.researchGroups = researchGroups;
		this.measurations = measurations;
		this.hearingDefects = hearingDefects;
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


	public Set<Measuration> getMeasurationsForOwnerId() {
		return this.measurationsForOwnerId;
	}


	public void setMeasurationsForOwnerId(Set<Measuration> measurationsForOwnerId) {
		this.measurationsForOwnerId = measurationsForOwnerId;
	}


	public Set<Scenario> getScenarios() {
		return this.scenarios;
	}


	public void setScenarios(Set<Scenario> scenarios) {
		this.scenarios = scenarios;
	}


	public Set<PersonAddParamsValues> getPersonAddParamsValueses() {
		return this.personAddParamsValueses;
	}


	public void setPersonAddParamsValueses(Set<PersonAddParamsValues> personAddParamsValueses) {
		this.personAddParamsValueses = personAddParamsValueses;
	}


	public Set<ResearchGroupMembership> getResearchGroupMemberships() {
		return this.researchGroupMemberships;
	}


	public void setResearchGroupMemberships(Set<ResearchGroupMembership> researchGroupMemberships) {
		this.researchGroupMemberships = researchGroupMemberships;
	}


	public Set<EyesDefect> getEyesDefects() {
		return this.eyesDefects;
	}


	public void setEyesDefects(Set<EyesDefect> eyesDefects) {
		this.eyesDefects = eyesDefects;
	}


	public Set<Measuration> getMeasurationsForPersonId() {
		return this.measurationsForPersonId;
	}


	public void setMeasurationsForPersonId(Set<Measuration> measurationsForPersonId) {
		this.measurationsForPersonId = measurationsForPersonId;
	}


	public Set<ResearchGroup> getResearchGroups() {
		return this.researchGroups;
	}


	public void setResearchGroups(Set<ResearchGroup> researchGroups) {
		this.researchGroups = researchGroups;
	}


	public Set<Measuration> getMeasurations() {
		return this.measurations;
	}


	public void setMeasurations(Set<Measuration> measurations) {
		this.measurations = measurations;
	}


	public Set<HearingDefect> getHearingDefects() {
		return this.hearingDefects;
	}


	public void setHearingDefects(Set<HearingDefect> hearingDefects) {
		this.hearingDefects = hearingDefects;
	}
}
