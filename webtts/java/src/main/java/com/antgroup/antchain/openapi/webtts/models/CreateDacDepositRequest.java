// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class CreateDacDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 白名单地址为交易from的地址，用于发起转账操作
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

    // 存入的金额，可以为整数，或者携带小数位，除以精度之后的值
    @NameInMap("deposit_amount")
    @Validation(required = true)
    public String depositAmount;

    // 区块链名称
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // token名称
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 外部客户唯一id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    public static CreateDacDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDacDepositRequest self = new CreateDacDepositRequest();
        return TeaModel.build(map, self);
    }

    public CreateDacDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDacDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDacDepositRequest setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public CreateDacDepositRequest setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public String getDepositAmount() {
        return this.depositAmount;
    }

    public CreateDacDepositRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public CreateDacDepositRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public CreateDacDepositRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

}
