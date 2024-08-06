import java.util.*;

class Task {
    private String title;
    private String creator;
    private String assignee;
    private String status;
    private String type;
    private List<String>  additionalInfo;
    private String severity;


    public Task(String title, String creator, String assignee, String status, String type,List<String> additionalInfo,String severity) {
        this.title = title;
        this.creator = creator;
        this.assignee = assignee;
        this.status = status;
        this.type = type;
        this.severity = severity;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public List<String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", creator='" + creator + '\'' +
                ", assignee='" + assignee + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", additionalInfo='" + type + '\'' +
                '}';
    }
}

public class TaskPlannerArhamFlipkart {
    private Map<String, List<Task>> taskMap;

    public TaskPlannerArhamFlipkart() {
        this.taskMap = new HashMap<>();
    }

    public void createTask(String title, String creator, String assignee, String status, String type, List<String> info,String severity) {
        Task task = null;
        switch (type) {
            case "Feature":
                task = new Task(title, creator, assignee, status, type, info, severity);
                break;
            case "Bug":
                task = new Task(title, creator, assignee, status, type, null, severity);
                break;
            default:
                System.out.println("The tasks shall be selected as Feature or a Bug");
        }
        if (this.taskMap.containsKey(assignee)) {
            List<Task> tasks = this.taskMap.get(assignee);
            tasks.add(task);
        } else {
            List<Task> tasks = new ArrayList<>();
            tasks.add(task);
            this.taskMap.put(assignee, tasks);
        }
    }

    public void changeStatus(String assignee, String title, String newStatus) {
        if (this.taskMap.containsKey(assignee)) {
            List<Task> tasks = this.taskMap.get(assignee);
            for (Task task : tasks) {
                if (task.getTitle().equals(title)) {
                    task.setStatus(newStatus);
                    break;
                }
            }
        }
    }

    public void changeAssignee(String currentAssignee, String newAssignee, String title) {
        if (this.taskMap.containsKey(currentAssignee)) {
            List<Task> tasks = this.taskMap.get(currentAssignee);
            for (Task task : tasks) {
                if (task.getTitle().equals(title)) {
                    task.setAssignee(newAssignee);
                    if (this.taskMap.containsKey(newAssignee)) {
                        List<Task> newTasks = this.taskMap.get(newAssignee);
                        newTasks.add(task);
                    } else {
                        List<Task> newTasks = new ArrayList<>();
                        newTasks.add(task);
                        this.taskMap.put(newAssignee, newTasks);
                    }
                    tasks.remove(task);
                    break;
                }
            }
        }
    }

    public List<Task> getTasksForAssignee(String assignee) {
        if (this.taskMap.containsKey(assignee)) {
            return this.taskMap.get(assignee);
        }
        return null;
    }

    public static void main(String [] args){
        TaskPlannerArhamFlipkart tp = new TaskPlannerArhamFlipkart();

        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter 1 for creating, 2 for changing the status 3 for changing the assignee and 4 for getting the tasks for the particular assignee");

        tp.createTask("New task","Arham","Dell","Open","Bug",null,"P0");
        List<Task> arham = tp.getTasksForAssignee("Dell");
        System.out.println(arham.toString());
    }
}


