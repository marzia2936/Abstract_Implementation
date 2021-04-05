package Package1;
public class Main {
    public static void main(String[] args) {
        System.out.println("For General Student-->>");
        GeneralStudent G1 = new GeneralStudent(3.90);
        G1.waiver();
        System.out.println("For Talent Hunt Scholar Student-->>");
        TalentHuntScholarStudent T1 = new TalentHuntScholarStudent(3.99);
        T1.waiver();
    }
    
}
