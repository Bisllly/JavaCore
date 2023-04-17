package org.example;

//JAVA CLASSES AND OBJECTS

//every executable program must be in a class, where program execution begins
public class Main {
    //This line declares an integer variable called x and assigns the value 5 to it.
    // Since this variable is not `static`, it belongs to every instance of the `Main` class,
    // and can be accessed by any method within an instance of that class.
    int x = 5;


    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}