// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class WithdrawDacVaultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // customerId of The DAC System
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    // blockchain:Ethereum Ploygen
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // Token Token Token identification
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // withdrawal token amount
    @NameInMap("withdrawal_amount")
    @Validation(required = true)
    public String withdrawalAmount;

    // description of requisition and withdrawal application
    @NameInMap("withdraw_token_desc")
    public String withdrawTokenDesc;

    // the address on the wallet chain of the user_s money withdrawal.
    @NameInMap("withdrawal_whitelist_address")
    @Validation(required = true)
    public String withdrawalWhitelistAddress;

    public static WithdrawDacVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawDacVaultRequest self = new WithdrawDacVaultRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawDacVaultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public WithdrawDacVaultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public WithdrawDacVaultRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public WithdrawDacVaultRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public WithdrawDacVaultRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public WithdrawDacVaultRequest setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        return this;
    }
    public String getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public WithdrawDacVaultRequest setWithdrawTokenDesc(String withdrawTokenDesc) {
        this.withdrawTokenDesc = withdrawTokenDesc;
        return this;
    }
    public String getWithdrawTokenDesc() {
        return this.withdrawTokenDesc;
    }

    public WithdrawDacVaultRequest setWithdrawalWhitelistAddress(String withdrawalWhitelistAddress) {
        this.withdrawalWhitelistAddress = withdrawalWhitelistAddress;
        return this;
    }
    public String getWithdrawalWhitelistAddress() {
        return this.withdrawalWhitelistAddress;
    }

}
