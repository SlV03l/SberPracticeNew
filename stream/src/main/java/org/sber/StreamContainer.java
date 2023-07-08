package org.sber;

public class StreamContainer {
    private String name;
    private long count;

    public StreamContainer(String name, long count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }
}
