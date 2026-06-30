// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryMallPointaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    public static QueryMallPointaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMallPointaccountRequest self = new QueryMallPointaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryMallPointaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMallPointaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMallPointaccountRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryMallPointaccountRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
