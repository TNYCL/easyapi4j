package com.easyapi.request.adapters;

import com.easyapi.request.modules.handlers.IRequest;

import java.util.concurrent.ConcurrentHashMap;

public class RequestAdapter {

    public static ConcurrentHashMap<String, IRequest> registeredRequests = new ConcurrentHashMap<>();

    public static void registerRequest(IRequest request) {
        registeredRequests.put(request.getClass().getSimpleName().toLowerCase(), request);
    }

}
