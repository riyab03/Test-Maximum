public class Maximum {
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
        System.out.println(Comparing(5,4,3));
        System.out.println(Comparing(5,14,3));
        System.out.println(Comparing(5,14,33));
    }
}
