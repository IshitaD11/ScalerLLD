package LowLevelDesign.Java_Fundamentals.LLD1_OPPs.OOPs1.MCQ5;

public class Student {
    int age;
   String name;

   void display(){
       System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
   }

   void sayHello(String name){
       System.out.println(this.name + " says hello to " + name);
   }
   
}
