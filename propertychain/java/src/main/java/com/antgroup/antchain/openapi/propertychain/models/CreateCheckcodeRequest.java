// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateCheckcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物权码
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 创建验权码的用户
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateCheckcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckcodeRequest self = new CreateCheckcodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCheckcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCheckcodeRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CreateCheckcodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
