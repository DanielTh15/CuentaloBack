package com.example.Cuentalo.Domain.Dto;

public class Soundtrack {

    private Integer sountrackId;
    private String author;
    private String direction;


    public Integer getSountrackId() {
        return sountrackId;
    }

    public void setSountrackId(Integer sountrackId) {
        this.sountrackId = sountrackId;
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
