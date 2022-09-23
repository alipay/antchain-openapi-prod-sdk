// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeChaincaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案由
    @NameInMap("case_reason")
    @Validation(required = true)
    public String caseReason;

    // 业务类型
    // LEASE- 租赁 
    // HB_FINANCIAL - HB金融,其他不支持
    @NameInMap("case_type")
    @Validation(required = true)
    public String caseType;

    // 外部业务ID
    @NameInMap("external_biz_id")
    @Validation(required = true)
    public String externalBizId;

    // 业务描述,用于案件的补充描述; 没有则不填
    @NameInMap("case_desc")
    public String caseDesc;

    // 当事人(申请人)ID, 案件填充信息返回
    @NameInMap("party_id")
    @Validation(required = true)
    public Long partyId;

    // 全流程存证信息
    @NameInMap("notary_flow_infos")
    @Validation(required = true)
    public java.util.List<NotaryFlowDetailQueryReq> notaryFlowInfos;

    public static CreateJusticeChaincaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeChaincaseRequest self = new CreateJusticeChaincaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeChaincaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeChaincaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeChaincaseRequest setCaseReason(String caseReason) {
        this.caseReason = caseReason;
        return this;
    }
    public String getCaseReason() {
        return this.caseReason;
    }

    public CreateJusticeChaincaseRequest setCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }
    public String getCaseType() {
        return this.caseType;
    }

    public CreateJusticeChaincaseRequest setExternalBizId(String externalBizId) {
        this.externalBizId = externalBizId;
        return this;
    }
    public String getExternalBizId() {
        return this.externalBizId;
    }

    public CreateJusticeChaincaseRequest setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
        return this;
    }
    public String getCaseDesc() {
        return this.caseDesc;
    }

    public CreateJusticeChaincaseRequest setPartyId(Long partyId) {
        this.partyId = partyId;
        return this;
    }
    public Long getPartyId() {
        return this.partyId;
    }

    public CreateJusticeChaincaseRequest setNotaryFlowInfos(java.util.List<NotaryFlowDetailQueryReq> notaryFlowInfos) {
        this.notaryFlowInfos = notaryFlowInfos;
        return this;
    }
    public java.util.List<NotaryFlowDetailQueryReq> getNotaryFlowInfos() {
        return this.notaryFlowInfos;
    }

}
