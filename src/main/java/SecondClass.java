import org.gradle.internal.impldep.com.fasterxml.jackson.core.JsonFactory;
import org.gradle.internal.impldep.com.fasterxml.jackson.core.json.JsonReadFeature;

public class SecondClass {
    // Builder-style since 2.10:
    JsonFactory factory = JsonFactory.builder()
// configure, if necessary:
            .enable(JsonReadFeature.ALLOW_JAVA_COMMENTS)
            .build();

}
