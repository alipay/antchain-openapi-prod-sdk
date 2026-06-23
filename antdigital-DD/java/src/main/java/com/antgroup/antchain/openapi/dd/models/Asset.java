// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Asset extends TeaModel {
    // 资产标识，作为幂等单号
    /**
     * <strong>example:</strong>
     * <p>2024112900876318</p>
     */
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // VALID - 生效；INVALID - 作废
    /**
     * <strong>example:</strong>
     * <p>资产状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 资产详情，自定义展示
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;company&quot;:&quot;alpha&quot;,&quot;name&quot;:&quot;beta&quot;,&quot;phone&quot;:&quot;18812345678&quot;,&quot;email&quot;:&quot;<a href="mailto:hello@example.com">hello@example.com</a>&quot;,&quot;position&quot;:&quot;gamma&quot;,&quot;industry&quot;:&quot;zeta&quot;,&quot;content&quot;:&quot;delta&quot;}&quot;</p>
     */
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
