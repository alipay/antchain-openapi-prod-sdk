// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchcancelImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产id列表
    @NameInMap("asset_id_list")
    @Validation(required = true)
    public java.util.List<String> assetIdList;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static BatchcancelImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcancelImportassetRequest self = new BatchcancelImportassetRequest();
        return TeaModel.build(map, self);
    }

    public BatchcancelImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcancelImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcancelImportassetRequest setAssetIdList(java.util.List<String> assetIdList) {
        this.assetIdList = assetIdList;
        return this;
    }
    public java.util.List<String> getAssetIdList() {
        return this.assetIdList;
    }

    public BatchcancelImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
