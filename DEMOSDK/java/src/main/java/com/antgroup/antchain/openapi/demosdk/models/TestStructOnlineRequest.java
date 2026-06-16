// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TestStructOnlineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 结构体参数
    @NameInMap("struct")
    public TestParams struct;

    public static TestStructOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        TestStructOnlineRequest self = new TestStructOnlineRequest();
        return TeaModel.build(map, self);
    }

    public TestStructOnlineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestStructOnlineRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TestStructOnlineRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public TestStructOnlineRequest setStruct(TestParams struct) {
        this.struct = struct;
        return this;
    }
    public TestParams getStruct() {
        return this.struct;
    }

}
