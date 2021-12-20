// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zjlm.models;

import com.aliyun.tea.*;

public class QueryTraceapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品编码
    @NameInMap("sku")
    @Validation(required = true)
    public String sku;

    // 11
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 11
    @NameInMap("tag_key")
    public String tagKey;

    // 222
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    public static QueryTraceapiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceapiRequest self = new QueryTraceapiRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTraceapiRequest setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public QueryTraceapiRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public QueryTraceapiRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public QueryTraceapiRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
