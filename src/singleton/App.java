package singleton;public class App {
    public static void main(String[] args) {
        Singleton6 settings1 = Singleton6.INSTANCE;
        Singleton6 settings2 = Singleton6.INSTANCE;
        System.out.println(settings1 == settings2);
    }
}
