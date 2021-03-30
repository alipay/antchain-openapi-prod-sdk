// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateStandardVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据标识
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 资产类型
    @NameInMap("asset_type")
    @Validation(required = true)
    public String assetType;

    // 发行金额
    @NameInMap("amount_proof")
    @Validation(required = true)
    public String amountProof;

    // 发行金额
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 余额
    @NameInMap("balance_proof")
    @Validation(required = true)
    public String balanceProof;

    // 余额
    @NameInMap("balance")
    @Validation(required = true)
    public String balance;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 发行时间
    @NameInMap("issue_time")
    @Validation(required = true)
    public Long issueTime;

    // 到期时间
    @NameInMap("expire_time")
    @Validation(required = true)
    public Long expireTime;

    // 清分时间
    @NameInMap("clearing_time")
    @Validation(required = true)
    public Long clearingTime;

    // 发布者
    @NameInMap("issuer")
    @Validation(required = true)
    public String issuer;

    // 资本者
    @NameInMap("capital")
    @Validation(required = true)
    public String capital;

    // 所属账户
    @NameInMap("voucher_owner")
    @Validation(required = true)
    public String voucherOwner;

    public static CreateStandardVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardVoucherRequest self = new CreateStandardVoucherRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStandardVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateStandardVoucherRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public CreateStandardVoucherRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public CreateStandardVoucherRequest setAmountProof(String amountProof) {
        this.amountProof = amountProof;
        return this;
    }
    public String getAmountProof() {
        return this.amountProof;
    }

    public CreateStandardVoucherRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateStandardVoucherRequest setBalanceProof(String balanceProof) {
        this.balanceProof = balanceProof;
        return this;
    }
    public String getBalanceProof() {
        return this.balanceProof;
    }

    public CreateStandardVoucherRequest setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public CreateStandardVoucherRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateStandardVoucherRequest setIssueTime(Long issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public Long getIssueTime() {
        return this.issueTime;
    }

    public CreateStandardVoucherRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateStandardVoucherRequest setClearingTime(Long clearingTime) {
        this.clearingTime = clearingTime;
        return this;
    }
    public Long getClearingTime() {
        return this.clearingTime;
    }

    public CreateStandardVoucherRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public CreateStandardVoucherRequest setCapital(String capital) {
        this.capital = capital;
        return this;
    }
    public String getCapital() {
        return this.capital;
    }

    public CreateStandardVoucherRequest setVoucherOwner(String voucherOwner) {
        this.voucherOwner = voucherOwner;
        return this;
    }
    public String getVoucherOwner() {
        return this.voucherOwner;
    }

}
