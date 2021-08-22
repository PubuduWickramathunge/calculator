package V2;

public class V2Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }
        String operator = args[0];

        if(!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))){
            System.out.println("please provide add or sub or mul as operator argument");
            return;
        }
        System.out.println(args[0]);
    }
}
