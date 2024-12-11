import java.util.ArrayList;
import java.util.Scanner;

class Maxmum<E extends Comparable<E>> {
    E a, b, c;
    ArrayList<E>arr;

    Maxmum(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Maxmum(ArrayList<E> arr) {
        this.arr=arr;
    }

    public E arrMaximum() {
        E maxi = arr.get(0);
        for(E a:arr) {
            if (a.compareTo(maxi) > 0) {
                maxi = a;
            }
        }
        return maxi;
    }



    public static <E extends Comparable<E>> E testMaximum(E a,E b,E c) {
        E maxi = a;
        if (b.compareTo(maxi) > 0) {
            maxi = b;
        }
        if (c.compareTo(maxi) > 0) {
            maxi = c;
        }
        return maxi;
    }


    public E testMaximum(){
        return testMaximum(a,b,c);
    }


    public void printValue() {
        System.out.println("First Value:" + a);
        System.out.println("Second Value:" + b);
        System.out.println("Third Value:" + c);
    }


}
public class Maximum{
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            ArrayList<Integer>arr=new ArrayList<>();
            int i=1;
            do {
                System.out.println("Enter array element");
                arr.add(sc.nextInt());
                System.out.println("Enter 0 to exit or 1 to continue ");
                i=sc.nextInt();
            }while(i!=0);

            Maxmum<Integer>m1=new Maxmum<>(arr);
            System.out.println("Maximum number "+m1.arrMaximum());

            ArrayList<String>a1=new ArrayList<>();
            i=1;
            do {
                System.out.println("Enter array element");
                a1.add(sc.next());
                System.out.println("Enter 0 to exit or 1 to continue ");
                i=sc.nextInt();
            }while(i!=0);

            Maxmum<String>m=new Maxmum<>(a1);
            System.out.println("Maximum element "+m.arrMaximum());

        //int
//        Integer a1=40,b1=30,c1=10;
//        Maxmum<Integer>m1=new Maxmum<>(a1,b1,c1);
//        System.out.println(m1.testMaximum());
//
//        String a2="riya",b2="bisht",c2="tata";
//        Maxmum<String>m2=new Maxmum<>(a2,b2,c2);
//        System.out.println(m2.testMaximum());
//
//        Float a=10f,b=50f,c=30f;
//        Maxmum<Float>m3=new Maxmum<>(a,b,c);
//        System.out.println(m3.testMaximum());



//        System.out.println(Comparing(a1,b1,c1));
//        System.out.println(Comparing(b1,a1,c1));
//        System.out.println(Comparing(b1,c1,a1));

        //float
//        float a=10,b=50,c=30;
//        System.out.println(Comparing(a,b,c));
//        System.out.println(Comparing(b,a,c));
//        System.out.println(Comparing(c,a,b));

        //string
//        String a2="Apple",b2="Peach",c2="Banana";
//        System.out.println(Comparing(a2,b2,c2));
//        System.out.println(Comparing(b2,a2,c2));
//        System.out.println(Comparing(c2,a2,b2));
    }
}
