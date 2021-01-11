package _02_java_loop_array;

public class TestDayNumber {

    public static void main(String[] args) {
        int month = 1;
        int dayInMonth = 0;

        switch(month) {
            case 1:
            case 3:
            case 5:
                dayInMonth = 31;
                break;
            case 2:
                dayInMonth = 28;
                //if else leap year
                break;
            case 4:
                dayInMonth = 30;
                break;
        }
    }

}
