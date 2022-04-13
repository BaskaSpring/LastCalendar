package com.baska.calendar.Models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class ProjectStory{

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name =  "id", columnDefinition = "VARCHAR(50)",updatable = false,nullable = false)
    private String id;

    private String projectId;

    private String title;

    private Boolean isDeleted;

    private StateProject stateProject;

    private String text;

    private String userId;

    private Instant timeStamp;

    public ProjectStory(ProjectData projectData) {
        this.projectId = projectData.getProjectId();
        this.title = projectData.getTitle();
        this.isDeleted = projectData.getDeleted();
        this.stateProject = projectData.getStateProject();
        this.title = projectData.getText();
        this.userId = projectData.getUserId();
        this.timeStamp = projectData.getTimeStamp();
    }

    public ProjectStory() {
    }

    public ProjectStory(String id, String projectId, String title, Boolean isDeleted, StateProject stateProject, String text, String userId, Instant timeStamp) {
        this.id = id;
        this.projectId = projectId;
        this.title = title;
        this.isDeleted = isDeleted;
        this.stateProject = stateProject;
        this.text = text;
        this.userId = userId;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public StateProject getStateProject() {
        return stateProject;
    }

    public void setStateProject(StateProject stateProject) {
        this.stateProject = stateProject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }
}
