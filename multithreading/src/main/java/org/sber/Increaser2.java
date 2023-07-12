package org.sber;

public class Increaser2 extends Thread {
    private final ResourceProcessor2 resourceProcessor2;

    public Increaser2(ResourceProcessor2 resourceProcessor2) {
        this.resourceProcessor2 = resourceProcessor2;
    }

    @Override
    public void run() {
        try {
            resourceProcessor2.increase();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
