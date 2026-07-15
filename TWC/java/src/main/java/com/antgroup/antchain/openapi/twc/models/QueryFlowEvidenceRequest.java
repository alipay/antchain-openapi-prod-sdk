// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryFlowEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 证据包类型，默认为ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此链下证据包会返回链上证据包，但如果查询链下证据包，则只有等链下证据包完整生成才会返回，否则返回都是生成中。
    @NameInMap("evidence_pack_type")
    @Validation(required = true)
    public String evidencePackType;

    public static QueryFlowEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowEvidenceRequest self = new QueryFlowEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFlowEvidenceRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public QueryFlowEvidenceRequest setEvidencePackType(String evidencePackType) {
        this.evidencePackType = evidencePackType;
        return this;
    }
    public String getEvidencePackType() {
        return this.evidencePackType;
    }

}
