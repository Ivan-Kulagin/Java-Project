package rtu.mirea.lab6;
import java.util.Random;

public class task3 {

    static class Student{
        private int iDNumber;
        Student(int iDNumber){
            this.iDNumber = iDNumber;
        }
        public int getId(){
            return iDNumber;
        }
        public void setId(int iDNumber){
            this.iDNumber = iDNumber;
        }
    }

    public static void merge(Student[] arr, int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i].getId() <= R[j].getId())
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sortArr(Student[] arr, int l, int r)
    {
        if (l < r)
        {

            int m = (l + r) / 2;

            sortArr(arr, l, m);
            sortArr(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args)
    {

        int size1 = 10, size2 = 5;
        Student[] students1 = new Student[size1];
        Student[] students2 = new Student[size2];
        Random random = new Random();

        for (int i = 0; i < size1; i++)
            students1[i] = new Student(random.nextInt(100));
        for (int i = 0; i < size2; i++)
            students2[i] = new Student(random.nextInt(100));


        for (int i = 0; i < size1; i++)
            System.out.print(students1[i].getId() + " ");
        System.out.println();
        for (int i = 0; i < size2; i++)
            System.out.print(students2[i].getId() + " ");


        System.out.println();
        System.out.println();

        int count=0;
        Student[] result=new Student[size1 + size2];

        for (int i=0; i < size1; i++)
            result[count++] = students1[i];
        for (int i=0; i < size2; i++)
            result[count++] = students2[i];

        sortArr(result, 0, result.length -1);

        for (Student student : result)
            System.out.print(student.getId() + " ");

    }


}