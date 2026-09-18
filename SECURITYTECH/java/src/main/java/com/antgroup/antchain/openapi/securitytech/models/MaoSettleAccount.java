// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoSettleAccount extends TeaModel {
    // 结算账户类型
    /**
     * <strong>example:</strong>
     * <p>结算账户类型</p>
     */
    @NameInMap("settlement_account_type")
    @Validation(required = true)
    public String settlementAccountType;

    // 收款账户户名
    /**
     * <strong>example:</strong>
     * <p>收款账户户名</p>
     */
    @NameInMap("settlement_account_name")
    @Validation(required = true)
    public String settlementAccountName;

    // 银行账户号
    /**
     * <strong>example:</strong>
     * <p>银行账户号</p>
     */
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 开户行总行名称
    /**
     * <strong>example:</strong>
     * <p>开户行总行名称</p>
     */
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 开户行总行编码
    /**
     * <strong>example:</strong>
     * <p>开户行总行编码</p>
     */
    @NameInMap("bank_code")
    public String bankCode;

    // 开户行支行名称
    /**
     * <strong>example:</strong>
     * <p>开户行支行名称</p>
     */
    @NameInMap("bank_branch_name")
    public String bankBranchName;

    // 开户支行编码
    /**
     * <strong>example:</strong>
     * <p>开户支行编码</p>
     */
    @NameInMap("bank_branch_code")
    public String bankBranchCode;

    // 开户行所在省
    /**
     * <strong>example:</strong>
     * <p>开户行所在省</p>
     */
    @NameInMap("bank_province")
    @Validation(required = true)
    public String bankProvince;

    // 开户行所在市
    /**
     * <strong>example:</strong>
     * <p>开户行所在市</p>
     */
    @NameInMap("bank_city")
    @Validation(required = true)
    public String bankCity;

    // 银行卡照片 URL
    /**
     * <strong>example:</strong>
     * <p>银行卡照片 URL</p>
     */
    @NameInMap("bank_card_image")
    public String bankCardImage;

    // 开户许可证照片 URL
    /**
     * <strong>example:</strong>
     * <p>开户许可证照片 URL</p>
     */
    @NameInMap("open_permit_image")
    public String openPermitImage;

    // 银联号
    /**
     * <strong>example:</strong>
     * <p>银联号</p>
     */
    @NameInMap("unionpay_number")
    public String unionpayNumber;

    public static MaoSettleAccount build(java.util.Map<String, ?> map) throws Exception {
        MaoSettleAccount self = new MaoSettleAccount();
        return TeaModel.build(map, self);
    }

    public MaoSettleAccount setSettlementAccountType(String settlementAccountType) {
        this.settlementAccountType = settlementAccountType;
        return this;
    }
    public String getSettlementAccountType() {
        return this.settlementAccountType;
    }

    public MaoSettleAccount setSettlementAccountName(String settlementAccountName) {
        this.settlementAccountName = settlementAccountName;
        return this;
    }
    public String getSettlementAccountName() {
        return this.settlementAccountName;
    }

    public MaoSettleAccount setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public MaoSettleAccount setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public MaoSettleAccount setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public MaoSettleAccount setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public MaoSettleAccount setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
        return this;
    }
    public String getBankBranchCode() {
        return this.bankBranchCode;
    }

    public MaoSettleAccount setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
        return this;
    }
    public String getBankProvince() {
        return this.bankProvince;
    }

    public MaoSettleAccount setBankCity(String bankCity) {
        this.bankCity = bankCity;
        return this;
    }
    public String getBankCity() {
        return this.bankCity;
    }

    public MaoSettleAccount setBankCardImage(String bankCardImage) {
        this.bankCardImage = bankCardImage;
        return this;
    }
    public String getBankCardImage() {
        return this.bankCardImage;
    }

    public MaoSettleAccount setOpenPermitImage(String openPermitImage) {
        this.openPermitImage = openPermitImage;
        return this;
    }
    public String getOpenPermitImage() {
        return this.openPermitImage;
    }

    public MaoSettleAccount setUnionpayNumber(String unionpayNumber) {
        this.unionpayNumber = unionpayNumber;
        return this;
    }
    public String getUnionpayNumber() {
        return this.unionpayNumber;
    }

}
