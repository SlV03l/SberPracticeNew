package org.sber;

public class Decreaser implements Runnable {
    private final ResourceProcessor2 resourceProcessor2;

    public Decreaser(ResourceProcessor2 resourceProcessor2) {
        this.resourceProcessor2 = resourceProcessor2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                resourceProcessor2.decrease();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
