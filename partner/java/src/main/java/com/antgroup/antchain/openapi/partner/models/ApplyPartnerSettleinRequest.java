// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ApplyPartnerSettleinRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户来源-用于租户隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 入驻的一级伙伴类型
    @NameInMap("l1_partner_type")
    @Validation(required = true)
    public String l1PartnerType;

    // 入驻的二级合作类型
    @NameInMap("l2_partner_type")
    @Validation(required = true)
    public String l2PartnerType;

    // 入驻申请业务单据号-幂等使用
    @NameInMap("business_no")
    @Validation(required = true)
    public String businessNo;

    // 合作方信息
    @NameInMap("partner_information")
    @Validation(required = true)
    public PartnerInformation partnerInformation;

    // 参与人列表
    @NameInMap("participants")
    @Validation(required = true)
    public java.util.List<Participant> participants;

    // 签约请求
    @NameInMap("sign_request")
    @Validation(required = true)
    public SignRequest signRequest;

    // 入驻申请扩展信息
    @NameInMap("extend_info")
    public String extendInfo;

    // 入驻申请时间
    @NameInMap("apply_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String applyTime;

    // 入驻申请类型：新签、改签、续签
    @NameInMap("apply_operate_type")
    @Validation(required = true)
    public String applyOperateType;

    public static ApplyPartnerSettleinRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPartnerSettleinRequest self = new ApplyPartnerSettleinRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPartnerSettleinRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPartnerSettleinRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyPartnerSettleinRequest setL1PartnerType(String l1PartnerType) {
        this.l1PartnerType = l1PartnerType;
        return this;
    }
    public String getL1PartnerType() {
        return this.l1PartnerType;
    }

    public ApplyPartnerSettleinRequest setL2PartnerType(String l2PartnerType) {
        this.l2PartnerType = l2PartnerType;
        return this;
    }
    public String getL2PartnerType() {
        return this.l2PartnerType;
    }

    public ApplyPartnerSettleinRequest setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
        return this;
    }
    public String getBusinessNo() {
        return this.businessNo;
    }

    public ApplyPartnerSettleinRequest setPartnerInformation(PartnerInformation partnerInformation) {
        this.partnerInformation = partnerInformation;
        return this;
    }
    public PartnerInformation getPartnerInformation() {
        return this.partnerInformation;
    }

    public ApplyPartnerSettleinRequest setParticipants(java.util.List<Participant> participants) {
        this.participants = participants;
        return this;
    }
    public java.util.List<Participant> getParticipants() {
        return this.participants;
    }

    public ApplyPartnerSettleinRequest setSignRequest(SignRequest signRequest) {
        this.signRequest = signRequest;
        return this;
    }
    public SignRequest getSignRequest() {
        return this.signRequest;
    }

    public ApplyPartnerSettleinRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public ApplyPartnerSettleinRequest setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public String getApplyTime() {
        return this.applyTime;
    }

    public ApplyPartnerSettleinRequest setApplyOperateType(String applyOperateType) {
        this.applyOperateType = applyOperateType;
        return this;
    }
    public String getApplyOperateType() {
        return this.applyOperateType;
    }

}
