public class Host {

    String hosting (String x){
        return x;
    }

    int hosting (int x){
        return x;
    }

    double hosting (double x){
        return x;
    }
    public static void main(String[] args) {
        Host h = new Host();

        System.out.println(h.hosting(8));
        System.out.println(h.hosting(89.3254));
        System.out.println(h.hosting("Hoster"));
    }
}
