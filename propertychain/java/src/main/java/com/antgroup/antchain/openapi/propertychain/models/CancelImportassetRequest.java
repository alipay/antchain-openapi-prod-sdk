// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CancelImportassetRequest extends TeaModel {
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

    public static CancelImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelImportassetRequest self = new CancelImportassetRequest();
        return TeaModel.build(map, self);
    }

    public CancelImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelImportassetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CancelImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
