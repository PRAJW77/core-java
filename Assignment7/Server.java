class Server {
    String[] services;
    ServerItem[] servers;

    Server(String[] services, ServerItem[] servers) {
        this.services = services;
        this.servers = servers;
    }

    void printInfo() {
        System.out.println("\n=====Server details=======");
        if (this.services != null) {
            System.out.println("Services length: " + this.services.length);
            for (String service : this.services) System.out.println("Service: " + service);
        }
        if (this.servers != null) {
            System.out.println("Servers length: " + this.servers.length);
            for (ServerItem serveriteam: this.servers) serveriteam.getInfo();
        }
    }
}