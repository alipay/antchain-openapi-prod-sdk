// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDacDepositlimitsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部用户唯一id
    @NameInMap("external_customer_id")
    @Validation(required = true)
    public String externalCustomerId;

    // 代币名称
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    public static QueryDacDepositlimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDacDepositlimitsRequest self = new QueryDacDepositlimitsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDacDepositlimitsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDacDepositlimitsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDacDepositlimitsRequest setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    public String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public QueryDacDepositlimitsRequest setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

}
