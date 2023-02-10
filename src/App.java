import java.util.Scanner;

public class App extends Email{
    Scanner scanner = new Scanner(System.in);

    public App(String name, String lastName) {
        super(name, lastName);
    }

    public void startApp(){ // Gets department from user, generates an e-mail and a random password, changes password
        System.out.println("~~~~~~~~Welcome~~~~~~~~");
        askDepartment();
        emailGenerate();
        String defaultPassword = randomPassword();
        setPassword(defaultPassword);
        System.out.println(defaultPassword);
        System.out.println("To change password press 1");
        String answer = scanner.nextLine();
        if (answer.equals("1")){
            changePassword();
        }


    }
}
