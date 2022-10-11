package main.java.com.daniela;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {
        //*Creating a file
        String fileName = "src/data.csv";

        File file = new File(fileName); //comma separated value file

        if (!file.exists()) {
            try {
                file.createNewFile(); //checked exception;
//                System.out.println(file.getName() + " created");
            } catch (IOException e) {
//                System.out.println("Error creating file...");
//                System.out.println(e);
            }
        }

        //*Writing in our file
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("id,name,email");
            printWriter.println("1,Jamila,jamila@gmail.com");
            printWriter.println("2,Alex,alex@hotmail.com");
            printWriter.println("3,Musa,musa@hotmail.com");
            printWriter.close();
            printWriter.flush();
            System.out.println("contents added to file...");
        } catch (IOException e) {
            System.out.println(e);
        }

        //*Reading from files
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String contents = "";

            System.out.println(reader.readLine()); //This is printing the header in our file

            List<User> users = new ArrayList<>();

            while ((contents = reader.readLine()) != null) {
                String[] split = contents.split(","); //Splitting where there is a comma
                int id = Integer.parseInt(split[0]); //*Parse through files and turn it to an object
                String name = split[1];
                String email = split[2];
                User user = new User(id, name, email); //for every line; it will create a new User with an id, name and email
                users.add(user);
            }
            reader.close();

            System.out.println(users); //prints users list

            users.forEach(System.out::println); //looping through users list

        } catch (IOException e) {
            System.out.println(e);
        }





    }
}
