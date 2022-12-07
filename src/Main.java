public class Main {
    public static void main(String[] args) {
       String a = String.join("-", "Java", "is", "cool");
       System.out.println(a);

        System.out.println("--------------");

        String s = "Java is cool";
        String sub = "Java";

        System.out.println("Последний индекс: ");
        System.out.println(s.lastIndexOf(5));
        System.out.println(s.lastIndexOf(sub));

        System.out.println("--------------");

        String s1 = "Java is cool";

        System.out.println(s1.replace('J', 'c'));
    }
}
