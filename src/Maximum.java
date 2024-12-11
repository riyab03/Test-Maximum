import java.sql.SQLOutput;

class Maxmum<E extends Comparable<E>> {
    E a, b, c;

    Maxmum(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printValue() {
        System.out.println("First Value:" + a);
        System.out.println("Second Value:" + b);
        System.out.println("Third Value:" + c);
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

}
public class Maximum{
        public static void main(String[] args) {

        //int
        Integer a1=40,b1=30,c1=10;
        Maxmum<Integer>m1=new Maxmum<>(a1,b1,c1);
        System.out.println(m1.testMaximum());

        String a2="riya",b2="bisht",c2="tata";
        Maxmum<String>m2=new Maxmum<>(a2,b2,c2);
        System.out.println(m2.testMaximum());

        Float a=10f,b=50f,c=30f;
        Maxmum<Float>m3=new Maxmum<>(a,b,c);
        System.out.println(m3.testMaximum());



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
