/*string buffer class is use for change or edit the string because in normal string it
cannot posible 
string buffer class hase 4 different function
1)setCharAt() = it is use for change any perticular member
2)append() = it is use for merging diffrent strings
3)insert() = it is use for add any new string at any point of previous string
4)setLength() = it is use for set new length to the string
in given program we ar using java.lang.StringBuffer because it is part of package of
java we can also use StringBuilder insted of java.lang.StringBuffer*/

import java.util.Scanner;

class StringBufferExample {
    public static void main(String args[]) {
        String name = new String();
        String surname = new String();
        String ad = new String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        java.lang.StringBuffer snb = new java.lang.StringBuffer(name);
        snb.setCharAt(3, 'e');
        System.out.println("string after modification: " + snb);

        System.out.print("Enter surname: ");
        surname = sc.nextLine();
        java.lang.StringBuffer ssb = new java.lang.StringBuffer(" " + surname);
        snb.append(ssb);
        System.out.println("Full Name: " + snb);
        
        System.out.println("Enter string which you want to add: ");
        ad = sc.nextLine();
        java.lang.StringBuffer add = new java.lang.StringBuffer(" " + ad + " ");
        snb.insert(7,add);
        System.out.println("Edited string: "+ snb);

        snb.setLength(20);
   }
}
