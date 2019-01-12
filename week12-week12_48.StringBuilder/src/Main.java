
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append(" {\n");

        for (int i = 1; i < t.length + 1; i++) {
            sb.append(" ");
            sb.append(i).append(", ");

            if (i % 4 == 0 && t.length > 4) {

                sb.append("\n");

            }

        }
        sb.deleteCharAt(sb.length() - 2);
        sb.append("\n").append(" }");
       

        return sb.toString();
    }
}
