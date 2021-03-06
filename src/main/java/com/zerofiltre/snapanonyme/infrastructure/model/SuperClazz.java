package com.zerofiltre.snapanonyme.infrastructure.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperClazz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public SuperClazz() {
    }

    public SuperClazz(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
