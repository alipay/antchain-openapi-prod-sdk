// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class NotifyCmportRepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台融资编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 还款编号
    @NameInMap("repay_no")
    @Validation(required = true)
    public String repayNo;

    // 融资企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 融资企业编码
    @NameInMap("company_code")
    @Validation(required = true)
    public String companyCode;

    // 产品编号
    @NameInMap("product_no")
    @Validation(required = true)
    public String productNo;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 还款金额，一期一次性全部还款，加上利息
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 还款银行
    @NameInMap("repay_bank")
    @Validation(required = true)
    public String repayBank;

    // 还款银行账号
    @NameInMap("repay_bank_account")
    @Validation(required = true)
    public String repayBankAccount;

    //  融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    @NameInMap("financial_status")
    @Validation(required = true)
    public Long financialStatus;

    // 还款日期
    @NameInMap("repay_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String repayDate;

    // 上链账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟id
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // Channel 名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    public static NotifyCmportRepayRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyCmportRepayRequest self = new NotifyCmportRepayRequest();
        return TeaModel.build(map, self);
    }

    public NotifyCmportRepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyCmportRepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyCmportRepayRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public NotifyCmportRepayRequest setRepayNo(String repayNo) {
        this.repayNo = repayNo;
        return this;
    }
    public String getRepayNo() {
        return this.repayNo;
    }

    public NotifyCmportRepayRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public NotifyCmportRepayRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public NotifyCmportRepayRequest setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }
    public String getProductNo() {
        return this.productNo;
    }

    public NotifyCmportRepayRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public NotifyCmportRepayRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public NotifyCmportRepayRequest setRepayBank(String repayBank) {
        this.repayBank = repayBank;
        return this;
    }
    public String getRepayBank() {
        return this.repayBank;
    }

    public NotifyCmportRepayRequest setRepayBankAccount(String repayBankAccount) {
        this.repayBankAccount = repayBankAccount;
        return this;
    }
    public String getRepayBankAccount() {
        return this.repayBankAccount;
    }

    public NotifyCmportRepayRequest setFinancialStatus(Long financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }
    public Long getFinancialStatus() {
        return this.financialStatus;
    }

    public NotifyCmportRepayRequest setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

    public NotifyCmportRepayRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public NotifyCmportRepayRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public NotifyCmportRepayRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
