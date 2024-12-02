public class Maximum {
    public static Float Comparing(Float a,Float b,Float c){
        Float maxi=a;
        if(b.compareTo(maxi)>0) {
            maxi=b;
        }
        if(c.compareTo(maxi)>0){
            maxi=c;
        }
        return maxi;
    }
    public static Integer Comparing(Integer a,Integer b,Integer c){
        Integer maxi=a;
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
        int a1=40,b1=30,c1=10;
        System.out.println(Comparing(a1,b1,c1));
        System.out.println(Comparing(b1,a1,c1));
        System.out.println(Comparing(b1,c1,a1));

        //float
        float a=10,b=50,c=30;
        System.out.println(Comparing(a,b,c));


    }
}
