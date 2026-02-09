public class Testthro {
    
    static void validate(int age){

        if(age<18){

            throw new ArithmeticException("you are not Eligible to vote");
        }

        else{
            System.out.println("WELOCOME TO VOTE");
        }
    }

    public static void main(String[] args) {
        
        try{
            validate(19);


        }
        catch(ArithmeticException e){

            System.out.println(e.getMessage());
        }

        System.out.println("Programme Will Continue ");
    }
}
