package Practical_16;

public class PhoneBookEntry {

    String firstName;
    String surname;
    String phoneNumber;
    String address;

    PhoneBookEntry(String firstName, String surname, String phoneNumber, String address){
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}' + "\n";
    }
}
