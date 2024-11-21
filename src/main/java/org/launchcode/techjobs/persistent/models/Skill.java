package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private Job jobs;

    public Skill(){}

    @Size(max = 500)
    private String description;

    public @Size(max = 500) String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500) String description) {
        this.description = description;
    }

    public Job getJob() {
        return jobs;
    }

    public void setJob(Job job) {
        this.jobs = jobs;
    }
}
