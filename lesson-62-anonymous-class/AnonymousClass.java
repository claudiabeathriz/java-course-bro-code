 public class AnonymousClass {

    public static void main(String[] args){

        // anonymous class = a class that doesn't have a name; cannot be reused
        //                   add custom behavior without having to create a new class
        //                   often used for one time uses (TimerTask, Runnable, callbacks)

        DogAC dog1 = new DogAC();
        DogAC dog2 = new DogAC(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh ruh*");
            }
        };
        //TalkingDog talkingDog = new TalkingDog();

        dog1.speak();
        dog2.speak();
        //talkingDog.speak();
    }
}
