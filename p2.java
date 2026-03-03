//  I will create a class and constructor in a different file p1 and try to use it in this class p2 under same pakage 

import Packages.student;

public class p2 {
    public static void main(String[] args) {
       student s1 = new student("Hardil", 20);
        System.out.println(s1.name);
    }
}
