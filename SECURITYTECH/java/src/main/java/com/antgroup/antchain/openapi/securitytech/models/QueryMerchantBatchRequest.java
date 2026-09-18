// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryMerchantBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户号列表
    @NameInMap("merchant_ids")
    public java.util.List<String> merchantIds;

    // usci+industry 组合列表
    @NameInMap("usci_industry_pairs")
    public java.util.List<MaoUsciIndustryPair> usciIndustryPairs;

    public static QueryMerchantBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantBatchRequest self = new QueryMerchantBatchRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantBatchRequest setMerchantIds(java.util.List<String> merchantIds) {
        this.merchantIds = merchantIds;
        return this;
    }
    public java.util.List<String> getMerchantIds() {
        return this.merchantIds;
    }

    public QueryMerchantBatchRequest setUsciIndustryPairs(java.util.List<MaoUsciIndustryPair> usciIndustryPairs) {
        this.usciIndustryPairs = usciIndustryPairs;
        return this;
    }
    public java.util.List<MaoUsciIndustryPair> getUsciIndustryPairs() {
        return this.usciIndustryPairs;
    }

}
