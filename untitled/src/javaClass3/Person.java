package javaClass3;
//Write a class with the name Person.
public class Person {
    //Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person(); // create a object to call instance methods
        person.setFirstName(" ");
        person.setLastName(" ");
        person.setAge(10);
       System.out.println("fullName = " + person.getFullName());
        System.out.println("teen =" + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
       System.out.println("fullName = " + person.getFullName());
        System.out.println("teen =" + person.isTeen());
        person.setLastName("Smith");
       System.out.println("fullName = " + person.getFullName());
    }

    /* *Method named getFirstName without any parameters, it needs to return the value of the firstName
     field.
     *Method named getLastName without any parameters, it needs to return the value of the lastName
     field.
     *Method named getAge without any parameters, it needs to return the value of the age field.*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    /* *Method named setFirstName with one parameter of type String, it needs to set the value of the
   firstName field.
   *Method named setLastName with one parameter of type String, it needs to set the value of the
   lastName field.
   *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
   the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.*/
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public void setAge(int age) {
        if (age > 0 || age < 100) {
            this.age=age;
        } else {
            age=0;
        }
    }

    // *Method named isTeen without any parameters, it needs to return true if the value of the age field is greaterthan 12 and lessthan 20, otherwise, return false.
    public boolean isTeen() {
        if (age > 12 && age < 20){
            return true;
        }
        else{
            return false;
        }
    }
    //*Method named getFullName without any parameters, it needs to return the full name of the person.
    public String getFullName() {
            // *In case both firstName and lastName fields are empty, Strings return an empty String.
            //*In case firstName is an empty String, return firstName.
            //*In case lastName is an empty String, return lastName.

            if (firstName.isEmpty() && lastName.isEmpty()) {
                return " ";
            } else if (firstName.isEmpty()) {
                return firstName;
            } else if (lastName.isEmpty()) {
                return lastName;
            } else {
                return firstName + lastName;
            }

    }
}






