// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallErrorMessage extends TeaModel {
    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // message
    @NameInMap("message")
    public String message;

    // cause
    @NameInMap("cause")
    public String cause;

    public static CallErrorMessage build(java.util.Map<String, ?> map) throws Exception {
        CallErrorMessage self = new CallErrorMessage();
        return TeaModel.build(map, self);
    }

    public CallErrorMessage setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CallErrorMessage setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallErrorMessage setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

}
