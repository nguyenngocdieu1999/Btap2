package bt2;


public class Tester extends Employee {

    
    public Tester() {
    }

    public Tester(int id, String name, String username, String password, int managerId, int numTasks, String taskIn) {
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
            case "CD":
                {
                    System.out.println("Complete -> Done");
                    String s = getName() + ": Task ID = " + task.getId() + " Complete -> Done";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            case "CR":
                {
                    System.out.println("Complete -> Reject");
                    String s = getName() + ": Task ID = " + task.getId() + " Complete -> Reject";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            default:
                System.out.println("Tester không thể thực hiện thao tác này!");
                break;
        }
    }
}
