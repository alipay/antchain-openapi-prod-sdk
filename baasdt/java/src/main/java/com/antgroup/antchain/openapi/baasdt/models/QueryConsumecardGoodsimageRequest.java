// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardGoodsimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 场景码(入驻时申请)
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 要查询的图片不可访问url列表
    @NameInMap("urls")
    @Validation(required = true)
    public java.util.List<String> urls;

    public static QueryConsumecardGoodsimageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardGoodsimageRequest self = new QueryConsumecardGoodsimageRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardGoodsimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConsumecardGoodsimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConsumecardGoodsimageRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryConsumecardGoodsimageRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryConsumecardGoodsimageRequest setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

}
