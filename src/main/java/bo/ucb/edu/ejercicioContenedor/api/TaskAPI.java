package bo.ucb.edu.ejercicioContenedor.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.ejercicioContenedor.bl.TaskBL;
import bo.ucb.edu.ejercicioContenedor.dto.Task;

@RestController

public class TaskAPI {

    private TaskBL taskBL;

    public TaskAPI(TaskBL taskBL) {
        this.taskBL = taskBL;
    }

    @GetMapping("/api/v1/task")
    public List<Task> getTasks() {
        return taskBL.getTasks();
    }

    @PostMapping("/api/v1/task")
    public void createTask(@RequestBody Task task) {
        System.out.println("Recibiendo tarea: "+task);
        taskBL.createTask(task);
    }

    @DeleteMapping("/api/v1/task/1")
    public void deleteTask(@PathVariable int taskid) {
        taskBL.deleteTask(taskid);
    }
    
}