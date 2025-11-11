public class OverloadedConstructorsUser {

    String username;
    String email;
    int age;

    OverloadedConstructorsUser(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    OverloadedConstructorsUser(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    OverloadedConstructorsUser(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    OverloadedConstructorsUser(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
