package rtu.mirea.lab6;
import java.util.Random;

public class task2 {

    public static class Student implements Comparable <Student>
    {
        private float GPA;
        Student(float GPA) { this.GPA=GPA; }
        float getGPA() { return GPA; }
        void setGPA(float GPA) { this.GPA = GPA; }
        @Override
        public int compareTo(Student that) {
            return Float.compare(this.GPA, that.GPA);
        }
    }

    public static void quickSort(Student[] array, int low, int high)
    {
        if (array.length == 0) return;
        if (low >= high) return;
        int middle = (low + high) / 2;
        Student main = array[middle];

        int i = low, j = high;


        do {
            while (array[i].compareTo(main) < 0)
                i++;

            while (array[j].compareTo(main) > 0)
                j--;

            if (i <= j)
            {
                if (i < j) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);

    }

    public static void main(String[] args)
    {

        int N = 20;
        Student[] students = new Student[N];
        Random random = new Random();

        for (int i = 0; i < N; i++)
            students[i] = new Student(random.nextFloat() * 4);


        for (int i = 0; i < N; i++)
            System.out.print(String.format("%.2f", students[i].getGPA()) + " ");

        quickSort(students, 0, N-1);
        System.out.println();

        for (int i = 0; i < N; i++)
            System.out.print(String.format("%.2f", students[i].getGPA()) + " ");

    }
}