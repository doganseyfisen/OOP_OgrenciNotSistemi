/**
 * @author Doğan Seyfi Şen - 2022
 */

public class OgrenciNotSistemiTest {
	 public static void main(String[] args) {

	        Course mat = new Course("Matematik", "MAT101", "MAT");
	        Course fizik = new Course("Fizik", "FZK101", "FZK");
	        Course kimya = new Course("Kimya", "KMY101", "KMY");
	        
	        //DERSLERİN SÖZLÜLERİ - START ------
	        Course matVerb = new Course("Matematik Sözlü", "MAT101", "MAT");
	        Course fizVerb = new Course("Fizik Sözlü", "FZK101", "FZK");
	        Course kimVerb = new Course("Kimya Sözlü", "KMY101", "KMY");
	        //DERSLERİN SÖZLÜLERİ - END -----
	        
	        Teacher t1 = new Teacher("Rick Sanchez", "90550000000", "MAT");
	        Teacher t2 = new Teacher("Bojack Horseman", "90550000001", "FZK");
	        Teacher t3 = new Teacher("Walter White", "90550000002", "KMY");

	        mat.addTeacher(t1);
	        fizik.addTeacher(t2);
	        kimya.addTeacher(t3);

	        Student s1 = new Student("Jesse Pinkman", 4, "140144015", mat, fizik, kimya, matVerb, fizVerb, kimVerb);
	        s1.addBulkExamNote(50, 20, 40);
	        s1.addBulkVerbalNote(100, 100, 100);
	        s1.isPass();

	        Student s2 = new Student("Morty Smith", 4, "2211133", mat, fizik, kimya, matVerb, fizVerb, kimVerb);
	        s2.addBulkExamNote(100, 50, 40);
	        s2.addBulkVerbalNote(100, 100, 100);
	        s2.isPass();

	        Student s3 = new Student("Lisa Simpson", 4, "221121312", mat, fizik, kimya, matVerb, fizVerb, kimVerb);
	        s3.addBulkExamNote(95, 100, 95);
	        s3.addBulkVerbalNote(100, 100, 100);
	        s3.isPass();

	    }
	}
