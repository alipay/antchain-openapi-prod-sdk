// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户号
    @NameInMap("merchant_id")
    public String merchantId;

    // 统代
    @NameInMap("usci")
    public String usci;

    // 行业类型
    @NameInMap("industry")
    public String industry;

    public static QueryMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantRequest self = new QueryMerchantRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryMerchantRequest setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public QueryMerchantRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
