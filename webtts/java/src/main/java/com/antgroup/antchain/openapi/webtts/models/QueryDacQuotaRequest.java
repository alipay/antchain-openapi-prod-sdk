// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDacQuotaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // your company external customer id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    // blockchain:Ethereum,Polygon,etc
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // token symbol:USDC,USDT,etc
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // quotaType:DEPOSIT/WITHDRAWAL
    @NameInMap("quota_type")
    @Validation(required = true)
    public String quotaType;

    public static QueryDacQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDacQuotaRequest self = new QueryDacQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDacQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDacQuotaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDacQuotaRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public QueryDacQuotaRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryDacQuotaRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public QueryDacQuotaRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

}
