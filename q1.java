interface Shape{

   void  get_area();


}

class rectangle implements Shape{

    int A;
    int B;


    rectangle(int A,int B){

        this.A=A;
        this.B=B;
    }

    public void get_area(){

        System.out.println("The Area of Retangle : "+A*B);

    }}

    class circle implements Shape{

           int R;



    circle(int R){

        this.R=R;
        
    }

    public void get_area(){

        System.out.println("The Area of Circle : "+R*R);

     } }




public class q1 {

    public static void main(String[] args) {
        
       Shape S = new rectangle(7, 4);
       Shape C=new circle(7);

       S.get_area();
       C.get_area();
    }
}
