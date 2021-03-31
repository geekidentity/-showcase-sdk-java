package com.geekidentity.showcase.sdk.core.response;

import com.geekidentity.showcase.sdk.core.exceptions.ErrorModel;

/**
 * @author houfc
 * @date 2018/11/27
 */
public class ErrorResponse extends BaseResponse {

    private ErrorModel error;

    public ErrorModel getError() {
        return error;
    }

    public void setError(ErrorModel error) {
        this.error = error;
    }
}