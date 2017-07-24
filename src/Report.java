import java.util.HashMap;

/**
 * Created by jennilynhowell on 7/24/17.
 */
public class Report {

    private static String htmlReportTemplate = "<html>" +
        "<head>" +
        "</head>" +
        "<body>" +
        "<h1> %s </h1>" +
        "<p> You have %s messages. Do you want to play them? </p>" +
        "</body>" +
        "</html>";

    public static String htmlReport(HashMap context){
        return String.format(htmlReportTemplate, context.get("name"), context.get("messageCount"));
    }

    //constructor (instance method)
    private HashMap<String, Object> context;
        //below the instance htmlReport() is calling the static method but using the above HashMap context object.
    public String htmlReport(){ return htmlReport(context); }

    public Report(HashMap<String, Object> context) {
        this.context = context;
    }
}
