package com.spacecodee.classes.abstracts;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Ingeniero extends Person {

    private String job;
    private short yearsExperience;
    private String[] skills;

    public Ingeniero(int dni, String name, String lastName, String job, short yearsExperience, String[] skills) {
        super(dni, name, lastName);
        this.job = job;
        this.yearsExperience = yearsExperience;
        this.skills = skills;
    }

    public String getFullName() {
        return super.getName() + " " + super.getLastName();
    }
}
