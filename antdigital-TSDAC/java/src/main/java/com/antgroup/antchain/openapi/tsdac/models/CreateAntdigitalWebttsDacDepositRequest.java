// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CreateAntdigitalWebttsDacDepositRequest extends TeaModel {
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

    // 操作人Operator ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 区块链名称
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 代币
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 白名单地址
    @NameInMap("from_address")
    @Validation(required = true)
    public String fromAddress;

    // 托管钱包地址
    @NameInMap("to_address")
    @Validation(required = true)
    public String toAddress;

    // 托管金额
    @NameInMap("deposit_amount")
    @Validation(required = true)
    public String depositAmount;

    public static CreateAntdigitalWebttsDacDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalWebttsDacDepositRequest self = new CreateAntdigitalWebttsDacDepositRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalWebttsDacDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntdigitalWebttsDacDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntdigitalWebttsDacDepositRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntdigitalWebttsDacDepositRequest setCifId(String cifId) {
        this.cifId = cifId;
        return this;
    }
    public String getCifId() {
        return this.cifId;
    }

    public CreateAntdigitalWebttsDacDepositRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateAntdigitalWebttsDacDepositRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public CreateAntdigitalWebttsDacDepositRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public CreateAntdigitalWebttsDacDepositRequest setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public CreateAntdigitalWebttsDacDepositRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public CreateAntdigitalWebttsDacDepositRequest setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public String getDepositAmount() {
        return this.depositAmount;
    }

}
