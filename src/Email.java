import java.util.Random;
import java.util.Scanner;

public class Email {
    private String name;
    private String lastName;
    private String department;
    private String password;
    Scanner scanner = new Scanner(System.in);

    public Email(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public void askDepartment(){
        System.out.print("Please enter your department to generate a company e-mail : ");
        this.department = scanner.nextLine();
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void emailGenerate(){
        System.out.println("Your e-mail is : " + name + "." + lastName + "@" + department + ".company.com");
    }
    public String randomPassword(){ //Generates random 10 character string
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";

        String randomPassword = upperCase + lowerCase + number;

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i<10; i++){
            int index = random.nextInt(randomPassword.length());
            char randomChar = randomPassword.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
    public void changePassword(){ //Sets new password if the previous one matches
        System.out.print("Enter your old password : ");
        String oldPassword = scanner.nextLine();
        if (oldPassword.equals(getPassword())){
            System.out.print("New password : ");
            String newPassword = scanner.nextLine();
            setPassword(newPassword);
            System.out.print("New password is : " + getPassword());
        }
        else {
            System.out.println("Old password does not match, try again");
        }
    }
}
