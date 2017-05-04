package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

import thewebsemantic.annotations.Id;

/**
 * Hardware generated by hbm2java
 */
public class Hardware implements java.io.Serializable {

    @Id
    private int hardwareId;
    private String title;
    private String type;
    private String descriptioin;
    private Set<Experiment> measurations = new HashSet<Experiment>(0);

    public Hardware() {
    }

    public Hardware(int hardwareId, String title, String type) {
        this.hardwareId = hardwareId;
        this.title = title;
        this.type = type;
    }

    public Hardware(int hardwareId, String title, String type, String descriptioin, Set<Experiment> measurations) {
        this.hardwareId = hardwareId;
        this.title = title;
        this.type = type;
        this.descriptioin = descriptioin;
        this.measurations = measurations;
    }

    public int getHardwareId() {
        return this.hardwareId;
    }

    public void setHardwareId(int hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescriptioin() {
        return this.descriptioin;
    }

    public void setDescriptioin(String descriptioin) {
        this.descriptioin = descriptioin;
    }

    public Set<Experiment> getMeasurations() {
        return this.measurations;
    }

    public void setMeasurations(Set<Experiment> measurations) {
        this.measurations = measurations;
    }
}


