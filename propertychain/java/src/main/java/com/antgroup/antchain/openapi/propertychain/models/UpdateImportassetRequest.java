// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物权id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 数据字典内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 用户标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static UpdateImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImportassetRequest self = new UpdateImportassetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateImportassetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public UpdateImportassetRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
