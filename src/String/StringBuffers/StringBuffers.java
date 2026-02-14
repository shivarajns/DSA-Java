package String.StringBuffers;

public class StringBuffers {


    public static void main(String[] args) {

        System.out.println("--------- String Buffers ---------");
        //String Buffer is peer class of String but Mutable, and Multithreading
        StringBuffer name = new StringBuffer("Shivaraju");

        name.append(" N S");
        System.out.println(name);

        name.replace(0, 1, "s");
        System.out.println(name);

        name.insert(5, "RAJU");
        System.out.println(name);

        name.delete(5,9);
        System.out.println(name);

        name.reverse();
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.capacity());  // This will return the capacity of the buffer

    }
}
