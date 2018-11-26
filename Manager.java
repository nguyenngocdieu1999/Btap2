package bt2;

import java.util.Scanner;


public class Manager extends User {

    
    public Manager() {
    }

    public Manager(int id, String name, String username, String password) {
        super(id, name, username, password);
    }


    
    public void nextStep(Task task) {
        Scanner sc = new Scanner(System.in);
        switch (task.getStatus()) {
            case "C":
                {
                    System.out.println("Nhập ngày tạo Task: ");
                    String createdDate = sc.next();
                    task.setCreatedDate(createdDate);
                    System.out.println("Task đã được tạo");
                    String s = getName() + ": created a Task";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            case "CA":
                {
                    System.out.println("Created -> Assigned");
                    String s = getName() + ": Task ID = " + task.getId() + " Created -> Assigned";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            case "DC":
                {
                    System.out.println("Nhập ngày kết thúc: ");
                    String endDate = sc.next();
                    task.setEndDate(endDate);
                    System.out.println("Done -> Close");
                    String s = getName() + ": Task ID = " + task.getId() + " Done -> Close";
                    taskActionLogToText("taskActionLog.txt", s);
                    break;
                }
            default:
                System.out.println("Manager không thể thực hiện thao tác này!");
                break;
        }
    }
}
