package com.example.Cuentalo.Domain.Dto;

public class Soundtrack {

    private Integer soundtrackId;
    private String author;
    private String direction;


    public Integer getSoundtrackId() {
        return soundtrackId;
    }

    public void setSoundtrackId(Integer soundtrackId) {
        this.soundtrackId = soundtrackId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
