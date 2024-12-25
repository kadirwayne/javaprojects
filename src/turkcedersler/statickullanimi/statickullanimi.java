package turkcedersler.statickullanimi;

class statickullanimi {
    public static void main(String[] args) {
        System.out.println("online ogrenci: "+student.howMany());
        student s1 = new student("ali", 220, 90);
        student s2 = new student("ayse", 330, 100);
        student s3 = new student("mehmet", 440, 80);
        System.out.println("online ogrenci: "+student.howMany());
        s1.exit();
        System.out.println("online ogrenci: "+student.howMany());

        int [] notlar = new int[3];
        notlar[0] = s1.points;
        notlar[1] = s2.points;
        notlar[2] = s3.points;

        System.out.println(student.average(notlar));

    }
}
