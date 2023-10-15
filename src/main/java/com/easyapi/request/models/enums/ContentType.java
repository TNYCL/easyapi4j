package com.easyapi.request.models.enums;

import lombok.Getter;

@Getter
public enum ContentType {

    JSON("application/json"),
    XML("application/xml"),
    X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded"),
    TEXT_PLAIN("text/plain");

    private final String contentTypeName;

    ContentType(String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }

}
