class Pen {
   String color;
  
   public void printColor() {
       System.out.println("The color of this Pen is " + this.color);
   }
}

class Student {
   String name;
   int age;
  
   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
   Student(String name,int age){
    this.name=name;
    this.age=age;
   }
}




public class OOPS {
   public static void main(String args[]) {
       Pen p1 = new Pen();
       p1.color = "blue";


       Pen p2 = new Pen();
       p2.color = "black";


       Pen p3 = new Pen();
       p3.color = "red";


       p1.printColor();
       p2.printColor();
       p3.printColor();


        Student s1 = new Student("Aman", 24);
        s1.getInfo();


       Student s2 = new Student("Shradha",22);
       s2.getInfo();
   }
}
