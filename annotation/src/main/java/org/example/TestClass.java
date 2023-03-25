package org.example;

public class TestClass {
    @BackgroundOperation
    public void longRunningMethod() {
        // Тут должно выполняться что-то очень долгое
    }
}
