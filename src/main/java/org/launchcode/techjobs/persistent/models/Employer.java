package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(){}

    @NotBlank
    @Size(min = 3, max = 75, message = "Location must be between 3 and 75 characters.")
    private String location;

    public @NotBlank @Size(min = 3, max = 75, message = "Location must be between 3 and 75 characters.") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 75, message = "Location must be between 3 and 75 characters.") String location) {
        this.location = location;
    }
}
