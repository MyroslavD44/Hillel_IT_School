package Dz4;

import java.util.Calendar;
public class Monthly {
    public static void main(String[] args) {
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        for (int i = 0; i < 12; i++) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONTH, i);
            int numDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            int numWeekends = 0;
            int numWorkingDays = 0;
            for (int j = 1; j <= numDays; j++) {
                cal.set(Calendar.DAY_OF_MONTH, j);
                int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
                if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                    numWeekends++;
                } else {
                    numWorkingDays++;
                }
            }


            double monthlySalary = a * numWorkingDays * 8;
            double monthlySalaryWithoutTax = monthlySalary / (1 + b / 100.0);
            System.out.printf("%s %.2f %.2f%n", months[i], monthlySalaryWithoutTax, monthlySalary);
        }


        double totalSalary = 0.0;
        double totalSalaryWithoutTax = 0.0;
        for (int i = 0; i < 12; i++) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONTH, i);
            int numDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            int numWeekends = 0;
            int numWorkingDays = 0;
            for (int j = 1; j <= numDays; j++) {
                cal.set(Calendar.DAY_OF_MONTH, j);
                int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
                if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                    numWeekends++;
                } else {
                    numWorkingDays++;
                }
            }

            double monthlySalary = a * numWorkingDays * 8;
            double monthlySalaryWithoutTax = monthlySalary / (1 + b / 100.0);
            totalSalary += monthlySalary;
            totalSalaryWithoutTax += monthlySalaryWithoutTax;
        }

        System.out.printf("Year %.2f %.2f%n", totalSalaryWithoutTax, totalSalary);
    }
}




















