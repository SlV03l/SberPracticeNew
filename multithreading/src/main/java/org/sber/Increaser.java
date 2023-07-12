package org.sber;

public class Increaser extends Thread {
    private final ResourceProcessor resourceProcessor;

    public Increaser(ResourceProcessor resourceProcessor2) {
        this.resourceProcessor = resourceProcessor2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                resourceProcessor.increase();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
