class car{

    private String Company_name ;

    private String Model_number;

    private int year;
 
    public void Setter(String Company_name,String Model_number,int year){

        this.Company_name=Company_name;
         this.Model_number = Model_number;
        this.year = year;

    } 

    public void getter(){
        System.out.println("The Company name is "+Company_name);
         System.out.println("Model number : "+Company_name);
          System.out.println("The year of car : "+year);

    }
    
}

public class CAR {

    public static void main(String[] args){

        car C =new car();
        C.Setter("HONDA", "5", 2025);
        C.getter();
    }
    
}
