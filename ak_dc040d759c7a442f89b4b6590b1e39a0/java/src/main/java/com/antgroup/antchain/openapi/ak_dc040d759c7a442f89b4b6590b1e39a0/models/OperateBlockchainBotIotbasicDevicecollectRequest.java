// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class OperateBlockchainBotIotbasicDevicecollectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
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

    public static OperateBlockchainBotIotbasicDevicecollectRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateBlockchainBotIotbasicDevicecollectRequest self = new OperateBlockchainBotIotbasicDevicecollectRequest();
        return TeaModel.build(map, self);
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setDataScene(String dataScene) {
        this.dataScene = dataScene;
        return this;
    }
    public String getDataScene() {
        return this.dataScene;
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public OperateBlockchainBotIotbasicDevicecollectRequest setAssetData(String assetData) {
        this.assetData = assetData;
        return this;
    }
    public String getAssetData() {
        return this.assetData;
    }

}
