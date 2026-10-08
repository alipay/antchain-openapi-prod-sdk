// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class WithdrawAntdigitalWebttsDacVaultRequest extends TeaModel {
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

    public static WithdrawAntdigitalWebttsDacVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawAntdigitalWebttsDacVaultRequest self = new WithdrawAntdigitalWebttsDacVaultRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        return this;
    }
    public String getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setWithdrawTokenDesc(String withdrawTokenDesc) {
        this.withdrawTokenDesc = withdrawTokenDesc;
        return this;
    }
    public String getWithdrawTokenDesc() {
        return this.withdrawTokenDesc;
    }

    public WithdrawAntdigitalWebttsDacVaultRequest setWithdrawalWhitelistAddress(String withdrawalWhitelistAddress) {
        this.withdrawalWhitelistAddress = withdrawalWhitelistAddress;
        return this;
    }
    public String getWithdrawalWhitelistAddress() {
        return this.withdrawalWhitelistAddress;
    }

}
