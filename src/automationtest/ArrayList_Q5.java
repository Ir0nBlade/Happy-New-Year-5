/*
Question:5 - Marks:4
5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman",
5.4 Print the list using a forEach loop.

OutPut
Scrum
Java
Jira
Selenium
Cucumber
Postman
 */

package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String >();

        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Postman");

        for (String str : list){
            System.out.println(str);
        }
    }
}
