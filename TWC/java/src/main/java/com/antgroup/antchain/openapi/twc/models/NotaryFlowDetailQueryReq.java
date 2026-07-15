// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NotaryFlowDetailQueryReq extends TeaModel {
    // 全流程存证模板ID
    /**
     * <strong>example:</strong>
     * <p>someId</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 全流程存证流程id
    /**
     * <strong>example:</strong>
     * <p>someId</p>
     */
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 链上证据包对应的链上交易Hash
    /**
     * <strong>example:</strong>
     * <p>9d5f26c7469ea9699a6e5f03ecfce24d</p>
     */
    @NameInMap("chain_pack_tx_hash")
    @Validation(required = true)
    public String chainPackTxHash;

    // 链上证据包授权码
    /**
     * <strong>example:</strong>
     * <p>someId</p>
     */
    @NameInMap("authcode")
    @Validation(required = true)
    public String authcode;

    public static NotaryFlowDetailQueryReq build(java.util.Map<String, ?> map) throws Exception {
        NotaryFlowDetailQueryReq self = new NotaryFlowDetailQueryReq();
        return TeaModel.build(map, self);
    }

    public NotaryFlowDetailQueryReq setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public NotaryFlowDetailQueryReq setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public NotaryFlowDetailQueryReq setChainPackTxHash(String chainPackTxHash) {
        this.chainPackTxHash = chainPackTxHash;
        return this;
    }
    public String getChainPackTxHash() {
        return this.chainPackTxHash;
    }

    public NotaryFlowDetailQueryReq setAuthcode(String authcode) {
        this.authcode = authcode;
        return this;
    }
    public String getAuthcode() {
        return this.authcode;
    }

}
