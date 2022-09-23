// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeNormalcaseRequest extends TeaModel {
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
    // HB_FINANCIAL - HB金融
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

    // 针对对应业务类型的证据要素补充.
    @NameInMap("case_biz_element_info")
    @Validation(required = true)
    public String caseBizElementInfo;

    // 当事人(申请人)ID, 案件填充信息返回
    @NameInMap("party_id")
    @Validation(required = true)
    public Long partyId;

    // 答辩人类型, 目前仅支持个人.
    // PERSON , 个人
    // ORG , 机构
    @NameInMap("pleader_type")
    @Validation(required = true)
    public String pleaderType;

    // 答辩人(自然人)信息, 类型为个人时必填
    @NameInMap("pleader_person_info")
    public JudicialPersonInfo pleaderPersonInfo;

    public static CreateJusticeNormalcaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeNormalcaseRequest self = new CreateJusticeNormalcaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeNormalcaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeNormalcaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeNormalcaseRequest setCaseReason(String caseReason) {
        this.caseReason = caseReason;
        return this;
    }
    public String getCaseReason() {
        return this.caseReason;
    }

    public CreateJusticeNormalcaseRequest setCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }
    public String getCaseType() {
        return this.caseType;
    }

    public CreateJusticeNormalcaseRequest setExternalBizId(String externalBizId) {
        this.externalBizId = externalBizId;
        return this;
    }
    public String getExternalBizId() {
        return this.externalBizId;
    }

    public CreateJusticeNormalcaseRequest setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
        return this;
    }
    public String getCaseDesc() {
        return this.caseDesc;
    }

    public CreateJusticeNormalcaseRequest setCaseBizElementInfo(String caseBizElementInfo) {
        this.caseBizElementInfo = caseBizElementInfo;
        return this;
    }
    public String getCaseBizElementInfo() {
        return this.caseBizElementInfo;
    }

    public CreateJusticeNormalcaseRequest setPartyId(Long partyId) {
        this.partyId = partyId;
        return this;
    }
    public Long getPartyId() {
        return this.partyId;
    }

    public CreateJusticeNormalcaseRequest setPleaderType(String pleaderType) {
        this.pleaderType = pleaderType;
        return this;
    }
    public String getPleaderType() {
        return this.pleaderType;
    }

    public CreateJusticeNormalcaseRequest setPleaderPersonInfo(JudicialPersonInfo pleaderPersonInfo) {
        this.pleaderPersonInfo = pleaderPersonInfo;
        return this;
    }
    public JudicialPersonInfo getPleaderPersonInfo() {
        return this.pleaderPersonInfo;
    }

}
