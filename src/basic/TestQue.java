package basic;
import java.util.Scanner;
import java.util.ArrayList;
public class TestQue {
    public static void main(String[] args) {
        ArrayList<Integer> arlist = new ArrayList<Integer>(10);
        arlist.add(22);
        arlist.add(31);
        arlist.add(27);
        arlist.add(45);
        arlist.add(98);


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        int highnum = 0;
        int lownum = arlist.get(0);
        for (int checknum : arlist) {
            if (checknum > highnum) {
                highnum = checknum;
            }
            if (checknum < lownum) {
                lownum = checknum;

            }
        }
        System.out.println(highnum + "  " + lownum);
        if (arlist.contains(num)) {
            System.out.println(String.valueOf(num) + "  number in list " + "postion of list " + arlist.indexOf(num));
        } else {
            System.out.println("number not found");
        }
        double avg = 0;
        int dr = arlist.size() - 1;
        for (int lov = arlist.size() - 1; lov >= 0; lov--) {
            System.out.println(arlist.get(lov));
            avg += arlist.get(lov);
        }

        System.out.println(avg / dr);

    }
}
