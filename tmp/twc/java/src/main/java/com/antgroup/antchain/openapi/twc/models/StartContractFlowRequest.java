// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StartContractFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程ID
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    public static StartContractFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartContractFlowRequest self = new StartContractFlowRequest();
        return TeaModel.build(map, self);
    }

    public StartContractFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartContractFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartContractFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
