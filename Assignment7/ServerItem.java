class ServerItem {
    String name;
    int capacity;

    ServerItem(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void getInfo() {
        System.out.println("Server name: " + name + ", capacity: " + capacity + "GB");
    }
}