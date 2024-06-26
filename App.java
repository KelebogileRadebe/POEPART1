/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject1POE;

public class App {
    public static void main(String[] args){
   

class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public String getUsername() {
        return username;
    }
// setting user name 
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
//checking user name 
    public boolean checkUserName() {
        return username.length() <= 5 && username.contains("_");
    }

    public boolean checkPasswordComplexity() {
        return password.length() >= 8 && password.matches(".[A-Z].") && password.matches(".\\d.") && password.matches(".[@#$%^&+=].");
    }
//register 
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } else {
            return "User successfully registered";
        }
    }
//Login
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
//returning login status
    public String returnLoginStatus() {
        if (loginUser(username, password)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again";
        }
    }
}
    

