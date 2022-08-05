// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateAsseturiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    // 数字权证asset uri定义
    @NameInMap("asset_uri_definition")
    @Validation(required = true)
    public AssetUriDefinition assetUriDefinition;

    public static CreateAsseturiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsseturiRequest self = new CreateAsseturiRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsseturiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAsseturiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAsseturiRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateAsseturiRequest setAssetUriDefinition(AssetUriDefinition assetUriDefinition) {
        this.assetUriDefinition = assetUriDefinition;
        return this;
    }
    public AssetUriDefinition getAssetUriDefinition() {
        return this.assetUriDefinition;
    }

}
