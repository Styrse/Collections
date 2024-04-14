package util;

import entities.Course;
import entities.Student;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class DataReader {

    private static List<Student> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static String studentPath = "data/Students.txt";
    private static String coursePath = "data/Courses.txt";


    static{

            readStudents();
            readCourses();

    }
    private static void readCourses(){
        File file = new File(coursePath);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                courses.add(new Course(scanner.next()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + coursePath + " cannot be found");
        }
    }

    private static void readStudents(){
        File file = new File(studentPath);
        try {
            int counter = 1;
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                students.add(new Student(scanner.next(), counter));
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + studentPath + " cannot be found");
        }
    }

    public static Collection<Course> getCourses(){
        return courses;
    }

    public static void fillWithStudents(Collection<Student> collection, int amount){

        for(int i = 0; i < amount; i++){
                collection.add(students.get(i % students.size()));
        }
    }

    public static void fillWithStudentsAndCourses(Map<Student, Course> map, int amount){
        Random random = new Random();
        for(int i = 0; i < amount; i++){
            map.put(students.get(i % students.size()), courses.get(random.nextInt(courses.size())));
        }
    }
}
