// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商品版本
    @NameInMap("product_version")
    @Validation(required = true)
    public Long productVersion;

    public static QueryRentalProductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalProductRequest self = new QueryRentalProductRequest();
        return TeaModel.build(map, self);
    }

    public QueryRentalProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRentalProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRentalProductRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryRentalProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryRentalProductRequest setProductVersion(Long productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public Long getProductVersion() {
        return this.productVersion;
    }

}
