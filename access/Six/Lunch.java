package Six;

/**
 * Created by acer on 14-8-11.
 */
class Connection {
    private static int count = 0;
    private Connection() {
        System.out.println("Connection()");}
    static Connection makeConnection() {
        count++;
        return new Connection();
    }
    public static int howMany() { return count; }
    public String toString() {
        return ("Connection " + count);
    }
}

public class Lunch {
    static int cnt = 2;
    static Connection tmp[] = new Connection[2];
    {
        for (Connection x : tmp)
            x = Connection.makeConnection();
    }

    public static Connection getConnection() {
        if (cnt > 0)
            return tmp[--cnt];
        else {
            System.out.println("No more connection");
            return null;
        }
    }
    public static void main(String[] args) {
        Lunch lunch = new Lunch();
        System.out.println(lunch.cnt);
        lunch.getConnection();
        System.out.println(lunch.cnt);
        lunch.getConnection();
        System.out.println(lunch.cnt);
    }
}
