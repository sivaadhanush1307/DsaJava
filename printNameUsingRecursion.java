class printNameUsingRecursion{
    static int count = 0;
    static void printName(){
        if(count==5){
            return;
        }
        System.out.println("Dhanush");
        count++;
        printName();
    }


    public static void main(String[] args){
        printName();
    }
}