class Server {

    static int plus(int x, int y){
        return x+y;
    }

    static int plus(int x, int y, int z){
        return x+y+z;
    }
    /*public static void main(String[] args) {
        Server s = new Server();
    }*/
}

class Test{
    public static void main(String[] args) {
        System.out.println(Server.plus(89,37));
        System.out.println(Server.plus(76,35,458));

    }
}
