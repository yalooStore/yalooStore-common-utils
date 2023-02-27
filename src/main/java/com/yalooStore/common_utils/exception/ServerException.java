package com.yalooStore.common_utils.exception;

import com.yalooStore.common_utils.code.ErrorCode;
import org.springframework.http.HttpStatus;

public class ServerException extends RuntimeException{

    private final ErrorCode errorCode;
    private final HttpStatus responseStatus;

    public ServerException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.responseStatus = errorCode.getResponseStatus();
    }

    public String getErrorMessage(){
        return errorCode.getName();
    }

}
