package com.easyapi;

import com.easyapi.request.adapters.RequestAdapter;
import com.easyapi.request.modules.handlers.IRequest;

public abstract class EasyAPI {

    protected static void StartEasyAPI() {

    }

    protected static void registerRequestProvider(IRequest request) {
        RequestAdapter.registerRequest(request);
    }

}