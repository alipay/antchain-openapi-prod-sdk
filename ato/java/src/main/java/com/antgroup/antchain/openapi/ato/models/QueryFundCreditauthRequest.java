// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundCreditauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方社会引用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 授权id
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 授权类型
    // CREDIT_GRANTING 授信
    // CREDIT_UTILIZATION 用信
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    public static QueryFundCreditauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFundCreditauthRequest self = new QueryFundCreditauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryFundCreditauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFundCreditauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFundCreditauthRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryFundCreditauthRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QueryFundCreditauthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
