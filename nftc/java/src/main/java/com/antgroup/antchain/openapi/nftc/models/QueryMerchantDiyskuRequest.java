// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryMerchantDiyskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求id，用来做业务上的幂等
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 领取数字藏品的用户ID，支持2088/手机号/1322
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QueryMerchantDiyskuRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantDiyskuRequest self = new QueryMerchantDiyskuRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantDiyskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantDiyskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantDiyskuRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryMerchantDiyskuRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
