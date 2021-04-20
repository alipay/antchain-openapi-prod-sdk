// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecTokenRedeemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务单号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链 ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 合约 ID
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 币种，目前仅支持 CNY
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 调用方
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 要兑现的用户VID
    @NameInMap("target_user")
    @Validation(required = true)
    public String targetUser;

    // Token总金额，token_price*token_number 的结果，单位为分
    @NameInMap("token_amount")
    @Validation(required = true)
    public Long tokenAmount;

    // 兑现的Token数目
    @NameInMap("token_number")
    @Validation(required = true)
    public Long tokenNumber;

    // 兑现的Token单价，单位为分
    @NameInMap("token_price")
    @Validation(required = true)
    public Long tokenPrice;

    public static ExecTokenRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecTokenRedeemRequest self = new ExecTokenRedeemRequest();
        return TeaModel.build(map, self);
    }

    public ExecTokenRedeemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecTokenRedeemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecTokenRedeemRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExecTokenRedeemRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecTokenRedeemRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public ExecTokenRedeemRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ExecTokenRedeemRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ExecTokenRedeemRequest setTargetUser(String targetUser) {
        this.targetUser = targetUser;
        return this;
    }
    public String getTargetUser() {
        return this.targetUser;
    }

    public ExecTokenRedeemRequest setTokenAmount(Long tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public Long getTokenAmount() {
        return this.tokenAmount;
    }

    public ExecTokenRedeemRequest setTokenNumber(Long tokenNumber) {
        this.tokenNumber = tokenNumber;
        return this;
    }
    public Long getTokenNumber() {
        return this.tokenNumber;
    }

    public ExecTokenRedeemRequest setTokenPrice(Long tokenPrice) {
        this.tokenPrice = tokenPrice;
        return this;
    }
    public Long getTokenPrice() {
        return this.tokenPrice;
    }

}
