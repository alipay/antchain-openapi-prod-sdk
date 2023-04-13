// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class QueryInstanceStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 工作流的flowId
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 工作流实例instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QueryInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceStatusRequest self = new QueryInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInstanceStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInstanceStatusRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
