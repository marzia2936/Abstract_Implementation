package Package1;
public class TalentHuntScholarStudent extends Student {

    public TalentHuntScholarStudent(double c) {
        super(c);
    }
    @Override
    void waiver() {
        if(cgpa>=3.8){
            System.out.println("You will got 100% Waiver");
        }
        
    }
    
    
}
