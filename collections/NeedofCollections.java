package collections;

public class NeedofCollections {

    public static void main(String[] args) {

        int[] arArray = new int[1000];
        arArray[1] = 2;
        // arArray[2] = "A";

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        // students[2] = new Book();

        // array of objects can contain different type of elements
        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book();

        // due to the array limitation we need collection
        // we can store both homogenous and heterogenous data in collection
        // collection can increase or decrease in size

    }
}

class Book {

}

class Student {

}