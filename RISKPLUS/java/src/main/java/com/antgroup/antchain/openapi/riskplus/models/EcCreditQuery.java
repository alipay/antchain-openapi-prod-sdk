// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcCreditQuery extends TeaModel {
    // 外部申请编号
    /**
     * <strong>example:</strong>
     * <p>SQ202301291615023</p>
     */
    @NameInMap("third_apply_no")
    public String thirdApplyNo;

    // 银行审批流水号
    /**
     * <strong>example:</strong>
     * <p>APPL20200826000000250721</p>
     */
    @NameInMap("apply_no")
    public String applyNo;

    // 业务审批状态
    /**
     * <strong>example:</strong>
     * <p>APPROVING</p>
     */
    @NameInMap("apply_status")
    @Validation(required = true)
    public String applyStatus;

    // 合同编号
    /**
     * <strong>example:</strong>
     * <p>CONT20230314000000143225</p>
     */
    @NameInMap("contract_no")
    public String contractNo;

    // 授信开始时间 格式yyyyMMdd
    /**
     * <strong>example:</strong>
     * <p>20221010</p>
     */
    @NameInMap("amount_start_date")
    public String amountStartDate;

    // 授信结束时间 yyyyMMdd
    /**
     * <strong>example:</strong>
     * <p>20231010</p>
     */
    @NameInMap("amount_end_date")
    public String amountEndDate;

    // 审批金额
    /**
     * <strong>example:</strong>
     * <p>5000000.00</p>
     */
    @NameInMap("approve_amount")
    public String approveAmount;

    // 否决原因
    /**
     * <strong>example:</strong>
     * <p>审批否决</p>
     */
    @NameInMap("deny_reason")
    public String denyReason;

    // 提还款账号
    /**
     * <strong>example:</strong>
     * <p>6230580199590683459</p>
     */
    @NameInMap("bank_card_no")
    public String bankCardNo;

    // 提还款账号联行号
    /**
     * <strong>example:</strong>
     * <p>307331002509</p>
     */
    @NameInMap("bank_card_branch_code")
    public String bankCardBranchCode;

    // 账号开户行行名称
    /**
     * <strong>example:</strong>
     * <p>平安银行杭州分行</p>
     */
    @NameInMap("public_account_bankname")
    public String publicAccountBankname;

    // 审批通过时间 审批通过必填(格式: yyyy-MM-dd HH:mm:ss)
    /**
     * <strong>example:</strong>
     * <p>2023-05-01 01:01:01</p>
     */
    @NameInMap("approve_time")
    public String approveTime;

    public static EcCreditQuery build(java.util.Map<String, ?> map) throws Exception {
        EcCreditQuery self = new EcCreditQuery();
        return TeaModel.build(map, self);
    }

    public EcCreditQuery setThirdApplyNo(String thirdApplyNo) {
        this.thirdApplyNo = thirdApplyNo;
        return this;
    }
    public String getThirdApplyNo() {
        return this.thirdApplyNo;
    }

    public EcCreditQuery setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public EcCreditQuery setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public EcCreditQuery setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public EcCreditQuery setAmountStartDate(String amountStartDate) {
        this.amountStartDate = amountStartDate;
        return this;
    }
    public String getAmountStartDate() {
        return this.amountStartDate;
    }

    public EcCreditQuery setAmountEndDate(String amountEndDate) {
        this.amountEndDate = amountEndDate;
        return this;
    }
    public String getAmountEndDate() {
        return this.amountEndDate;
    }

    public EcCreditQuery setApproveAmount(String approveAmount) {
        this.approveAmount = approveAmount;
        return this;
    }
    public String getApproveAmount() {
        return this.approveAmount;
    }

    public EcCreditQuery setDenyReason(String denyReason) {
        this.denyReason = denyReason;
        return this;
    }
    public String getDenyReason() {
        return this.denyReason;
    }

    public EcCreditQuery setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public EcCreditQuery setBankCardBranchCode(String bankCardBranchCode) {
        this.bankCardBranchCode = bankCardBranchCode;
        return this;
    }
    public String getBankCardBranchCode() {
        return this.bankCardBranchCode;
    }

    public EcCreditQuery setPublicAccountBankname(String publicAccountBankname) {
        this.publicAccountBankname = publicAccountBankname;
        return this;
    }
    public String getPublicAccountBankname() {
        return this.publicAccountBankname;
    }

    public EcCreditQuery setApproveTime(String approveTime) {
        this.approveTime = approveTime;
        return this;
    }
    public String getApproveTime() {
        return this.approveTime;
    }

}
