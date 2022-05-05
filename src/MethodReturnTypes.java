public class MethodReturnTypes {
    public static void main(String[] args){

        System.out.println(typeString());
        System.out.println(typeInteger(2));
        System.out.println(typeBoolean(25));

    }

    public static String typeString(){
        
        return "String of text";
    }

    public static int typeInteger(int num){

        return num += 10;
    }

    public static boolean typeBoolean(int age){
        
        return age > 18;
    }
    
}
