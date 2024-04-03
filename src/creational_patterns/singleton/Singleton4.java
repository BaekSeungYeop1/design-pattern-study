package creational_patterns.singleton;

//  double checked locking으로 효율적인 동기화 블럭 만들기
public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;

    }
}
