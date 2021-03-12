// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeEpbuybackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 版通回购数量
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

    // 用户账户
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    public static StartDigitalassetExchangeEpbuybackRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeEpbuybackRequest self = new StartDigitalassetExchangeEpbuybackRequest();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeEpbuybackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDigitalassetExchangeEpbuybackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDigitalassetExchangeEpbuybackRequest setEpAmount(Long epAmount) {
        this.epAmount = epAmount;
        return this;
    }
    public Long getEpAmount() {
        return this.epAmount;
    }

    public StartDigitalassetExchangeEpbuybackRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public StartDigitalassetExchangeEpbuybackRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public StartDigitalassetExchangeEpbuybackRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
