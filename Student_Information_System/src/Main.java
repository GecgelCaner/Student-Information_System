
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Cem" , "TRH" , "111");
        Teacher t2 = new Teacher("Caner" , "FZK" , "222");
        Teacher t3 = new Teacher("Onur" , "BIO" , "333");


        Course tarih = new Course("Tarih","101", "TRH" );
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik" , "102" , "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyo" , "103" , "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Mert" , "123" , "4" , tarih, fizik , biyo  );
        s1.addBulkExamNote(70 , 63 , 42 , 100 , 90 ,75);
        s1.isPass();

        Student s2 = new Student("Betül" , "234" , "5" , tarih , fizik , biyo);
        s2.addBulkExamNote(80,70,60,80,90,40);
        s2.isPass();

    }
}