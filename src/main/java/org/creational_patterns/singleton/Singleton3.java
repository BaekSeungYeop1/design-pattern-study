package org.creational_patterns.singleton;

// 이른 초기화(eager initialization)를 사용하는 방법
public class Singleton3 {

    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){

        return INSTANCE;

    }
}
