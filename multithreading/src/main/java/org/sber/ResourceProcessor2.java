package org.sber;

public class ResourceProcessor2 {
    private final Resource resource;

    public ResourceProcessor2(Resource resource) {
        this.resource = resource;
        resource.setValue(0);
    }

    public synchronized void increase() throws InterruptedException {
        if (resource.getValue() >= 5) {
            wait();
        }

        resource.setValue(resource.getValue() + 1);
        System.out.println(resource.getValue());

        notify();
    }

    public synchronized void decrease() throws InterruptedException {
        while (resource.getValue() < 1) {
            wait();
        }

        resource.setValue(resource.getValue() - 1);
        System.out.println(resource.getValue());

        notify();
    }
}
