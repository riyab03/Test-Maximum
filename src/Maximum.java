public class Maximum {
    public  static <E extends Comparable<E>> E Comparing(E a,E b,E c){
        E maxi=a;
        if(b.compareTo(maxi)>0) {
            maxi=b;
        }
        if(c.compareTo(maxi)>0){
            maxi=c;
        }
        return maxi;
    }
    public static void main(String[] args) {

        //int
        Integer a1=40,b1=30,c1=10;
        System.out.println(Comparing(a1,b1,c1));
        System.out.println(Comparing(b1,a1,c1));
        System.out.println(Comparing(b1,c1,a1));

        //float
        float a=10,b=50,c=30;
        System.out.println(Comparing(a,b,c));
        System.out.println(Comparing(b,a,c));
        System.out.println(Comparing(c,a,b));

        //string
        String a2="Apple",b2="Peach",c2="Banana";
        System.out.println(Comparing(a2,b2,c2));
        System.out.println(Comparing(b2,a2,c2));
        System.out.println(Comparing(c2,a2,b2));
    }
}
