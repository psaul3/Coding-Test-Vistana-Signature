package com.project.web.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TextHelper {

    private static final Logger logger = LoggerFactory.getLogger(TextHelper.class);

    public String getDesc() {

        logger.debug("getDesc() is executed!");

        return "You have successfully logged in!";
    }

    public String getTitle(String name) {

        logger.debug("getTitle() is executed! $name : {}", name);

        if(StringUtils.isEmpty(name)){
            return "Welcome!";
        }else{
            return "Welcome " + name;
        }

    }
}
