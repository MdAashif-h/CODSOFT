import java.util.Scanner;
public class GradeCalculator{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Grade Calculator");
        System.out.println("Enter The Number of Subjects: ");
        int subjects =s.nextInt();
        int[] marks = new int[subjects];
        int Total =0;
        for(int i = 0;i < subjects;i++){
            System.out.println("Enter the Mark of Subject"+(i+1)+":");
            marks[i]= s.nextInt();
            Total +=marks[i];

        }
        double average = (double) Total/(subjects *100)*100;

        System.out.println("Your Result is here");
        System.out.println("The Total of All Subjects: "+Total);
        System.out.println("Your Average percentage is: "+average);

        String Grade = CalculateGrade(average);
        System.out.println("Your Grade is:"+Grade);

        s.close();

    }
    public static String CalculateGrade(double percentage )
    {
        if (percentage >=90)
        {
            return "A+";
        }
        else if(percentage  >=80)
        {
            return "A";
        }
        else if(percentage >=70)
        {
            return "B+";
        }
        else if(percentage >=60)
        {
            return "B";
        }
        else if(percentage >=50)
        {
            return "c";
        }
        else if(percentage >=40)
        {
            return "D";
        }
        else
        {
            return "F";
        }


    }
}
