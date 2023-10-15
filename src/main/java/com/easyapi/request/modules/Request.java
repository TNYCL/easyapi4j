package com.easyapi.request.modules;

import com.easyapi.request.models.Header;
import com.easyapi.request.models.enums.ContentType;
import com.easyapi.request.modules.handlers.IRequest;
import lombok.Getter;

@Getter
public class Request implements IRequest {

    private String url; //Without https://
    private ContentType contentType;
    private boolean ssl = true;

    public Request(String url, ContentType contentType, boolean ssl) {
        this.url = url;
        this.contentType = contentType;
        this.ssl = ssl;
    }

    public Request(String url, ContentType contentType) {
        this(url, contentType, true);
    }

    @Override
    public <T> Object sendRequest(T data, Header... header) {
        return null;
    }

}
