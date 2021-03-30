// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UnfreezeImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物权id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static UnfreezeImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeImportassetRequest self = new UnfreezeImportassetRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnfreezeImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnfreezeImportassetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public UnfreezeImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
