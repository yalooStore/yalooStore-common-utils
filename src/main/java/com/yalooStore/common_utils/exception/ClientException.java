
package com.yalooStore.common_utils.exception;

import com.yalooStore.common_utils.code.ErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 클라이언트(사용자, 브라우저)의 요청에 예외가 발생할 경우 사용하는 예외 클래스입니다.
 * */
public class ClientException extends RuntimeException{

    private final ErrorCode errorCode;
    private final HttpStatus responseStatus;

    public ClientException(ErrorCode errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
        this.responseStatus = errorCode.getResponseStatus();
    }

    public String getErrorMessage(){
        return errorCode.getName();
    }

}