// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeUnfreezeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 版通代码
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    // 解限数量
    @NameInMap("ep_unfreeze_amount")
    @Validation(required = true)
    public Long epUnfreezeAmount;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 业务方用户账户
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    public static StartDigitalassetExchangeUnfreezeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeUnfreezeRequest self = new StartDigitalassetExchangeUnfreezeRequest();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeUnfreezeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDigitalassetExchangeUnfreezeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDigitalassetExchangeUnfreezeRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public StartDigitalassetExchangeUnfreezeRequest setEpUnfreezeAmount(Long epUnfreezeAmount) {
        this.epUnfreezeAmount = epUnfreezeAmount;
        return this;
    }
    public Long getEpUnfreezeAmount() {
        return this.epUnfreezeAmount;
    }

    public StartDigitalassetExchangeUnfreezeRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public StartDigitalassetExchangeUnfreezeRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
