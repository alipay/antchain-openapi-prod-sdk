// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushDubbridgeContractsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同签署事件id
    @NameInMap("sign_event_id")
    @Validation(required = true)
    public String signEventId;

    // 合同签署状态：
    // DRAFT-草稿（合同已创建但未发起签署，待签署状态）；
    // SIGNING-签署中（签署流程已发起，等待各方完成签署）；
    // COMPLETED-已完成（所有签署方均已完成签署，合同生效）；
    // EXPIRED-已过期（超过签署截止时间仍未完成签署）；
    // REJECTED-已拒签（签署方明确拒绝签署该合同）；
    // REVOKED-已撤销（发起方在签署完成前主动撤回/取消了签署流程）；
    // TERMINATED-已终止（签署过程中被强制中止/作废）；
    // DELETED-已删除（合同/签署流程被从系统中删除）
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 合同下载地址（公网）
    @NameInMap("contract_down_url")
    public String contractDownUrl;

    // 签署合同的业务订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    public static PushDubbridgeContractsignRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDubbridgeContractsignRequest self = new PushDubbridgeContractsignRequest();
        return TeaModel.build(map, self);
    }

    public PushDubbridgeContractsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDubbridgeContractsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDubbridgeContractsignRequest setSignEventId(String signEventId) {
        this.signEventId = signEventId;
        return this;
    }
    public String getSignEventId() {
        return this.signEventId;
    }

    public PushDubbridgeContractsignRequest setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public PushDubbridgeContractsignRequest setContractDownUrl(String contractDownUrl) {
        this.contractDownUrl = contractDownUrl;
        return this;
    }
    public String getContractDownUrl() {
        return this.contractDownUrl;
    }

    public PushDubbridgeContractsignRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
