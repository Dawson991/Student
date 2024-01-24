/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detailstudents;

/**
 *
 * @author Dawso
 */
public class DetailStudents {

    /**print the 3 students details -name, id using array of object
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        //user interaction i/p and o/p -view class
        //define 3 students - obj of the student
        Student s1 = new Student();
        s1.setName("Dawson");
        s1.setId(112);
        
        Student s2 = new Student();
        s2.setName("John");
        s2.setId(113);
        
        Student s3 = new Student();
        s3.setName("Jessica");
        s3.setId(114);
        
        Student[] list = new Student[3]; //array of object
        list[0]=s1; //stored the objects in array
        list[1]=s2;
        list[2]=s3;
        //print data - heterogenous data
        for(int x=0; x<list.length;x++){
        
    }
        System.out.println(list[0].getName()+ " " +s1.getId());

    }
}
