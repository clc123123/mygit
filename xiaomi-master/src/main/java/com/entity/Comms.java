package com.entity;

import lombok.Data;


@Data
public class Comms {
    private int r_id;
    private int x_id;
    private String contents;
    private String conts;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getX_id() {
        return x_id;
    }

    public void setX_id(int x_id) {
        this.x_id = x_id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getConts() {
        return conts;
    }

    public void setConts(String conts) {
        this.conts = conts;
    }
}
