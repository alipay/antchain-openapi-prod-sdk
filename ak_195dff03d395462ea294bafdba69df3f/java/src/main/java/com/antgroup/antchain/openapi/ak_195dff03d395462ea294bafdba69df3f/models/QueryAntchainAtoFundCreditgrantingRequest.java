// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoFundCreditgrantingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信id
    @NameInMap("granting_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String grantingId;

    // 资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String fundId;

    public static QueryAntchainAtoFundCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoFundCreditgrantingRequest self = new QueryAntchainAtoFundCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoFundCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoFundCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoFundCreditgrantingRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public QueryAntchainAtoFundCreditgrantingRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
