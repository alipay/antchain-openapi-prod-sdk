// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicDevicecollectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 资产ID
    @NameInMap("asset_id")
    public String assetId;

    // 数据资产类型
    @NameInMap("data_scene")
    @Validation(required = true)
    public String dataScene;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 资产数据内容，业务要上链的数据JSON格式
    @NameInMap("asset_data")
    @Validation(required = true)
    public String assetData;

    public static OperateIotbasicDevicecollectRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicDevicecollectRequest self = new OperateIotbasicDevicecollectRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicDevicecollectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicDevicecollectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicDevicecollectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateIotbasicDevicecollectRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public OperateIotbasicDevicecollectRequest setDataScene(String dataScene) {
        this.dataScene = dataScene;
        return this;
    }
    public String getDataScene() {
        return this.dataScene;
    }

    public OperateIotbasicDevicecollectRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public OperateIotbasicDevicecollectRequest setAssetData(String assetData) {
        this.assetData = assetData;
        return this;
    }
    public String getAssetData() {
        return this.assetData;
    }

}
