package data.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import thewebsemantic.annotations.Id;

/**
 * FileMetadataId generated by hbm2java
 */
public class FileMetadataId implements java.io.Serializable {

    @Id
    private int fileMetadataId;
    private int dataId;

    public FileMetadataId() {
    }

    public FileMetadataId(int fileMetadataId, int dataId) {
        this.fileMetadataId = fileMetadataId;
        this.dataId = dataId;
    }

    public int getFileMetadataId() {
        return this.fileMetadataId;
    }

    public void setFileMetadataId(int fileMetadataId) {
        this.fileMetadataId = fileMetadataId;
    }

    public int getDataId() {
        return this.dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof FileMetadataId)) {
            return false;
        }
        FileMetadataId castOther = (FileMetadataId) other;

        return (this.getFileMetadataId() == castOther.getFileMetadataId()) && (this.getDataId() == castOther.getDataId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getFileMetadataId();
        result = 37 * result + this.getDataId();
        return result;
    }
}

