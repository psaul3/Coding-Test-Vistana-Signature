package com.project.web.helper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Provides functionality for serializing and deserializing JSON data.
 *
 */
public class JsonHelper {

    /**
     * Serializes an object into a stream.
     *
     * @param target
     * @return Binary Stream representation of the target Object.
     * @throws IOException
     */
    public static <T> InputStream doSerializeAsStream(T target)
            throws IOException {
        InputStream result;
        String serializedData = JsonHelper.doSerialize(target);

        if (null != serializedData && serializedData.length() > 0) {
            result = new ByteArrayInputStream(serializedData.getBytes("UTF-8"));
        } else {
            result = null;
        }

        return result;
    }

    /**
     * Serializes an object into it's JSON string representation.
     *
     * @param jsonObject
     * @return String representation of the target Object.
     * @throws JsonProcessingException
     */
    public static <T> String doSerialize(T target)
            throws JsonProcessingException {
        String result;

        if (null != target) {
            ObjectMapper mapper = new ObjectMapper();

            result = mapper.writeValueAsString(target);
        } else {
            result = null;
        }

        return result;
    }

    /**
     * Parses an InputStream to the desired object class type and closes the
     * source input stream.
     *
     * @param jsonData
     * @param type
     * @return The parsed object acquired from the InputStream.
     */
    public static <T> T doDeserialize(InputStream jsonData, Class<T> type) {
        return doDeserialize(jsonData, type, true);
    }

    public static <T> T doDeserialize(InputStream jsonData, Class<T> type,
                                      boolean autoClose) {
        T result = null;
        Logger logger = Logger.getLogger(JsonHelper.class.getName());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        if (null != jsonData) {
            try {
                result = objectMapper.readValue(jsonData, type);
            } catch (JsonParseException e) {
                logger.warning(e.getMessage());
            } catch (JsonMappingException e) {
                logger.warning(e.getMessage());
            } catch (IOException e) {
                logger.warning(e.getMessage());
            }
        }

        if (null == result) {
            try {
                result = type.newInstance();
            } catch (InstantiationException e) {
                logger.warning(e.getMessage());
                result = null;
            } catch (IllegalAccessException e) {
                logger.warning(e.getMessage());
                result = null;
            }
        }

        if (autoClose && null != jsonData) {
            try {
                jsonData.close();
            } catch (IOException e) {
                logger.warning(e.getMessage());
            }
        }

        return result;
    }

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

    /**
     * Parses an InputStream to the desired object Jackson TypeReference object
     * and closes the InputStream. The TypeReference is useful when the desired
     * object contains generic properties.
     *
     * @param jsonData
     * @param valueTypeRef
     * @return
     */
    public static <T> T doDeserialize(InputStream jsonData,
                                      TypeReference<T> valueTypeRef) {
        return doDeserialize(jsonData, valueTypeRef, true);
    }

    public static <T> T doDeserialize(InputStream jsonData,
                                      TypeReference<T> valueTypeRef, boolean autoClose) {
        T result = null;
        Logger logger = Logger.getLogger(JsonHelper.class.getName());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        if (null != jsonData) {
            try {
                result = objectMapper.readValue(jsonData, valueTypeRef);
            } catch (IOException e) {
                logger.warning(e.getMessage());
            }
        }

        if (autoClose && null != jsonData) {
            try {
                jsonData.close();
            } catch (IOException e) {
                logger.warning(e.getMessage());
            }
        }

        return result;
    }

    public static <T> T doDeserialize(String jsonData,
                                      TypeReference<T> valueTypeRef) {
        T result = null;
        Logger logger = Logger.getLogger(JsonHelper.class.getName());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        if (null != jsonData) {
            try {
                result = objectMapper.readValue(jsonData, valueTypeRef);
            } catch (IOException e) {
                logger.warning(e.getMessage());
            }
        }

        return result;
    }

}
