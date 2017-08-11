package com.project.web.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "fields",
        "createdTime"
})
public class Record implements Serializable
{

    private long getSerialVersionUID = 1L;

    @JsonProperty("id")
    private String id;
    @JsonProperty("fields")
    private Fields fields;
    @JsonProperty("createdTime")
    private String createdTime;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7896633176497250837L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Record() {
    }

    /**
     *
     * @param id
     * @param createdTime
     * @param fields
     */
    public Record(String id, Fields fields, String createdTime) {
        super();
        this.id = id;
        this.fields = fields;
        this.createdTime = createdTime;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Record withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("fields")
    public Fields getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Record withFields(Fields fields) {
        this.fields = fields;
        return this;
    }

    @JsonProperty("createdTime")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("createdTime")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Record withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Record withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}