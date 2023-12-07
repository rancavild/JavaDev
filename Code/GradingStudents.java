package Code;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            int nextMultOfFive = ((grade/5)+1)*5;
            int diff = nextMultOfFive - grade;
            if (diff < 3 && grade >= 38) {
                result.add(nextMultOfFive);
            } else {
                result.add(grade);
            }
        }
        return result;
    }

    public static void main(String[] args) {
       List<Integer> grades = new ArrayList<>();
       grades.add(73);
       grades.add(67);
       grades.add(38);
       grades.add(33);
       
       List<Integer> result = gradingStudents(grades);

       System.out.println(result);
    }
}
