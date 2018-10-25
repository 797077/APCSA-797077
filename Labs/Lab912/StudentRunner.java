
/**
 * Lab 912 First Class
 *
 * @Grace Jau
 * @version 912
 */
public class StudentRunner
{
    // instance variables - replace the example below with your own
    public static void main(){
        Student s1 = new Student();
        System.out.println(s1.getStudNumber());
        System.out.println(s1.getStuActive());
        System.out.println(s1.getStuGPA());
        System.out.println(s1.getStuName());
        System.out.println();
        
        String[] studNames = {"name1", "name2", "name3", "name4", "name5"};
        int[] studNums = {1, 2, 3, 4, 5};
        for(int i = 0; i<5; i++){
            Student s = new Student();
            s.setStudNumber(studNums[i]);
            s.setStuName(studNames[i]);
            System.out.println(s.getStuName()+"   "+s.getStudNumber());
        }
    }


}
