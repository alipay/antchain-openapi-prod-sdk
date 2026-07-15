// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DetailFlowInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 链上证据包对应的链上交易Hash，通过twc.notary.flow.evidence.query(全流程证据包生成进度查询)获取
    @NameInMap("chain_pack_tx_hash")
    @Validation(required = true)
    public String chainPackTxHash;

    // 链上证据包授权码，不传默认按照当前租户校验，填写则按照授权租户检查
    @NameInMap("auth_code")
    public String authCode;

    public static DetailFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailFlowInstanceRequest self = new DetailFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DetailFlowInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailFlowInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailFlowInstanceRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DetailFlowInstanceRequest setChainPackTxHash(String chainPackTxHash) {
        this.chainPackTxHash = chainPackTxHash;
        return this;
    }
    public String getChainPackTxHash() {
        return this.chainPackTxHash;
    }

    public DetailFlowInstanceRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
