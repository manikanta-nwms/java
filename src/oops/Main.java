package oops;

public class Main {
    public static void main(String args[]){
    //Calculater cal = new Calculater();
    SientificCal scal = new SientificCal();
    scal.firstnum = 20;
    scal.secondnum = 30;
    scal.angle =45;
    double res = scal.add();
    System.out.println(res);
    System.out.println(scal.sinval());
    }
}