package Tasks.Task_3;
import Tasks.Students;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_MS {
    public static void main(String[] args)
    {
        List<Students> students1 = new ArrayList<>();
        Comparator Compare=new Compare();
        Students Student1 = new Students(7, "Саркисян",4.1);
        Students Student2 = new Students(3, "Груздева",4.4);
        Students Student3 =new Students(1, "Нориаки", 5);
        Students Student4 = new Students(5, "Йошикаге",3.7);
        Students Student5 = new Students(9, "Цеппели", 4.8);
        students1.add(Student1);
        students1.add(Student2);
        students1.add(Student3);
        students1.add(Student4);
        students1.add(Student5);
        List<Students> students2 = new ArrayList<>();
        Students Student6 = new Students(8, "Айеро",3.1);
        Students Student7 = new Students(4, "Момсен",3.5);
        Students Student8 =new Students(2, "Браун", 4.3);
        students2.add(Student6);
        students2.add(Student7);
        students2.add(Student8);
        Students[] students = new Students[students1.size() + students2.size()];
        Merge_Sorting.MergeSorting(students1, students2, students, Compare);
        System.out.println("\n\t\tСортировка слиянием по имени:");
        for (Students s: students)
        {
            System.out.println(s);
        }
    }
}
