// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class LllProxyLyzTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试
    @NameInMap("param_a")
    @Validation(required = true)
    public InitPack paramA;

    // aa
    @NameInMap("param_c")
    @Validation(required = true)
    public ResultTest paramC;

    public static LllProxyLyzTestRequest build(java.util.Map<String, ?> map) throws Exception {
        LllProxyLyzTestRequest self = new LllProxyLyzTestRequest();
        return TeaModel.build(map, self);
    }

    public LllProxyLyzTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LllProxyLyzTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LllProxyLyzTestRequest setParamA(InitPack paramA) {
        this.paramA = paramA;
        return this;
    }
    public InitPack getParamA() {
        return this.paramA;
    }

    public LllProxyLyzTestRequest setParamC(ResultTest paramC) {
        this.paramC = paramC;
        return this;
    }
    public ResultTest getParamC() {
        return this.paramC;
    }

}
