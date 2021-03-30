// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchunfreezeImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批量操作信息列表
    @NameInMap("asset_id_list")
    @Validation(required = true)
    public java.util.List<String> assetIdList;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static BatchunfreezeImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchunfreezeImportassetRequest self = new BatchunfreezeImportassetRequest();
        return TeaModel.build(map, self);
    }

    public BatchunfreezeImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchunfreezeImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchunfreezeImportassetRequest setAssetIdList(java.util.List<String> assetIdList) {
        this.assetIdList = assetIdList;
        return this;
    }
    public java.util.List<String> getAssetIdList() {
        return this.assetIdList;
    }

    public BatchunfreezeImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
