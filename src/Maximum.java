public class Maximum {
    public static int Comparing(int a,int b,int c){
        int maxi=a;
        if(maxi<b) {
            maxi=b;
        }
        if(maxi<c){
            maxi=c;
        }
        return maxi;
    }
    public static void main(String[] args) {
        System.out.println(Comparing(5,4,3));
        System.out.println(Comparing(5,14,3));
        System.out.println(Comparing(5,4,13));
    }
}
