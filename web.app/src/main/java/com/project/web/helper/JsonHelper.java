package com.project.web.helper;

import java.io.IOException;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Provides functionality for serializing and de-serializing JSON data.
 *
 */
class JsonHelper {

    public static <T> T doDeserialize(String jsonData, Class<T> type) {
        T result = null;
        Logger logger = Logger.getLogger(JsonHelper.class.getName());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        if (null != jsonData) {
            try {
                result = objectMapper.readValue(jsonData, type);
            } catch (IOException e) {
                logger.warning(e.getMessage());
            }
        }

        if (null == result) {
            try {
                result = type.newInstance();
            } catch (InstantiationException e) {
                result = null;
            } catch (IllegalAccessException e) {
                result = null;
            }
        }

        return result;
    }
}
