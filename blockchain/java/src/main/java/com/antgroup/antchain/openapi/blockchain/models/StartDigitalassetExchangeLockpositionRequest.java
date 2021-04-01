// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeLockpositionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 版通代码
    @NameInMap("ep_code")
    public String epCode;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 锁定操作，0为解锁，1为锁定
    @NameInMap("operate")
    @Validation(required = true)
    public Long operate;

    // 业务方账户
    @NameInMap("user_account")
    public String userAccount;

    public static StartDigitalassetExchangeLockpositionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeLockpositionRequest self = new StartDigitalassetExchangeLockpositionRequest();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeLockpositionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDigitalassetExchangeLockpositionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDigitalassetExchangeLockpositionRequest setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public StartDigitalassetExchangeLockpositionRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public StartDigitalassetExchangeLockpositionRequest setOperate(Long operate) {
        this.operate = operate;
        return this;
    }
    public Long getOperate() {
        return this.operate;
    }

    public StartDigitalassetExchangeLockpositionRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
