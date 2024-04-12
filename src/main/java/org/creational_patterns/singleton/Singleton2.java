package org.creational_patterns.singleton;

// 동기화(synchronized)를 사용해 멀티쓰레드 환경에 안전하게 만드는 방법
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;

    }
}
