// https://www.hackerrank.com/challenges/grading/problem

package day15;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> newGrades = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int newGrade = grades.get(i);
            int nextMultipleOfFive = getNextMultipleOfFive(newGrade);
            if (newGrade < 38) {
                newGrades.add(newGrade);
                continue;
            }
            if (nextMultipleOfFive - newGrade < 3) {
                newGrades.add(nextMultipleOfFive);
                continue;
            }
            newGrades.add(newGrade);
        }
        return newGrades;
    }

    public static int getNextMultipleOfFive(int grade) {
        while (grade % 5 != 0) {
            grade++;
        }
        return grade;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        List<Integer> newGrades = gradingStudents(grades);
        for (int newGrade : newGrades) {
            System.out.println(newGrade);
        }
    }
}
