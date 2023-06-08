// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryResourceImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // access_token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 素材的类型（AIGC/NFT）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 资源ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // type为NFT必填
    @NameInMap("nft_id")
    public String nftId;

    public static QueryResourceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceImageRequest self = new QueryResourceImageRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourceImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryResourceImageRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public QueryResourceImageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryResourceImageRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public QueryResourceImageRequest setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

}
