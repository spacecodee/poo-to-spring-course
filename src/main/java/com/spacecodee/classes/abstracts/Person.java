package com.spacecodee.classes.abstracts;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
@ToString
public abstract class Person {

    private int dni;
    private String name;
    private String lastName;

    protected Person() {
    }

    protected Person(int dni, String name, String lastName) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
    }

    protected void eat() {
        System.out.println("Comiendo...");
    }
}

/*
 * Admin(acceso total) | public
 * User (acceder directamente - con algunas condiciones) | protected
 * Viewer (get;set); | private
 */