package dataStructures;

import java.time.LocalDateTime;

public class HashableObject {
    private String name;
    private LocalDateTime timeOfCreation;
    // 1 - 10
    private Integer priorityLevel;

    public HashableObject(String name, Integer priorityLevel) {
        this.name = name;
        this.timeOfCreation = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public LocalDateTime getTimeOfCreation() {

        return timeOfCreation;
    }

    public void setTimeOfCreation(LocalDateTime timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }


}
