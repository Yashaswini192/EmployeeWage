public class Main {
    public static void main(String[] args) {

        int isPresent = 0;
        int isAbsent = 1;
        int dailySalary;
        int workHours;
        int salaryPerHour = 20;
        int checkAttendance = (int) ((Math.random() * 10) % 2);
        if (checkAttendance == isPresent) {
            System.out.println("Employee is present");
            workHours = 8;
        } else {
            System.out.println("Employee is absent");
        workHours = 0;
    }
        dailySalary=workHours*salaryPerHour;
        System.out.println("DailySalary is:"+dailySalary);
    }
}
