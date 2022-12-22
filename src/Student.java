/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Student {
String name,stuNo;
int classes;
Course mat;
Course matVerb;
Course fizik;
Course fizVerb;
Course kimya;
Course kimVerb;
double average;
boolean isPass;


Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya, Course matVerb, Course fizVerb, Course kimVerb) {
    this.name = name;
    this.classes = classes;
    this.stuNo = stuNo;
    this.mat = mat;
    this.fizik = fizik;
    this.kimya = kimya;
    
    //DERSLERİN SÖZLÜLERİ - START -----
    this.matVerb = matVerb;
    this.fizVerb = fizVerb;
    this.kimVerb = kimVerb;
    //DERSLERİN SÖZLÜLERİ - END -----
    
    calcAverage();
    this.isPass = false;
}


public void addBulkExamNote(int mat, int fizik, int kimya) {

    if (mat >= 0 && mat <= 100) {
        this.mat.note = mat * 0.85;
    }

    if (fizik >= 0 && fizik <= 100) {
        this.fizik.note = fizik * 0.80;
    }

    if (kimya >= 0 && kimya <= 100) {
        this.kimya.note = kimya * 0.90;
    }

}

//SÖZLÜ NOT KISMI - START -----
public void addBulkVerbalNote(int matVerb, int fizVerb, int kimVerb) {
	if (matVerb >= 0 && matVerb <= 100) {
        this.matVerb.note = matVerb * 0.15;
    }

    if (fizVerb >= 0 && fizVerb <= 100) {
        this.fizVerb.note = fizVerb * 0.20;
    }

    if (kimVerb >= 0 && kimVerb <= 100) {
        this.kimVerb.note = kimVerb * 0.10;
    }
}
//SÖZLÜ NOT KISMI - END -----

public void isPass() {
    if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
        System.out.println("Notlar tam olarak girilmemiş");
    } else {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Ortalama : " + this.average);
        if (this.isPass) {
            System.out.println("Sınıfı Geçti. ");
        } else {
            System.out.println("Sınıfta Kaldı.");
        }
    }
}

//ORTALAMA HESAPLAMA - START -----
public void calcAverage() {
    this.average = (this.fizik.note + this.kimya.note + this.mat.note + this.matVerb.note + this.fizVerb.note + this.kimVerb.note) / 3;
}
//ORTALAMA HESAPLAMA - END -----

public boolean isCheckPass() {
    calcAverage();
    return this.average > 55;
}

public void printNote(){
    System.out.println("=========================");
    System.out.println("Öğrenci : " + this.name);
    System.out.println("Matematik Notu : " + ( (this.mat.note + this.matVerb.note) ));
    System.out.println("Fizik Notu : " + ( (this.fizik.note +  this.fizVerb.note) ));
    System.out.println("Kimya Notu : " + ( (this.kimya.note + this.kimVerb.note) ));
}
}