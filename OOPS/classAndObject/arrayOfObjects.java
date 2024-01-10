package Java.OOPS.classAndObject;

class student{
    int rollno;
    String name;
    int marks;
}

public class arrayOfObjects {

    public static void main(String[] args) {
        
        student s1 =  new student();
        s1.marks=12;
        s1.rollno=1;
        s1.name = "Adity";

        student students[] = new student[1];
        students[0] = s1;

        System.out.println(students[0].marks);


        // Making a class and then making varius objects of that class 

        // Here Student is an class 
        student stu1 = new student();
        stu1.name="Asd";
        stu1.marks  = 90;

        student studs[] = new student[2];
        studs[0] = stu1;
        System.out.println(studs[0].name);

        // Here basically i can get values of each characteristics of the object. 
        

        }
}
