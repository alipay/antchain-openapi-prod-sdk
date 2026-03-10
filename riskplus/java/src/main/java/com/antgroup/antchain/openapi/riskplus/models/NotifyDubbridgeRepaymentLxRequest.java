// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyDubbridgeRepaymentLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 还款请求流水号/账单号
    @NameInMap("bill_id")
    @Validation(required = true)
    public String billId;

    // 贷款申请编号
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 是否本次还款最后一次通知，
    // 1-是
    // 2-否
    // 用户一次还多期时，该笔还款按期多次通知，最后一次通知为是。为否时没有还款计划列表。
    @NameInMap("last_notify")
    @Validation(required = true)
    public Long lastNotify;

    // 代扣请求流水号
    @NameInMap("withhold_serial_no")
    public String withholdSerialNo;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    // 还款类型，
    // 不同还款类型分开通知：
    // 10-正常还款,
    // 20-部分提前还,
    // 30-提前结清,
    // 40-逾期还款
    // 50-代偿
    @NameInMap("repay_type")
    @Validation(required = true)
    public Long repayType;

    // 还款路径，
    // 1-清分 2-代扣
    @NameInMap("repay_channel")
    @Validation(required = true)
    public String repayChannel;

    // 还款期数
    @NameInMap("repay_term")
    @Validation(required = true)
    public String repayTerm;

    // 还款日期
    @NameInMap("repay_date")
    @Validation(required = true)
    public String repayDate;

    // 还款总额,保留两位有效数字(单位:元)
    @NameInMap("repay_amount")
    @Validation(required = true)
    public String repayAmount;

    // 实还本金,保留两位有效数字(单位:元)
    @NameInMap("repay_principal")
    @Validation(required = true)
    public String repayPrincipal;

    // 实还利息,保留两位有效数字(单位:元)
    @NameInMap("repay_interest")
    @Validation(required = true)
    public String repayInterest;

    // 实还罚息,保留两位有效数字(单位:元)
    @NameInMap("repay_muclt")
    public String repayMuclt;

    // 实还担保费,保留两位有效数字(单位:元)
    @NameInMap("repay_guarantee")
    public String repayGuarantee;

    // 当期结清状态：
    // 0-当期未结清
    // 1-当期已结清
    @NameInMap("repayment_mode")
    @Validation(required = true)
    public String repaymentMode;

    // 还款计划列表，随借随还业务更新后的还款计划列表
    @NameInMap("rpy_details")
    public java.util.List<BillDetail> rpyDetails;

    public static NotifyDubbridgeRepaymentLxRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyDubbridgeRepaymentLxRequest self = new NotifyDubbridgeRepaymentLxRequest();
        return TeaModel.build(map, self);
    }

    public NotifyDubbridgeRepaymentLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyDubbridgeRepaymentLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyDubbridgeRepaymentLxRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public NotifyDubbridgeRepaymentLxRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public NotifyDubbridgeRepaymentLxRequest setLastNotify(Long lastNotify) {
        this.lastNotify = lastNotify;
        return this;
    }
    public Long getLastNotify() {
        return this.lastNotify;
    }

    public NotifyDubbridgeRepaymentLxRequest setWithholdSerialNo(String withholdSerialNo) {
        this.withholdSerialNo = withholdSerialNo;
        return this;
    }
    public String getWithholdSerialNo() {
        return this.withholdSerialNo;
    }

    public NotifyDubbridgeRepaymentLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayType(Long repayType) {
        this.repayType = repayType;
        return this;
    }
    public Long getRepayType() {
        return this.repayType;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayChannel(String repayChannel) {
        this.repayChannel = repayChannel;
        return this;
    }
    public String getRepayChannel() {
        return this.repayChannel;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayTerm(String repayTerm) {
        this.repayTerm = repayTerm;
        return this;
    }
    public String getRepayTerm() {
        return this.repayTerm;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public String getRepayAmount() {
        return this.repayAmount;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayPrincipal(String repayPrincipal) {
        this.repayPrincipal = repayPrincipal;
        return this;
    }
    public String getRepayPrincipal() {
        return this.repayPrincipal;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayInterest(String repayInterest) {
        this.repayInterest = repayInterest;
        return this;
    }
    public String getRepayInterest() {
        return this.repayInterest;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayMuclt(String repayMuclt) {
        this.repayMuclt = repayMuclt;
        return this;
    }
    public String getRepayMuclt() {
        return this.repayMuclt;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepayGuarantee(String repayGuarantee) {
        this.repayGuarantee = repayGuarantee;
        return this;
    }
    public String getRepayGuarantee() {
        return this.repayGuarantee;
    }

    public NotifyDubbridgeRepaymentLxRequest setRepaymentMode(String repaymentMode) {
        this.repaymentMode = repaymentMode;
        return this;
    }
    public String getRepaymentMode() {
        return this.repaymentMode;
    }

    public NotifyDubbridgeRepaymentLxRequest setRpyDetails(java.util.List<BillDetail> rpyDetails) {
        this.rpyDetails = rpyDetails;
        return this;
    }
    public java.util.List<BillDetail> getRpyDetails() {
        return this.rpyDetails;
    }

}
