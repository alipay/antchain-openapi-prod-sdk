// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ReceiptInfo extends TeaModel {
    // 客户名
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("custom_name")
    @Validation(required = true)
    public String customName;

    // 证件号码
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 手机号
    /**
     * <strong>example:</strong>
     * <p>166****1234</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 贷款金额
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("apply_amount")
    @Validation(required = true)
    public Long applyAmount;

    // 发放金额
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("loan_amount")
    @Validation(required = true)
    public Long loanAmount;

    // 期数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 当前期数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("cur_period")
    @Validation(required = true)
    public Long curPeriod;

    // 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 还款日
    /**
     * <strong>example:</strong>
     * <p>XXXX.XX.XX</p>
     */
    @NameInMap("repay_date")
    @Validation(required = true)
    public String repayDate;

    // 放款时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("loan_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String loanTime;

    // 借据状态0：未还清，1：已还清，2：已提前还清
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 已还本金
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("already_corpus")
    @Validation(required = true)
    public Long alreadyCorpus;

    // 已还利息
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("already_accrual")
    @Validation(required = true)
    public Long alreadyAccrual;

    // 结清日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("already_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String alreadyDate;

    // 审批状态0：通过 1：拒绝 2：审批中 3：失败
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("workflow_status")
    @Validation(required = true)
    public String workflowStatus;

    // 借据编号
    /**
     * <strong>example:</strong>
     * <p>145785</p>
     */
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    public static ReceiptInfo build(java.util.Map<String, ?> map) throws Exception {
        ReceiptInfo self = new ReceiptInfo();
        return TeaModel.build(map, self);
    }

    public ReceiptInfo setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public ReceiptInfo setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public ReceiptInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public ReceiptInfo setApplyAmount(Long applyAmount) {
        this.applyAmount = applyAmount;
        return this;
    }
    public Long getApplyAmount() {
        return this.applyAmount;
    }

    public ReceiptInfo setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }
    public Long getLoanAmount() {
        return this.loanAmount;
    }

    public ReceiptInfo setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public ReceiptInfo setCurPeriod(Long curPeriod) {
        this.curPeriod = curPeriod;
        return this;
    }
    public Long getCurPeriod() {
        return this.curPeriod;
    }

    public ReceiptInfo setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public ReceiptInfo setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

    public ReceiptInfo setLoanTime(String loanTime) {
        this.loanTime = loanTime;
        return this;
    }
    public String getLoanTime() {
        return this.loanTime;
    }

    public ReceiptInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ReceiptInfo setAlreadyCorpus(Long alreadyCorpus) {
        this.alreadyCorpus = alreadyCorpus;
        return this;
    }
    public Long getAlreadyCorpus() {
        return this.alreadyCorpus;
    }

    public ReceiptInfo setAlreadyAccrual(Long alreadyAccrual) {
        this.alreadyAccrual = alreadyAccrual;
        return this;
    }
    public Long getAlreadyAccrual() {
        return this.alreadyAccrual;
    }

    public ReceiptInfo setAlreadyDate(String alreadyDate) {
        this.alreadyDate = alreadyDate;
        return this;
    }
    public String getAlreadyDate() {
        return this.alreadyDate;
    }

    public ReceiptInfo setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }
    public String getWorkflowStatus() {
        return this.workflowStatus;
    }

    public ReceiptInfo setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

}
