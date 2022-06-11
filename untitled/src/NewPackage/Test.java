package NewPackage;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        NewClass novi=new NewClass();
        Random r=new Random();
        int random=r.nextInt(100);
       int[] newArray=novi.napraviNiz(random);
       int broj=novi.pronadjiUNizu(newArray);
        System.out.println(broj);
    }

}
