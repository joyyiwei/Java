package seven;

/**
 * Created by acer on 14-8-14.
 */
class Con {
    Con(int i) {
        System.out.println("Con " + i);
    }
}
public class CreateConstruct extends Con{
    CreateConstruct() {
        super(1);
    }
    CreateConstruct(int i) {
        super(2);
        System.out.print(i + 2);
    }
    public static void main(String[] args) {
        CreateConstruct tmp = new CreateConstruct();
        CreateConstruct ans = new CreateConstruct(3);
    }
}
