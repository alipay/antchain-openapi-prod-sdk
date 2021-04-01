// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDigitalassetExchangeEpaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    // 用户账户
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    public static QueryDigitalassetExchangeEpaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalassetExchangeEpaccountRequest self = new QueryDigitalassetExchangeEpaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalassetExchangeEpaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalassetExchangeEpaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalassetExchangeEpaccountRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

    public QueryDigitalassetExchangeEpaccountRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
