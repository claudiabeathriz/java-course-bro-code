public class StaticFriend {

    static int numOfFriends;
    //as if all the objects are sharing the same variable
    String name;

    StaticFriend(String name){
        this.name = name;
        numOfFriends++;
    };

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
        //if you are working with a static attribute, you don't need "this."
    }




}
