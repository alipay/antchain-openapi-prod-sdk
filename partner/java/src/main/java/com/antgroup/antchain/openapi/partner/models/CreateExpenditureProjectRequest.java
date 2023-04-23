// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class CreateExpenditureProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户来源-用于租户间功能和数据隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 合作计划id
    @NameInMap("cooperation_plan_id")
    @Validation(required = true)
    public Long cooperationPlanId;

    // 业务单据号-用于幂等
    @NameInMap("business_no")
    @Validation(required = true)
    public String businessNo;

    // 合作方-用户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 参与人列表
    @NameInMap("participants")
    @Validation(required = true)
    public java.util.List<Participant> participants;

    // 支出配置单请求信息
    @NameInMap("expenditure_quotation_request")
    @Validation(required = true)
    public ExpenditureQuotationRequest expenditureQuotationRequest;

    // 签约请求
    @NameInMap("sign_request")
    @Validation(required = true)
    public SignRequest signRequest;

    // 结算请求
    @NameInMap("settlement_request")
    @Validation(required = true)
    public SettlementRequest settlementRequest;

    // 生效时间
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 失效时间
    @NameInMap("invalid_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    // 扩展信息
    @NameInMap("extend_info")
    @Validation(required = true)
    public String extendInfo;

    public static CreateExpenditureProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpenditureProjectRequest self = new CreateExpenditureProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpenditureProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateExpenditureProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateExpenditureProjectRequest setCooperationPlanId(Long cooperationPlanId) {
        this.cooperationPlanId = cooperationPlanId;
        return this;
    }
    public Long getCooperationPlanId() {
        return this.cooperationPlanId;
    }

    public CreateExpenditureProjectRequest setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
        return this;
    }
    public String getBusinessNo() {
        return this.businessNo;
    }

    public CreateExpenditureProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateExpenditureProjectRequest setParticipants(java.util.List<Participant> participants) {
        this.participants = participants;
        return this;
    }
    public java.util.List<Participant> getParticipants() {
        return this.participants;
    }

    public CreateExpenditureProjectRequest setExpenditureQuotationRequest(ExpenditureQuotationRequest expenditureQuotationRequest) {
        this.expenditureQuotationRequest = expenditureQuotationRequest;
        return this;
    }
    public ExpenditureQuotationRequest getExpenditureQuotationRequest() {
        return this.expenditureQuotationRequest;
    }

    public CreateExpenditureProjectRequest setSignRequest(SignRequest signRequest) {
        this.signRequest = signRequest;
        return this;
    }
    public SignRequest getSignRequest() {
        return this.signRequest;
    }

    public CreateExpenditureProjectRequest setSettlementRequest(SettlementRequest settlementRequest) {
        this.settlementRequest = settlementRequest;
        return this;
    }
    public SettlementRequest getSettlementRequest() {
        return this.settlementRequest;
    }

    public CreateExpenditureProjectRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public CreateExpenditureProjectRequest setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public CreateExpenditureProjectRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

}
