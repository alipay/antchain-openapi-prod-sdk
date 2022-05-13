// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ExistStubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 客户id。支付宝情况下传支付宝id，2088打头；景区情况下为自定义的客户id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 景区名称
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    public static ExistStubRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistStubRequest self = new ExistStubRequest();
        return TeaModel.build(map, self);
    }

    public ExistStubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistStubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExistStubRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ExistStubRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ExistStubRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

}
