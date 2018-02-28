package com.example.amyas.frameintegration.db;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * author: Amyas
 * date: 2017/12/21
 */
@Entity
public class FrameBean {
    @Id
    private long id;
    private String name;

    @Override
    public String toString() {
        return "FrameBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
