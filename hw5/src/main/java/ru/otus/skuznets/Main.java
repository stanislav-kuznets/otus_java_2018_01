package ru.otus.skuznets;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            TestFramework.start(TestClass.class);
            TestFramework.start("ru.otus.skuznets");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
