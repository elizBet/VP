import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        QueryExtractor queryExtractor = new QueryExtractor();
        tests t = new tests();
        t.extractStr();
    }
}
@SuppressWarnings("all")
class QueryExtractor {

    public String extract(String url, String paramName) {

        Pattern pattern = Pattern.compile(paramName+"=(.+)");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return matcher.group(1).split("&")[0];
        }

        return null;
    }
