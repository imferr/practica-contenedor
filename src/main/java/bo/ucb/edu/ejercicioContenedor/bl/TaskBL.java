package bo.ucb.edu.ejercicioContenedor.bl;

import java.util.ArrayList;
import java.util.List;

import bo.ucb.edu.ejercicioContenedor.dto.Task;

public class TaskBL {

    List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void createTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(int taskid) {
        for(Task task : tasks) {
            if(task.getTaskid() == taskid) {
                tasks.remove(task);
                break;
            }
        }
    }

}
