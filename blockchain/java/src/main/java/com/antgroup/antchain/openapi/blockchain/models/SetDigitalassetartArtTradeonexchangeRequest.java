// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtTradeonexchangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 交易者账户
    @NameInMap("trade_account_id")
    @Validation(required = true)
    public String tradeAccountId;

    // 交易txHash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static SetDigitalassetartArtTradeonexchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtTradeonexchangeRequest self = new SetDigitalassetartArtTradeonexchangeRequest();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtTradeonexchangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDigitalassetartArtTradeonexchangeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetDigitalassetartArtTradeonexchangeRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public SetDigitalassetartArtTradeonexchangeRequest setTradeAccountId(String tradeAccountId) {
        this.tradeAccountId = tradeAccountId;
        return this;
    }
    public String getTradeAccountId() {
        return this.tradeAccountId;
    }

    public SetDigitalassetartArtTradeonexchangeRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
