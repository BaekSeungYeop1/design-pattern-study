package org.creational_patterns.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

/*      리플렉션으로 깨지는 싱글톤
        Constructor<Singleton3> declaredConstructor = Singleton3.class.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        Singleton3 settings1 = Singleton3.getInstance();
        Singleton3 settings2 = declaredConstructor.newInstance();
        */

        Singleton5 settings1 = Singleton5.getInstance();
        String fileName = "singleton.obj";

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeObject(settings1);
        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        Singleton5 settings2 = (Singleton5) in.readObject();
        in.close();

//        Singleton5 settings2 = null;
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
//            out.writeObject(settings1);
//        }
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
//            settings2 = (Singleton5) in.readObject();
//        }
//        System.out.println(settings1 == settings2);

        System.out.println(settings1 == settings2);
        System.out.println(settings1);
        System.out.println(settings2);
    }
}
