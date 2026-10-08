// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CreateAntdigitalWebttsDacWithdrawRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，唯一，幂等键，防重放
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 企业CIF ID
    @NameInMap("cif_id")
    @Validation(required = true)
    public String cifId;

    // 操作人Operator ID（Maker）
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 链标识（ETH等）
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // Token标识（USDT/USDC等）
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 出金金额（精度18位）
    @NameInMap("withdraw_amount")
    @Validation(required = true)
    public String withdrawAmount;

    // 收款方白名单地址
    @NameInMap("to_address")
    @Validation(required = true)
    public String toAddress;

    // 从当前组织的哪个custody wallet出钱
    @NameInMap("from_custody_wallet_id")
    @Validation(required = true)
    public String fromCustodyWalletId;

    public static CreateAntdigitalWebttsDacWithdrawRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalWebttsDacWithdrawRequest self = new CreateAntdigitalWebttsDacWithdrawRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setWithdrawAmount(String withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
        return this;
    }
    public String getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public CreateAntdigitalWebttsDacWithdrawRequest setFromCustodyWalletId(String fromCustodyWalletId) {
        this.fromCustodyWalletId = fromCustodyWalletId;
        return this;
    }
    public String getFromCustodyWalletId() {
        return this.fromCustodyWalletId;
    }

}
