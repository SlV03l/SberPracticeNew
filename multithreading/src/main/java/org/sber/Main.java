package org.sber;

public class Main {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test1() {
        Resource resource = new Resource();
        ResourceProcessor resourceProcessor = new ResourceProcessor(resource);

        for (int i = 0; i < 3; i++) {
            new Increaser(resourceProcessor).start();
        }
    }

    private static void test2() {
        Resource resource = new Resource();
        ResourceProcessor2 resourceProcessor2 = new ResourceProcessor2(resource);

        new Thread(new Decreaser(resourceProcessor2)).start();
        new Increaser2(resourceProcessor2).start();
    }
}
