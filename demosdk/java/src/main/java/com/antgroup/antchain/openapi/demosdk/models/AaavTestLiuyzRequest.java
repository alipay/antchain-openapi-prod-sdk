// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class AaavTestLiuyzRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // demo_param
    @NameInMap("demo_param")
    @Validation(required = true)
    public DemoClass demoParam;

    // aa
    @NameInMap("param_a")
    @Validation(required = true)
    public String paramA;

    public static AaavTestLiuyzRequest build(java.util.Map<String, ?> map) throws Exception {
        AaavTestLiuyzRequest self = new AaavTestLiuyzRequest();
        return TeaModel.build(map, self);
    }

    public AaavTestLiuyzRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AaavTestLiuyzRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AaavTestLiuyzRequest setDemoParam(DemoClass demoParam) {
        this.demoParam = demoParam;
        return this;
    }
    public DemoClass getDemoParam() {
        return this.demoParam;
    }

    public AaavTestLiuyzRequest setParamA(String paramA) {
        this.paramA = paramA;
        return this;
    }
    public String getParamA() {
        return this.paramA;
    }

}
