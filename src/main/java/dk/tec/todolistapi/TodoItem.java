package dk.tec.todolistapi;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

enum TypeTask {CLEANING, COOKING, YARDWORK, TELEVISION, PLANNING, COALMINING}

enum Priority {HIGH, NORMAL, LOW}

@Entity
public class TodoItem {
    @Id @GeneratedValue
    int Id;
    String name;
    String imageBeforeFile;
    String imageAfterFile;
    String description;
    LocalDateTime plannedStartTime;
    LocalDateTime plannedEndTime;
    LocalDateTime startTime;
    LocalDateTime endTime;
    int ticksSpend;
    TypeTask typeTask;

    //Location location;
    @OneToMany
    List<TodoItem> todoItemsBlockersList;
    Boolean isCompleted = false;
    Boolean isRepeatable;
    int xp;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageBeforeFile() {
        return imageBeforeFile;
    }

    public void setImageBeforeFile(String imageBeforeFile) {
        this.imageBeforeFile = imageBeforeFile;
    }

    public String getImageAfterFile() {
        return imageAfterFile;
    }

    public void setImageAfterFile(String imageAfterFile) {
        this.imageAfterFile = imageAfterFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(LocalDateTime plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public LocalDateTime getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(LocalDateTime plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getTicksSpend() {
        return ticksSpend;
    }

    public void setTicksSpend(int ticksSpend) {
        this.ticksSpend = ticksSpend;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public List<TodoItem> getTodoItemsBlockersList() {
        return todoItemsBlockersList;
    }

    public void setTodoItemsBlockersList(List<TodoItem> todoItemsBlockersList) {
        this.todoItemsBlockersList = todoItemsBlockersList;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Boolean getRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(Boolean repeatable) {
        isRepeatable = repeatable;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
