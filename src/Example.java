public class Example {
    public static void main(String[] args) {

        int isPresent = 0;
        int isAbsent = 1;
        int dailySalary;
        int workHours;
        int salaryPerHour = 20;
        int partTime = 8;
        int checkAttendance = (int) ((Math.random() * 10) % 2);
        switch (checkAttendance) {
            case 1:
                System.out.println("employee is present");
                break;
            case 2:
                System.out.println("employee is absent");
                break;
            case 3:
                System.out.println("employee is working part time");
                break;
            default:
                System.out.println("Looking for employee");
        }
    }
}