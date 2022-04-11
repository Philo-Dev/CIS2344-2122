package Practical_16;

import java.util.HashMap;

public class PhoneBook {

    public static void main(String[] args) {
        //Creates a new HashMap of type <String, PhoneBookEntry>
        HashMap<String, PhoneBookEntry> phoneBook = new HashMap<>();

        //Creates an instance of PhoneBookEntry for the HashMap
        PhoneBookEntry pbe1 = new PhoneBookEntry("Jack","Smith","000000001","1 fake street");
        PhoneBookEntry pbe2 = new PhoneBookEntry("John","Smith","000000002","1 fake road");
        PhoneBookEntry pbe3 = new PhoneBookEntry("Jane","Jackson","000000003","2 fake street");
        PhoneBookEntry pbe4 = new PhoneBookEntry("Jack","Jackson","000000004","2 fake road");
        PhoneBookEntry pbe5 = new PhoneBookEntry("James","FakeName","000000005","3 fake lane");

        //Adds to the HashMap
        phoneBook.put("Jack Smith",pbe1);
        phoneBook.put("John Smith",pbe2);
        phoneBook.put("Jane Jackson",pbe3);
        phoneBook.put("Jack Jackson",pbe4);
        phoneBook.put("James FakeName",pbe5);

        System.out.println("Old PhoneBook: ");
        System.out.println(phoneBook);

        //Removes an entry from the Phone Book
        if (phoneBook.containsKey("James FakeName")) {

            System.out.println("Removing the following entry from Phone Book: " + phoneBook.get("James FakeName"));
            phoneBook.remove("James FakeName",pbe5);

        }

        //Prints the details of an existing entry from the Phone Book
        if (phoneBook.containsKey("John Smith")) {

            System.out.println("The details for John Smith are: " + phoneBook.get("John Smith"));

        }

        System.out.println("New PhoneBook: ");
        System.out.println(phoneBook);
    }

}
