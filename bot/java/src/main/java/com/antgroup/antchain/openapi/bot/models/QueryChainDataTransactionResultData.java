// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryChainDataTransactionResultData extends TeaModel {
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

    // 业务数据hash
    @NameInMap("text_hash")
    @Validation(required = true)
    public String textHash;

    // 时间
    @NameInMap("timestamp")
    public Long timestamp;

    public static QueryChainDataTransactionResultData build(java.util.Map<String, ?> map) throws Exception {
        QueryChainDataTransactionResultData self = new QueryChainDataTransactionResultData();
        return TeaModel.build(map, self);
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

    public QueryChainDataTransactionResultData setTextHash(String textHash) {
        this.textHash = textHash;
        return this;
    }
    public String getTextHash() {
        return this.textHash;
    }

    public QueryChainDataTransactionResultData setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
