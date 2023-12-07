package designpatterns.facade;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".")+1);
    }

    public String getCodeType() {
        return this.codecType;
    }

    public String getName() {
        return this.name;
    }
}