package lab12.filesettings;

import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@ToString(exclude = "logger")
@Component
public class FileOperation {
    @Value("src/main/java/Lab12/${file.input_name}")
    private String inputName;
    @Value("src/main/java/Lab12/${file.output_name}")
    private String outputName;
    private final Logger logger = LoggerFactory.getLogger(FileOperation.class);

    @PostConstruct
    private void init() {
        logger.info("Initializing...");
    }

    @PreDestroy
    private void destroy() {
        logger.info("Destroying...");
    }
}
