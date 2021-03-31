package com.geekidentity.showcase.sdk.core;

import com.geekidentity.showcase.sdk.core.request.BaseRequest;

public class UserPageRequest extends BaseRequest<UserPageResponse> {
    public UserPageRequest() {
        super("/", HttpMethodType.GET);
    }

    @Override
    public Class<UserPageResponse> getResponseClass() {
        return UserPageResponse.class;
    }
}
