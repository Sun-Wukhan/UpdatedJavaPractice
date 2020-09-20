public class GarbageCollectorPractice {

    public static void main(String[] args) {
        String str = "Navid";
        str = null;
        System.out.println("String set to null");
        System.gc();
        GarbageCollectorPractice p1 = new GarbageCollectorPractice();
        p1.finalize();
    }

    public void finalize(){
        System.out.println("Garbage is collected and now memory is free");
    }

    //These call the garbage collector to get rid of memory
    //Any strings or ref variables not being used get gone immediately

}
