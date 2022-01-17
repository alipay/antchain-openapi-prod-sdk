// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiRspCodeVO extends TeaModel {
    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // error_msg
    @NameInMap("error_msg")
    public String errorMsg;

    // error_desc
    @NameInMap("error_desc")
    public String errorDesc;

    public static ApiRspCodeVO build(java.util.Map<String, ?> map) throws Exception {
        ApiRspCodeVO self = new ApiRspCodeVO();
        return TeaModel.build(map, self);
    }

    public ApiRspCodeVO setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ApiRspCodeVO setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ApiRspCodeVO setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

}
