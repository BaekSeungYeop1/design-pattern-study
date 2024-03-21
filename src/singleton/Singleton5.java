package singleton;

//   static inner 클래스를 사용하는 방법
public class Singleton5 {

    private Singleton5(){}

    private static class SettingsHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    public static Singleton5 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
