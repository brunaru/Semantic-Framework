package example.pojo;
// Generated 16.11.2009 12:22:26 by Hibernate Tools 3.2.1.GA

import thewebsemantic.annotations.Id;

/**
 * FileMetadata generated by hbm2java
 */
public class FileMetadata implements java.io.Serializable {

    @Id
    private FileMetadataId id;
    private Data data;
    private FileMetadataParams fileMetadataParams;
    private String metadataValue;

    public FileMetadata() {
    }

    public FileMetadata(FileMetadataId id, Data data, FileMetadataParams fileMetadataParams, String metadataValue) {
        this.id = id;
        this.data = data;
        this.fileMetadataParams = fileMetadataParams;
        this.metadataValue = metadataValue;
    }

    public FileMetadataId getId() {
        return this.id;
    }

    public void setId(FileMetadataId id) {
        this.id = id;
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public FileMetadataParams getFileMetadataParams() {
        return this.fileMetadataParams;
    }

    public void setFileMetadataParams(FileMetadataParams fileMetadataParams) {
        this.fileMetadataParams = fileMetadataParams;
    }

    public String getMetadataValue() {
        return this.metadataValue;
    }

    public void setMetadataValue(String metadataValue) {
        this.metadataValue = metadataValue;
    }
}


