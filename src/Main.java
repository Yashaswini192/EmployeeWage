public class Main {
    public static void main(String[] args){

        int isPresent = 0;
        int isAbsent = 1;
        int salaryPerHour = 20;
        int workHours=16;
        int checkAttendance = (int) ((Math.random() * 10) % 2);
        switch (checkAttendance) {
            case 1 -> {
                workHours = 16;
                System.out.println("employee is present");
            }
            case 2 -> {
                workHours = 0;
                System.out.println("employee is absent");
            }
            case 3 -> {
                workHours = 8;
                System.out.println("employee is working part time");
            }
            default -> System.out.println("  ");
        }
        int dailySalary = workHours * salaryPerHour;
        System.out.println("DailySalary is:"+dailySalary);
    }

}
