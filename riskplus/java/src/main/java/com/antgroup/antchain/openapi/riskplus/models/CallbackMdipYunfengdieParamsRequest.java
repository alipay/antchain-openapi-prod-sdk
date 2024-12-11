// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CallbackMdipYunfengdieParamsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回调参数
    @NameInMap("params_map")
    @Validation(required = true)
    public String paramsMap;

    public static CallbackMdipYunfengdieParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMdipYunfengdieParamsRequest self = new CallbackMdipYunfengdieParamsRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMdipYunfengdieParamsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMdipYunfengdieParamsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackMdipYunfengdieParamsRequest setParamsMap(String paramsMap) {
        this.paramsMap = paramsMap;
        return this;
    }
    public String getParamsMap() {
        return this.paramsMap;
    }

}
