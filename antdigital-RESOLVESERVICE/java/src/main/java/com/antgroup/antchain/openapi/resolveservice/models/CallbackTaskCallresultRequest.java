// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class CallbackTaskCallresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 错误编码(0: 正确)
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 通话结果
    @NameInMap("dial_result")
    @Validation(required = true)
    public String dialResult;

    public static CallbackTaskCallresultRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackTaskCallresultRequest self = new CallbackTaskCallresultRequest();
        return TeaModel.build(map, self);
    }

    public CallbackTaskCallresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackTaskCallresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackTaskCallresultRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CallbackTaskCallresultRequest setDialResult(String dialResult) {
        this.dialResult = dialResult;
        return this;
    }
    public String getDialResult() {
        return this.dialResult;
    }

}
