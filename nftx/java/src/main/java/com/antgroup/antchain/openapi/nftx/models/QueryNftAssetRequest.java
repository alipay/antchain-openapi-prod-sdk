// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基于租户Id生成的对应访问服务端的accessToken
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 对应此藏品的nftId
    @NameInMap("nft_id")
    @Validation(required = true)
    public String nftId;

    public static QueryNftAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNftAssetRequest self = new QueryNftAssetRequest();
        return TeaModel.build(map, self);
    }

    public QueryNftAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNftAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNftAssetRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public QueryNftAssetRequest setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

}
