package bo.ucb.edu.ejercicioContenedor.dto;

import java.util.Date;

public class Task {
    private Integer taskid;
    private String name;
    private Date dueDate;
    private String status;

    public Task() {
    }

    public Task(Integer taskid, String name, Date dueDate, String status) {
        this.taskid = taskid;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Integer getTaskid() {
        return this.taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}