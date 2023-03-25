package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        TestClass obj = new TestClass();
        Method method = obj.getClass()
                .getMethod("longRunningMethod");
        if (method.getAnnotation(BackgroundOperation.class) != null) {
            new Thread(obj::longRunningMethod).start();
        } else {
            obj.longRunningMethod();
        }
    }
}