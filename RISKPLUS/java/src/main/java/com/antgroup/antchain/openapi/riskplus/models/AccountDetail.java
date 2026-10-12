// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class AccountDetail extends TeaModel {
    // 商户号
    @NameInMap("merchant_no")
    @Validation(required = true)
    public String merchantNo;

    // 交易时间
    @NameInMap("trade_time")
    @Validation(required = true)
    public String tradeTime;

    // 交易流水号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 账号
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 户名
    @NameInMap("account_name")
    public String accountName;

    // 交易金额
    @NameInMap("trade_amt")
    @Validation(required = true)
    public String tradeAmt;

    // 借贷标识	基础类型
    @NameInMap("dc_flag")
    @Validation(required = true)
    public String dcFlag;

    // 对手账号
    @NameInMap("oth_account_no")
    @Validation(required = true)
    public String othAccountNo;

    // 对手户名
    @NameInMap("oth_account_name")
    @Validation(required = true)
    public String othAccountName;

    // 对手行号
    @NameInMap("oth_bank_code")
    @Validation(required = true)
    public String othBankCode;

    // 对手行名
    @NameInMap("oth_bank_name")
    @Validation(required = true)
    public String othBankName;

    // 交易备注
    @NameInMap("trade_remark")
    @Validation(required = true)
    public String tradeRemark;

    // 交易后余额
    @NameInMap("actual_bal_amt")
    public String actualBalAmt;

    public static AccountDetail build(java.util.Map<String, ?> map) throws Exception {
        AccountDetail self = new AccountDetail();
        return TeaModel.build(map, self);
    }

    public AccountDetail setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }
    public String getMerchantNo() {
        return this.merchantNo;
    }

    public AccountDetail setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public String getTradeTime() {
        return this.tradeTime;
    }

    public AccountDetail setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public AccountDetail setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public AccountDetail setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AccountDetail setTradeAmt(String tradeAmt) {
        this.tradeAmt = tradeAmt;
        return this;
    }
    public String getTradeAmt() {
        return this.tradeAmt;
    }

    public AccountDetail setDcFlag(String dcFlag) {
        this.dcFlag = dcFlag;
        return this;
    }
    public String getDcFlag() {
        return this.dcFlag;
    }

    public AccountDetail setOthAccountNo(String othAccountNo) {
        this.othAccountNo = othAccountNo;
        return this;
    }
    public String getOthAccountNo() {
        return this.othAccountNo;
    }

    public AccountDetail setOthAccountName(String othAccountName) {
        this.othAccountName = othAccountName;
        return this;
    }
    public String getOthAccountName() {
        return this.othAccountName;
    }

    public AccountDetail setOthBankCode(String othBankCode) {
        this.othBankCode = othBankCode;
        return this;
    }
    public String getOthBankCode() {
        return this.othBankCode;
    }

    public AccountDetail setOthBankName(String othBankName) {
        this.othBankName = othBankName;
        return this;
    }
    public String getOthBankName() {
        return this.othBankName;
    }

    public AccountDetail setTradeRemark(String tradeRemark) {
        this.tradeRemark = tradeRemark;
        return this;
    }
    public String getTradeRemark() {
        return this.tradeRemark;
    }

    public AccountDetail setActualBalAmt(String actualBalAmt) {
        this.actualBalAmt = actualBalAmt;
        return this;
    }
    public String getActualBalAmt() {
        return this.actualBalAmt;
    }

}
