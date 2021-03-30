// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AssetResult extends TeaModel {
    // 资产id
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 信息
    @NameInMap("message")
    public String message;

    public static AssetResult build(java.util.Map<String, ?> map) throws Exception {
        AssetResult self = new AssetResult();
        return TeaModel.build(map, self);
    }

    public AssetResult setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public AssetResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AssetResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
