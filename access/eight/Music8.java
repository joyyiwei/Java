package eight;

/**
 * Created by acer on 14-8-30.
 */
public class Music8 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument e[]) {
        for (Instrument i : e)
            tune(i);
    }
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    public static void main(String args[]) {
        Instrument ans[] = new Instrument[20];
        for (int i = 0; i < ans.length; i++)
            ans[i] = gen.next();
        tuneAll(ans);
        for (Instrument i : ans)
            System.out.println(i);
    }
}
