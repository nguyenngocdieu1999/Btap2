package bt2;


public class Developer extends Employee {

    
    public Developer() {
    }

    public Developer(int id, String name, String username, String password, int managerId, int numTasks, String taskIn) {
        this.setId(id);
        this.setName(name);
        this.setUsername(username);
        this.setPassword(password);
        this.setManagerId(managerId);
        this.setNumTasks(numTasks);
        this.setTaskIn(taskIn);
    }


    
    public void nextStep(Task task) {
        switch (task.getStatus()) {
            case "AS":
                {
                    System.out.println("Assigned -> Started");
                    String s = getName() + ": Task ID = " + task.getId() + " Assigned -> Started";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            case "SC":
                {
                    System.out.println("Started -> Completed");
                    String s = getName() + ": Task ID = " + task.getId() + " Started -> Completed";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            case "RS":
                {
                    System.out.println("Reject -> Started");
                    String s = getName() + ": Task ID = " + task.getId() + " Reject -> Started";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            default:
                System.out.println("Developer không thể thực hiện thao tác này!");
                break;
        }
    }
}
