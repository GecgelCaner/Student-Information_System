
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut" , "TRH" , "05450000000");
        Teacher t2 = new Teacher("caner" , "FZK" , "05770000000");
        Course tarih = new Course("Tarih","101", "TRH" );

        tarih.addTeacher(t1);

    }
}