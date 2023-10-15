package com.easyapi.request.modules.handlers;

import com.easyapi.request.models.Header;

public interface IRequest {

    <T> Object sendRequest(T data, Header... header);

}
