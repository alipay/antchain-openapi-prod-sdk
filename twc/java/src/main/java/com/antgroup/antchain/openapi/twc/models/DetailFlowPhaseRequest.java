// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DetailFlowPhaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 阶段ID，通过twc.notary.flow.phase.create(创建阶段存证)创建了阶段存证获取
    @NameInMap("phase_id")
    @Validation(required = true)
    public String phaseId;

    // 链上交易Hash，必须成功阶段存证后，通过twc.notary.flow.phase.query获取
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static DetailFlowPhaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailFlowPhaseRequest self = new DetailFlowPhaseRequest();
        return TeaModel.build(map, self);
    }

    public DetailFlowPhaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailFlowPhaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailFlowPhaseRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DetailFlowPhaseRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public DetailFlowPhaseRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
