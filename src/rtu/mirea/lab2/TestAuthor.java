package rtu.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Иван", "asd@zxc.com", 'M');
        Author a2 = new Author("Мария", "zxc@zxc.com", 'F');
        Author a3 = new Author("Аноним", "anonymous@zxc.com", 'U');

        System.out.println("Имя первого автора: "+a1.getName());
        System.out.println("E-mail второго автора: "+a2.getEmail());
        System.out.println("Пол третьего автора: "+a3.getGender());

        a1.setEmail("unknown@zxc.com");
        System.out.println(a1.toStr());
    }
}
