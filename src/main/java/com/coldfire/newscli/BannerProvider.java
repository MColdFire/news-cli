package com.coldfire.newscli;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultBannerProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BannerProvider extends DefaultBannerProvider{

    @Override
    public String getBanner() {
        return "N E W S - C L I";
    }

    @Override
    public String getVersion() {
        return "v0.0";
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the news cli";
    }

}
