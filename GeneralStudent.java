package Package1;
public class GeneralStudent extends Student{

    public GeneralStudent(double c) {
        super(c);
    }

    @Override
    void waiver() {
        if(cgpa>3.8){
            System.out.println("You will get 20% Waiver");
        }
    }
    
}
