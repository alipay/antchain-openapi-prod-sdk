// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PartnerPolicyRelation extends TeaModel {
    // 合同id
    @NameInMap("agreement_id")
    @Validation(required = true)
    public String agreementId;

    // 服务商id
    @NameInMap("sp_id")
    @Validation(required = true)
    public String spId;

    // 合同生效时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 合同失效时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 合同取消时间
    @NameInMap("cancel_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String cancelTime;

    // 政策id
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    // 政策名称
    @NameInMap("policy_name")
    @Validation(required = true)
    public String policyName;

    // 政策类型
    @NameInMap("policy_type")
    @Validation(required = true)
    public String policyType;

    // 政策link
    @NameInMap("policy_link")
    public String policyLink;

    // 政策所属ou
    @NameInMap("policy_ou")
    public String policyOu;

    // 结算类型
    @NameInMap("settle_type")
    @Validation(required = true)
    public String settleType;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    public static PartnerPolicyRelation build(java.util.Map<String, ?> map) throws Exception {
        PartnerPolicyRelation self = new PartnerPolicyRelation();
        return TeaModel.build(map, self);
    }

    public PartnerPolicyRelation setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public PartnerPolicyRelation setSpId(String spId) {
        this.spId = spId;
        return this;
    }
    public String getSpId() {
        return this.spId;
    }

    public PartnerPolicyRelation setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PartnerPolicyRelation setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PartnerPolicyRelation setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
        return this;
    }
    public String getCancelTime() {
        return this.cancelTime;
    }

    public PartnerPolicyRelation setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public PartnerPolicyRelation setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public PartnerPolicyRelation setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public PartnerPolicyRelation setPolicyLink(String policyLink) {
        this.policyLink = policyLink;
        return this;
    }
    public String getPolicyLink() {
        return this.policyLink;
    }

    public PartnerPolicyRelation setPolicyOu(String policyOu) {
        this.policyOu = policyOu;
        return this;
    }
    public String getPolicyOu() {
        return this.policyOu;
    }

    public PartnerPolicyRelation setSettleType(String settleType) {
        this.settleType = settleType;
        return this;
    }
    public String getSettleType() {
        return this.settleType;
    }

    public PartnerPolicyRelation setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PartnerPolicyRelation setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

}
