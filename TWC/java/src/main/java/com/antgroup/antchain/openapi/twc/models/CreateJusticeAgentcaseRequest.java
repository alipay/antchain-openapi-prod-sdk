// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeAgentcaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案由
    @NameInMap("case_reason")
    @Validation(required = true)
    public String caseReason;

    // 业务类型，LEASE- 租赁 ，HB_FINANCIAL - HB金融， 模板创建的其他业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 二级商户租户ID，八位字母
    @NameInMap("sub_tenant_id")
    @Validation(required = true)
    public String subTenantId;

    // 外部业务ID
    @NameInMap("external_biz_id")
    @Validation(required = true)
    public String externalBizId;

    // 业务描述,用于案件的补充描述; 没有则不填
    @NameInMap("case_desc")
    public String caseDesc;

    // 根据案件要素模板对应提供要素信息
    @NameInMap("business_info")
    @Validation(required = true)
    public String businessInfo;

    // 根据案件要素模板对应提供证据信息
    @NameInMap("evidence_info")
    public String evidenceInfo;

    public static CreateJusticeAgentcaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeAgentcaseRequest self = new CreateJusticeAgentcaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeAgentcaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeAgentcaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeAgentcaseRequest setCaseReason(String caseReason) {
        this.caseReason = caseReason;
        return this;
    }
    public String getCaseReason() {
        return this.caseReason;
    }

    public CreateJusticeAgentcaseRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateJusticeAgentcaseRequest setSubTenantId(String subTenantId) {
        this.subTenantId = subTenantId;
        return this;
    }
    public String getSubTenantId() {
        return this.subTenantId;
    }

    public CreateJusticeAgentcaseRequest setExternalBizId(String externalBizId) {
        this.externalBizId = externalBizId;
        return this;
    }
    public String getExternalBizId() {
        return this.externalBizId;
    }

    public CreateJusticeAgentcaseRequest setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
        return this;
    }
    public String getCaseDesc() {
        return this.caseDesc;
    }

    public CreateJusticeAgentcaseRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateJusticeAgentcaseRequest setEvidenceInfo(String evidenceInfo) {
        this.evidenceInfo = evidenceInfo;
        return this;
    }
    public String getEvidenceInfo() {
        return this.evidenceInfo;
    }

}
