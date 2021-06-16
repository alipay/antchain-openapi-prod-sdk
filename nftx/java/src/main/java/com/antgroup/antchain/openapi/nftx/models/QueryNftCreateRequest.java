// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对端自己的项目id；NFT发行时用作幂等字段
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // NFT发行成功的商品id，传入sku_id时以此为准做查询
    @NameInMap("sku_id")
    public Long skuId;

    public static QueryNftCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNftCreateRequest self = new QueryNftCreateRequest();
        return TeaModel.build(map, self);
    }

    public QueryNftCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNftCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNftCreateRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryNftCreateRequest setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

}
