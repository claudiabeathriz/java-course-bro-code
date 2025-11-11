public class Static {
public static void main(String[]args){

    //static = makes a variable or method belong to the class
    //         rather to any specific object
    //         commonly used for utility methods or shared resources

    StaticFriend friend1 = new StaticFriend("Spongebob");
    StaticFriend friend2 = new StaticFriend("Patrick");

    System.out.println(friend1.name);
    System.out.println(friend1.numOfFriends);
    System.out.println(friend2.name);
    System.out.println(friend2.numOfFriends);

    System.out.println(StaticFriend.numOfFriends);
    //when accessing a static variable is best to do so through the class
    //rater than through any object created through that class

    StaticFriend.showFriends();

    Math.round(3.99);

    }
}
