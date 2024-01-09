package Week1;

public class AdmissionTest {
    public void testAdmission(int score, float gpa) {
        if ((score >=60 && gpa>=3.6) || (score>=70 && gpa>=3.0)|| (score>=80 && gpa>=2.8)|| (score>=90 && gpa>=2))
        {
            System.out.println("Accept");
        }
        else System.out.println("Reject");
fajaga
    }
    public static void main(String[] args)
    {
        AdmissionTest admissionTest = new AdmissionTest();
        admissionTest.testAdmission(70,3.7f);//calling method or method invocation
    }
}
