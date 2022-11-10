// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CollectInfo extends TeaModel {
    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 数据资产类型
    @NameInMap("data_scene")
    @Validation(required = true)
    public String dataScene;

    // 资产数据内容，业务要上链的数据JSON格式
    @NameInMap("asset_data")
    @Validation(required = true)
    public String assetData;

    // 上链数据采集id
    @NameInMap("collect_id")
    @Validation(required = true)
    public String collectId;

    public static CollectInfo build(java.util.Map<String, ?> map) throws Exception {
        CollectInfo self = new CollectInfo();
        return TeaModel.build(map, self);
    }

    public CollectInfo setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CollectInfo setDataScene(String dataScene) {
        this.dataScene = dataScene;
        return this;
    }
    public String getDataScene() {
        return this.dataScene;
    }

    public CollectInfo setAssetData(String assetData) {
        this.assetData = assetData;
        return this;
    }
    public String getAssetData() {
        return this.assetData;
    }

    public CollectInfo setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

}
