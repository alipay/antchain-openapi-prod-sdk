// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class Asset extends TeaModel {
    // 资产标识，作为幂等单号
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // VALID - 生效；INVALID - 作废
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 资产详情，自定义展示
    @NameInMap("asset_info")
    @Validation(required = true)
    public String assetInfo;

    public static Asset build(java.util.Map<String, ?> map) throws Exception {
        Asset self = new Asset();
        return TeaModel.build(map, self);
    }

    public Asset setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public Asset setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Asset setAssetInfo(String assetInfo) {
        this.assetInfo = assetInfo;
        return this;
    }
    public String getAssetInfo() {
        return this.assetInfo;
    }

}
