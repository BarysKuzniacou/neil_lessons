package strbuilder_pack;

public class StrBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);

        System.out.printf("%d %.2f %s", 10, 10.10123, "Java");
    }
}
