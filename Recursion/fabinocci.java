public class fabinocci {

    public static int fabinocci(int n){
        if(n<=1){
            return n;
        }
        return fabinocci(n-1) + fabinocci(n-2);
    }
    public static void main(String[] args){
          System.out.println(fabinocci(4));
    }
}
