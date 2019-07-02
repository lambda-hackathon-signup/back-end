package com.lambdaschool.hackathon.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectid;

    private String title;

    private String description;

    private String targetgroup;

   @OneToMany(mappedBy = "project",
              cascade = CascadeType.ALL,
                orphanRemoval = true   )
    @JsonIgnoreProperties("project")
    private List<User> users = new ArrayList<>();
}
