package src.ru.mirea.pract6._2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;

public class SortingStudentsByGPA implements Comparator{
    static Student[] students = new Student[6];

    public static void main(String[] args) {
        for(int i = 0, j=0; i < students.length && j<args.length; i++,j++) {
            Scanner in = new Scanner(System.in);
            students[i] = new Student();
            students[i].setName(args[j]);
            j++;
            students[i].setScore(Integer.parseInt(args[j])) ;
        }

        SortingStudentsByGPA s = new SortingStudentsByGPA();
//        s.Sort(students, 0, students.length-1); //For quicksort
        students = s.Sort(students, 0, students.length-1);
        for(Student s1 : students) {
            System.out.println("Student name - " + s1.getName());
            System.out.println("Score - " + s1.getScore());
        }

    }

//    @Override
//    public Object Sort(Student[] students, int low, int high) {
//        if(students.length == 0) return null;
//        if(low >= high) return null;
//
//        int middle = low + (high - low) / 2;
//        int middleElement = students[middle].getScore();
//        int i = low, j = high;
//        while (i < j) {
//            while(students[i].getScore() > middleElement) i++;
//            while(students[j].getScore() < middleElement) j--;
//
//            if(i <= j) {
//                Student s = students[i];
//                students[i] = students[j];
//                students[j] = s;
//                i++;
//                j--;
//            }
//        }
//
//        if(low < j) {
//            Sort(students, low, j);
//        }
//        if(high > i) {
//            Sort(students, i, high);
//        }
//        return null;
//    }
//    @Override
//    public Object Compare (Student[] arr1,Student arr2[])
//    {
//        return null;
//    }

    @Override
    public Student[] Sort(Student[] students, int low, int high) {
        if (students.length < 2) return students;
        int m = students.length / 2;
        Student[] arr1 = Arrays.copyOfRange(students, 0, m);
        Student[] arr2 = Arrays.copyOfRange(students, m, students.length);
        return Compare(Sort(arr1, 0, m), Sort(arr2, m, students.length));
    }

    @Override
    public Student[] Compare(Student[] arr1, Student arr2[]) {
        int n = arr1.length + arr2.length;
        Student[] arr = new Student[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1].getScore() > arr2[i2].getScore()) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }
}
