// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestaStructCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 信息
    @NameInMap("test_param_b")
    public DemosdkStructA testParamB;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    public static TestaStructCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        TestaStructCreateRequest self = new TestaStructCreateRequest();
        return TeaModel.build(map, self);
    }

    public TestaStructCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestaStructCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TestaStructCreateRequest setTestParamB(DemosdkStructA testParamB) {
        this.testParamB = testParamB;
        return this;
    }
    public DemosdkStructA getTestParamB() {
        return this.testParamB;
    }

    public TestaStructCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
