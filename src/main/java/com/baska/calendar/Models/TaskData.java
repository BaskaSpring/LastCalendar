package com.baska.calendar.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class TaskData {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name =  "id", columnDefinition = "VARCHAR(50)",updatable = false,nullable = false)
    private String id;

    private String taskId;

    private String title;

    private Boolean isDeleted;

    private StateTusk stateTusk;

    private String text;

    private String userId;

    private Instant timeStamp;

    void init(){
        this.isDeleted = false;
        this.timeStamp = Instant.now();
        this.stateTusk = StateTusk.INWORK;
    }

    public TaskData(String id, String taskId, String title, Boolean isDeleted, StateTusk stateTusk, String text, String userId, Instant timeStamp) {
        this.id = id;
        this.taskId = taskId;
        this.title = title;
        this.isDeleted = isDeleted;
        this.stateTusk = stateTusk;
        this.text = text;
        this.userId = userId;
        this.timeStamp = timeStamp;
    }

    public TaskData() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
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

    public StateTusk getStateTusk() {
        return stateTusk;
    }

    public void setStateTusk(StateTusk stateTusk) {
        this.stateTusk = stateTusk;
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
