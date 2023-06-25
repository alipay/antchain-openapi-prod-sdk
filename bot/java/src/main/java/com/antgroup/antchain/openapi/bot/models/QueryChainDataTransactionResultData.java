// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryChainDataTransactionResultData extends TeaModel {
    // 业务ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 数据资产类型
    @NameInMap("data_scene")
    @Validation(required = true)
    public String dataScene;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 资产数据
    @NameInMap("asset_data")
    @Validation(required = true)
    public String assetData;

    // 时间
    @NameInMap("timestamp")
    public Long timestamp;

    public static QueryChainDataTransactionResultData build(java.util.Map<String, ?> map) throws Exception {
        QueryChainDataTransactionResultData self = new QueryChainDataTransactionResultData();
        return TeaModel.build(map, self);
    }

    public QueryChainDataTransactionResultData setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryChainDataTransactionResultData setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public QueryChainDataTransactionResultData setDataScene(String dataScene) {
        this.dataScene = dataScene;
        return this;
    }
    public String getDataScene() {
        return this.dataScene;
    }

    public QueryChainDataTransactionResultData setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryChainDataTransactionResultData setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryChainDataTransactionResultData setAssetData(String assetData) {
        this.assetData = assetData;
        return this;
    }
    public String getAssetData() {
        return this.assetData;
    }

    public QueryChainDataTransactionResultData setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
