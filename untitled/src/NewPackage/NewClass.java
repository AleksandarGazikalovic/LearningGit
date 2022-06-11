package NewPackage;

import java.util.Arrays;
import java.util.Random;

public class NewClass {

    public int[] napraviNiz(int n) {
        int[] noviNiz=new int[n-1];
        Random r=new Random();
        int random=r.nextInt(n);
        System.out.println(random);
        int pom=0;
        for(int i=0;i<n-1;i++) {
            if(pom==1 || i+1==random) {
                int k=i+2;
                noviNiz[i]=k;
                pom=1;
            }
            else {
                noviNiz[i] = i+1;
            }
        }
        System.out.println(Arrays.toString(noviNiz));
        return noviNiz;
    }

    public int pronadjiUNizu(int[] niz) {
        int max=Integer.MIN_VALUE;
        for (int k : niz) {
            if (max < k) {
                max = k;
            }
        }
        int[] noviNiz=new int[max];
        int suma=0;
        int sumaNovi=0;
        for (int j : niz) suma += j;
        for(int i=0;i<max;i++) {
            noviNiz[i]=i+1;
            sumaNovi+=noviNiz[i];
        }

        return sumaNovi-suma;


    }
}
