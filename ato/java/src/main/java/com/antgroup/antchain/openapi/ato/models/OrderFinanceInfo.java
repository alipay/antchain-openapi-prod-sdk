// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderFinanceInfo extends TeaModel {
    // 放款金额
    /**
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("total_money")
    public Long totalMoney;

    // 放款状态
    /**
     * <strong>example:</strong>
     * <p>AGREED_LOAN</p>
     */
    @NameInMap("apply_status")
    public String applyStatus;

    // 融资申请时间(yyyy-MM-dd HH:mm:ss)
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("loan_apply_date")
    public String loanApplyDate;

    // 放款时间(yyyy-MM-dd HH:mm:ss)
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("loan_time")
    public String loanTime;

    // 放款交易流水号
    /**
     * <strong>example:</strong>
     * <p>202403102912984772213</p>
     */
    @NameInMap("loan_serial_number")
    public String loanSerialNumber;

    // 资方分账户登录号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@qq.com">xxx@qq.com</a></p>
     */
    @NameInMap("fund_divide_alipay_logon_id")
    public String fundDivideAlipayLogonId;

    // 资方分账户uid
    /**
     * <strong>example:</strong>
     * <p>2088xxxx</p>
     */
    @NameInMap("fund_divide_alipay_uid")
    public String fundDivideAlipayUid;

    // 资方代扣户登录号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@qq.com">xxx@qq.com</a></p>
     */
    @NameInMap("fund_withhold_alipay_logon_id")
    public String fundWithholdAlipayLogonId;

    // 资方代扣户uid
    /**
     * <strong>example:</strong>
     * <p>2088xxxx</p>
     */
    @NameInMap("fund_withhold_alipay_uid")
    public String fundWithholdAlipayUid;

    // 手续费支付方
    /**
     * <strong>example:</strong>
     * <p>MERCHANT</p>
     */
    @NameInMap("fee_paid_role")
    public String feePaidRole;

    // 放款渠道
    /**
     * <strong>example:</strong>
     * <p>BANK</p>
     */
    @NameInMap("loan_channel")
    public String loanChannel;

    // 放款账户
    /**
     * <strong>example:</strong>
     * <p>6217xxxxx</p>
     */
    @NameInMap("loan_payee_account")
    public String loanPayeeAccount;

    // 付款公司统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>9210XM12385</p>
     */
    @NameInMap("paid_company_id")
    public String paidCompanyId;

    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>x xx银行</p>
     */
    @NameInMap("bank_name")
    public String bankName;

    // 融资状态
    /**
     * <strong>example:</strong>
     * <p>APPLY</p>
     */
    @NameInMap("finance_status")
    public String financeStatus;

    // 收款项目列表
    @NameInMap("payment_item_list")
    public java.util.List<String> paymentItemList;

    // 转账代偿收款类型
    /**
     * <strong>example:</strong>
     * <p>支付宝</p>
     */
    @NameInMap("transfer_compensate_in_account_type")
    public String transferCompensateInAccountType;

    public static OrderFinanceInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderFinanceInfo self = new OrderFinanceInfo();
        return TeaModel.build(map, self);
    }

    public OrderFinanceInfo setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
        return this;
    }
    public Long getTotalMoney() {
        return this.totalMoney;
    }

    public OrderFinanceInfo setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public OrderFinanceInfo setLoanApplyDate(String loanApplyDate) {
        this.loanApplyDate = loanApplyDate;
        return this;
    }
    public String getLoanApplyDate() {
        return this.loanApplyDate;
    }

    public OrderFinanceInfo setLoanTime(String loanTime) {
        this.loanTime = loanTime;
        return this;
    }
    public String getLoanTime() {
        return this.loanTime;
    }

    public OrderFinanceInfo setLoanSerialNumber(String loanSerialNumber) {
        this.loanSerialNumber = loanSerialNumber;
        return this;
    }
    public String getLoanSerialNumber() {
        return this.loanSerialNumber;
    }

    public OrderFinanceInfo setFundDivideAlipayLogonId(String fundDivideAlipayLogonId) {
        this.fundDivideAlipayLogonId = fundDivideAlipayLogonId;
        return this;
    }
    public String getFundDivideAlipayLogonId() {
        return this.fundDivideAlipayLogonId;
    }

    public OrderFinanceInfo setFundDivideAlipayUid(String fundDivideAlipayUid) {
        this.fundDivideAlipayUid = fundDivideAlipayUid;
        return this;
    }
    public String getFundDivideAlipayUid() {
        return this.fundDivideAlipayUid;
    }

    public OrderFinanceInfo setFundWithholdAlipayLogonId(String fundWithholdAlipayLogonId) {
        this.fundWithholdAlipayLogonId = fundWithholdAlipayLogonId;
        return this;
    }
    public String getFundWithholdAlipayLogonId() {
        return this.fundWithholdAlipayLogonId;
    }

    public OrderFinanceInfo setFundWithholdAlipayUid(String fundWithholdAlipayUid) {
        this.fundWithholdAlipayUid = fundWithholdAlipayUid;
        return this;
    }
    public String getFundWithholdAlipayUid() {
        return this.fundWithholdAlipayUid;
    }

    public OrderFinanceInfo setFeePaidRole(String feePaidRole) {
        this.feePaidRole = feePaidRole;
        return this;
    }
    public String getFeePaidRole() {
        return this.feePaidRole;
    }

    public OrderFinanceInfo setLoanChannel(String loanChannel) {
        this.loanChannel = loanChannel;
        return this;
    }
    public String getLoanChannel() {
        return this.loanChannel;
    }

    public OrderFinanceInfo setLoanPayeeAccount(String loanPayeeAccount) {
        this.loanPayeeAccount = loanPayeeAccount;
        return this;
    }
    public String getLoanPayeeAccount() {
        return this.loanPayeeAccount;
    }

    public OrderFinanceInfo setPaidCompanyId(String paidCompanyId) {
        this.paidCompanyId = paidCompanyId;
        return this;
    }
    public String getPaidCompanyId() {
        return this.paidCompanyId;
    }

    public OrderFinanceInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public OrderFinanceInfo setFinanceStatus(String financeStatus) {
        this.financeStatus = financeStatus;
        return this;
    }
    public String getFinanceStatus() {
        return this.financeStatus;
    }

    public OrderFinanceInfo setPaymentItemList(java.util.List<String> paymentItemList) {
        this.paymentItemList = paymentItemList;
        return this;
    }
    public java.util.List<String> getPaymentItemList() {
        return this.paymentItemList;
    }

    public OrderFinanceInfo setTransferCompensateInAccountType(String transferCompensateInAccountType) {
        this.transferCompensateInAccountType = transferCompensateInAccountType;
        return this;
    }
    public String getTransferCompensateInAccountType() {
        return this.transferCompensateInAccountType;
    }

}
