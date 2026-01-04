// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwo.models;

import com.aliyun.tea.*;

public class TestAntchainDemotmtWorkbenchCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时
    @NameInMap("timeout")
    public String timeout;

    public static TestAntchainDemotmtWorkbenchCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        TestAntchainDemotmtWorkbenchCreateRequest self = new TestAntchainDemotmtWorkbenchCreateRequest();
        return TeaModel.build(map, self);
    }

    public TestAntchainDemotmtWorkbenchCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestAntchainDemotmtWorkbenchCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TestAntchainDemotmtWorkbenchCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
