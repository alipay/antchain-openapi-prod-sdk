// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ParamLiuyzTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aaa
    @NameInMap("param_a")
    @Validation(required = true)
    public String paramA;

    public static ParamLiuyzTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ParamLiuyzTestRequest self = new ParamLiuyzTestRequest();
        return TeaModel.build(map, self);
    }

    public ParamLiuyzTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ParamLiuyzTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ParamLiuyzTestRequest setParamA(String paramA) {
        this.paramA = paramA;
        return this;
    }
    public String getParamA() {
        return this.paramA;
    }

}
