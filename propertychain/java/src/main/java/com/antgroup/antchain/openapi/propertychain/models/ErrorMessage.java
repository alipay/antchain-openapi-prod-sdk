// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ErrorMessage extends TeaModel {
    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息描述
    @NameInMap("error_msg")
    public String errorMsg;

    public static ErrorMessage build(java.util.Map<String, ?> map) throws Exception {
        ErrorMessage self = new ErrorMessage();
        return TeaModel.build(map, self);
    }

    public ErrorMessage setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ErrorMessage setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
