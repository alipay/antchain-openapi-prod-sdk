// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeEptradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易数量
    @NameInMap("ep_amount")
    @Validation(required = true)
    public Long epAmount;

    // 版通代码
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 卖方账户
    @NameInMap("from_account")
    @Validation(required = true)
    public String fromAccount;

    // 买方账户
    @NameInMap("to_account")
    @Validation(required = true)
    public String toAccount;

    public static StartDigitalassetExchangeEptradeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeEptradeRequest self = new StartDigitalassetExchangeEptradeRequest();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeEptradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDigitalassetExchangeEptradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDigitalassetExchangeEptradeRequest setEpAmount(Long epAmount) {
        this.epAmount = epAmount;
        return this;
    }
    public Long getEpAmount() {
        return this.epAmount;
    }

    public StartDigitalassetExchangeEptradeRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public StartDigitalassetExchangeEptradeRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public StartDigitalassetExchangeEptradeRequest setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
        return this;
    }
    public String getFromAccount() {
        return this.fromAccount;
    }

    public StartDigitalassetExchangeEptradeRequest setToAccount(String toAccount) {
        this.toAccount = toAccount;
        return this;
    }
    public String getToAccount() {
        return this.toAccount;
    }

}
