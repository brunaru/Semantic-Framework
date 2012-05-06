package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

import thewebsemantic.annotations.Id;
import thewebsemantic.annotations.TransitiveProperty;

/**
 * Weather generated by hbm2java
 */
public class Weather implements java.io.Serializable {

    @Id
    private int weatherId;
    private String description;
    private String title;
    private Set<Measuration> measurations = new HashSet<Measuration>(0);

    public Weather() {
    }

    public Weather(int weatherId, String title) {
        this.weatherId = weatherId;
        this.title = title;
    }

    public Weather(int weatherId, String description, String title, Set<Measuration> measurations) {
        this.weatherId = weatherId;
        this.description = description;
        this.title = title;
        this.measurations = measurations;
    }

    public int getWeatherId() {
        return this.weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Set<Measuration> getMeasurations() {
        return this.measurations;
    }
    
    public void setMeasurations(Set<Measuration> measurations) {
        this.measurations = measurations;
    }
}

