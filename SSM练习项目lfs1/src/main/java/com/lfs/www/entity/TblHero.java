package com.lfs.www.entity;

public class TblHero {
    private Integer id;

    private String name;

    private String srcPhoto;

    private String srcVideo;

    private String instruction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSrcPhoto() {
        return srcPhoto;
    }

    public void setSrcPhoto(String srcPhoto) {
        this.srcPhoto = srcPhoto == null ? null : srcPhoto.trim();
    }

    public String getSrcVideo() {
        return srcVideo;
    }

    public void setSrcVideo(String srcVideo) {
        this.srcVideo = srcVideo == null ? null : srcVideo.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }
}