package com.dprabath.notification;

import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dprabath on 4/2/17.
 */
@RefreshScope
@RestController
public class NotificationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationController.class);

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        LOGGER.error("Message logged at ERROR level");
        LOGGER.warn("Message logged at WARN level");
        LOGGER.info("Message logged at INFO level");
        LOGGER.debug("Message logged at DEBUG level");
        return this.message;
    }
}
