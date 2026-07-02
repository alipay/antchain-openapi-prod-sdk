// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BindMerchantexpandSettlecardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 银行卡号
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 银行账户名称
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 开户行所在省
    @NameInMap("bank_province")
    @Validation(required = true)
    public String bankProvince;

    // 开户行所在地-市
    @NameInMap("bank_city")
    @Validation(required = true)
    public String bankCity;

    // 账号使用类型
    // 对公: 01
    // 对私: 02
    @NameInMap("usage_type")
    @Validation(required = true)
    public String usageType;

    // 卡类型
    // 借记卡: DC
    // 信用卡: CC
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // 开户支行名
    @NameInMap("bank_branch_name")
    @Validation(required = true)
    public String bankBranchName;

    // 银行名称
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 开户行简称缩写
    @NameInMap("bank_inst_id")
    @Validation(required = true)
    public String bankInstId;

    // 联行号
    @NameInMap("bank_code")
    public String bankCode;

    public static BindMerchantexpandSettlecardRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMerchantexpandSettlecardRequest self = new BindMerchantexpandSettlecardRequest();
        return TeaModel.build(map, self);
    }

    public BindMerchantexpandSettlecardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindMerchantexpandSettlecardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindMerchantexpandSettlecardRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public BindMerchantexpandSettlecardRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public BindMerchantexpandSettlecardRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BindMerchantexpandSettlecardRequest setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
        return this;
    }
    public String getBankProvince() {
        return this.bankProvince;
    }

    public BindMerchantexpandSettlecardRequest setBankCity(String bankCity) {
        this.bankCity = bankCity;
        return this;
    }
    public String getBankCity() {
        return this.bankCity;
    }

    public BindMerchantexpandSettlecardRequest setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

    public BindMerchantexpandSettlecardRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public BindMerchantexpandSettlecardRequest setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public BindMerchantexpandSettlecardRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public BindMerchantexpandSettlecardRequest setBankInstId(String bankInstId) {
        this.bankInstId = bankInstId;
        return this;
    }
    public String getBankInstId() {
        return this.bankInstId;
    }

    public BindMerchantexpandSettlecardRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

}
