package org.sber;

public class ResourceProcessor {
    private final Resource resource;

    public ResourceProcessor(Resource resource) {
        this.resource = resource;
    }

    public synchronized void increase() throws InterruptedException {
        resource.setValue(resource.getValue() + 1);
        System.out.println(resource.getValue());
    }

    public synchronized void decrease() throws InterruptedException {
        resource.setValue(resource.getValue() - 1);
        System.out.println(resource.getValue());
    }
}
