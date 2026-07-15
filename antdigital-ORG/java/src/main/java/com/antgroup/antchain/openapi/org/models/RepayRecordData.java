// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class RepayRecordData extends TeaModel {
    // 租户id
    /**
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 还款记录id
    /**
     * <strong>example:</strong>
     * <p>5200017</p>
     */
    @NameInMap("repay_record_id")
    @Validation(required = true)
    public String repayRecordId;

    // 逾期用户id
    /**
     * <strong>example:</strong>
     * <p>202512230001000001021704</p>
     */
    @NameInMap("overdue_user_id")
    @Validation(required = true)
    public String overdueUserId;

    // 支付宝2088
    /**
     * <strong>example:</strong>
     * <p>2088702238164012</p>
     */
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    // 交易订单id
    /**
     * <strong>example:</strong>
     * <p>202512250003000000129609</p>
     */
    @NameInMap("trade_order_id")
    @Validation(required = true)
    public String tradeOrderId;

    // 还款金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("repay_amount")
    @Validation(required = true)
    public String repayAmount;

    // 逾期金额
    /**
     * <strong>example:</strong>
     * <p>10.00</p>
     */
    @NameInMap("overdue_amount")
    @Validation(required = true)
    public String overdueAmount;

    // 本金
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("principal_amount")
    @Validation(required = true)
    public String principalAmount;

    // 利息
    /**
     * <strong>example:</strong>
     * <p>6.66</p>
     */
    @NameInMap("interest_amount")
    @Validation(required = true)
    public String interestAmount;

    // 剩余金额
    /**
     * <strong>example:</strong>
     * <p>90.34</p>
     */
    @NameInMap("residue_amount")
    @Validation(required = true)
    public String residueAmount;

    // 优惠金额
    /**
     * <strong>example:</strong>
     * <p>0.00</p>
     */
    @NameInMap("discount_amount")
    public String discountAmount;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>REPAY_SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 案件号
    /**
     * <strong>example:</strong>
     * <p>202512250002000000955303</p>
     */
    @NameInMap("case_no")
    @Validation(required = true)
    public String caseNo;

    // 案件id
    /**
     * <strong>example:</strong>
     * <p>2600122</p>
     */
    @NameInMap("case_id")
    @Validation(required = true)
    public String caseId;

    // 还款编号
    /**
     * <strong>example:</strong>
     * <p>202512250004000000000001</p>
     */
    @NameInMap("repay_record_no")
    @Validation(required = true)
    public String repayRecordNo;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>信用卡</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 机构名称
    /**
     * <strong>example:</strong>
     * <p>奇富科技</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 订单号
    /**
     * <strong>example:</strong>
     * <p>2025122222001496141415695516</p>
     */
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 扩展属性
    /**
     * <strong>example:</strong>
     * <p>{&quot;errorMsg&quot;:&quot;日期不匹配&quot;}</p>
     */
    @NameInMap("ext_info")
    public String extInfo;

    // 结算状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("settle_status")
    public String settleStatus;

    public static RepayRecordData build(java.util.Map<String, ?> map) throws Exception {
        RepayRecordData self = new RepayRecordData();
        return TeaModel.build(map, self);
    }

    public RepayRecordData setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RepayRecordData setRepayRecordId(String repayRecordId) {
        this.repayRecordId = repayRecordId;
        return this;
    }
    public String getRepayRecordId() {
        return this.repayRecordId;
    }

    public RepayRecordData setOverdueUserId(String overdueUserId) {
        this.overdueUserId = overdueUserId;
        return this;
    }
    public String getOverdueUserId() {
        return this.overdueUserId;
    }

    public RepayRecordData setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public RepayRecordData setTradeOrderId(String tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
        return this;
    }
    public String getTradeOrderId() {
        return this.tradeOrderId;
    }

    public RepayRecordData setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public String getRepayAmount() {
        return this.repayAmount;
    }

    public RepayRecordData setOverdueAmount(String overdueAmount) {
        this.overdueAmount = overdueAmount;
        return this;
    }
    public String getOverdueAmount() {
        return this.overdueAmount;
    }

    public RepayRecordData setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
        return this;
    }
    public String getPrincipalAmount() {
        return this.principalAmount;
    }

    public RepayRecordData setInterestAmount(String interestAmount) {
        this.interestAmount = interestAmount;
        return this;
    }
    public String getInterestAmount() {
        return this.interestAmount;
    }

    public RepayRecordData setResidueAmount(String residueAmount) {
        this.residueAmount = residueAmount;
        return this;
    }
    public String getResidueAmount() {
        return this.residueAmount;
    }

    public RepayRecordData setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public RepayRecordData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RepayRecordData setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }
    public String getCaseNo() {
        return this.caseNo;
    }

    public RepayRecordData setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public RepayRecordData setRepayRecordNo(String repayRecordNo) {
        this.repayRecordNo = repayRecordNo;
        return this;
    }
    public String getRepayRecordNo() {
        return this.repayRecordNo;
    }

    public RepayRecordData setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public RepayRecordData setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RepayRecordData setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public RepayRecordData setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RepayRecordData setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
        return this;
    }
    public String getSettleStatus() {
        return this.settleStatus;
    }

}
