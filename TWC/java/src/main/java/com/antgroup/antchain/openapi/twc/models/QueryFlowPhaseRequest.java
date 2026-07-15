// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryFlowPhaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 阶段id，通过twc.notary.flow.phase.init获取
    @NameInMap("phase_id")
    @Validation(required = true)
    public String phaseId;

    public static QueryFlowPhaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowPhaseRequest self = new QueryFlowPhaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowPhaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowPhaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFlowPhaseRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryFlowPhaseRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

}
