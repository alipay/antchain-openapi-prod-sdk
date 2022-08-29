// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyFlowEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 证据包类型，默认为ChainEvidencePack(链上证据包)，按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
    // 链上证据包，即全流程所有阶段存证关系链上固化，生成全流程链上证据统一txHash；
    // 链下证据包，即全流程所有内容生成链下压缩包文件。
    @NameInMap("evidence_pack_type")
    @Validation(required = true)
    public String evidencePackType;

    public static ApplyFlowEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFlowEvidenceRequest self = new ApplyFlowEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFlowEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyFlowEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyFlowEvidenceRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ApplyFlowEvidenceRequest setEvidencePackType(String evidencePackType) {
        this.evidencePackType = evidencePackType;
        return this;
    }
    public String getEvidencePackType() {
        return this.evidencePackType;
    }

}
