import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String body = "Hi %s, you have %s messages. Do you want to play them?";

        String largeBody = "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<h1> %s </h1>" +
                "<p> You have %s messages. Do you want to play them? </p>" +
                "</body>" +
                "</html>";

        String formattedBody = String.format(body, "Jennilyn", 4);

        HashMap<String, Object> context = new HashMap<>();
        context.put("name", "Jennilyn");
        context.put("messageCount", 3);

        String formattedHtml = String.format(largeBody, "Jennilyn", 6);

        System.out.println(formattedBody);
        System.out.println(formattedHtml);
    }
}
