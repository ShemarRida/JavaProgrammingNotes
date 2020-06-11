package javaoop;

public class Constructor {
    String name;
    String DOB;

    public Constructor(){
        name = "Charlie";
        System.out.println("Name is " + name);
    }
    public Constructor(String DOB){
        this.DOB = DOB;
        System.out.println("Created on " + DOB);
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        //System.out.println("New name is " + constructor.name);

        Constructor date_of_birth = new Constructor("01/30/2001");
        System.out.println("Name is " + constructor.name + ". Created on " + date_of_birth.DOB );
    }
}
