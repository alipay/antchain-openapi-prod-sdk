// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SaveJusticePartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 委托申请方配置ID
    @NameInMap("party_id")
    public Long partyId;

    // 委托申请方类型,目前仅支持企业.
    // 个人: PERSON
    // 企业:ORG
    @NameInMap("party_type")
    @Validation(required = true)
    public String partyType;

    // 企业信息实体;
    // 当申请方类型为企业时,该字段必填;
    @NameInMap("party_organization_info")
    public JudicialOrgInfo partyOrganizationInfo;

    // 案件协同工作联系人信息实体
    @NameInMap("coordinator_person_info")
    public JudicialPersonInfo coordinatorPersonInfo;

    // 案件协同人银行账户信息
    @NameInMap("coordinator_bank_info")
    public JudicialBankInfo coordinatorBankInfo;

    public static SaveJusticePartyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveJusticePartyRequest self = new SaveJusticePartyRequest();
        return TeaModel.build(map, self);
    }

    public SaveJusticePartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveJusticePartyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveJusticePartyRequest setPartyId(Long partyId) {
        this.partyId = partyId;
        return this;
    }
    public Long getPartyId() {
        return this.partyId;
    }

    public SaveJusticePartyRequest setPartyType(String partyType) {
        this.partyType = partyType;
        return this;
    }
    public String getPartyType() {
        return this.partyType;
    }

    public SaveJusticePartyRequest setPartyOrganizationInfo(JudicialOrgInfo partyOrganizationInfo) {
        this.partyOrganizationInfo = partyOrganizationInfo;
        return this;
    }
    public JudicialOrgInfo getPartyOrganizationInfo() {
        return this.partyOrganizationInfo;
    }

    public SaveJusticePartyRequest setCoordinatorPersonInfo(JudicialPersonInfo coordinatorPersonInfo) {
        this.coordinatorPersonInfo = coordinatorPersonInfo;
        return this;
    }
    public JudicialPersonInfo getCoordinatorPersonInfo() {
        return this.coordinatorPersonInfo;
    }

    public SaveJusticePartyRequest setCoordinatorBankInfo(JudicialBankInfo coordinatorBankInfo) {
        this.coordinatorBankInfo = coordinatorBankInfo;
        return this;
    }
    public JudicialBankInfo getCoordinatorBankInfo() {
        return this.coordinatorBankInfo;
    }

}
