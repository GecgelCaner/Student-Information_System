public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name ;
    String studentNo ;
    String classes ;
    double average;
    boolean isPass;

    Student(String name , String studentNo, String classes , Course c1 ,Course c2 , Course c3 ){

        this.name =name;
        this.studentNo =studentNo;
        this.classes = classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;


    }

    void addBulkExamNote(int note1 , int note2 , int note3 , int note4 , int note5 , int note6){

        if (note1>=0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2>=0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3>=0 && note3 <= 100){
            this.c3.note = note3;
        }
        if (note4>=0 && note4 <= 100){
            this.c1.noteV = note4;
        }
        if (note5>=0 && note5 <= 100){
            this.c2.noteV = note5;
        }
        if (note6>=0 && note6 <= 100){
            this.c3.noteV = note6;
        }

    }
    void  isPass(){

        System.out.println("============================================================================================");
        this.average = (((this.c1.note*0.80) + (this.c1.note*0.20) ) + ((this.c2.note*0.80) + this.c2.note*0*20 ) + ((this.c3.note*0.80) + (this.c3.note*0.20) ))/3.0;
        if(this.average >= 55){
            System.out.println("Sınıfı geçtiniz!");
        }else{
            System.out.println("Sınıfta kaldınız!");
        }
        printNote();
    }

    void  printNote(){
        System.out.println(this.c1.name + "notu :  " + this.c1.note);
        System.out.println(this.c2.name + "notu :  " + this.c2.note);
        System.out.println(this.c3.name + "notu :  " + this.c3.note);
        System.out.println("Ortalamanız : " + this.average);


    }
}
