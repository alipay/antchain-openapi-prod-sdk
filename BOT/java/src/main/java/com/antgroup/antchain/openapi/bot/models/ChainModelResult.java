// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ChainModelResult extends TeaModel {
    // 所属业务
    /**
     * <strong>example:</strong>
     * <p>XR_LEASE</p>
     */
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 资产类型
    /**
     * <strong>example:</strong>
     * <p>LOCK_RECORD</p>
     */
    @NameInMap("data_scene")
    @Validation(required = true)
    public String dataScene;

    // 资产id
    /**
     * <strong>example:</strong>
     * <p>资产id</p>
     */
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 资产数据内容json
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("asset_data")
    @Validation(required = true)
    public String assetData;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>SDFJAG</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 上链时间
    /**
     * <strong>example:</strong>
     * <p>2022-10-02 09:10:09</p>
     */
    @NameInMap("tx_time")
    @Validation(required = true)
    public String txTime;

    // 业务ID
    /**
     * <strong>example:</strong>
     * <p>业务ID</p>
     */
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 上链id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("antchain_id")
    @Validation(required = true)
    public String antchainId;

    public static ChainModelResult build(java.util.Map<String, ?> map) throws Exception {
        ChainModelResult self = new ChainModelResult();
        return TeaModel.build(map, self);
    }

    public ChainModelResult setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ChainModelResult setDataScene(String dataScene) {
        this.dataScene = dataScene;
        return this;
    }
    public String getDataScene() {
        return this.dataScene;
    }

    public ChainModelResult setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ChainModelResult setAssetData(String assetData) {
        this.assetData = assetData;
        return this;
    }
    public String getAssetData() {
        return this.assetData;
    }

    public ChainModelResult setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChainModelResult setTxTime(String txTime) {
        this.txTime = txTime;
        return this;
    }
    public String getTxTime() {
        return this.txTime;
    }

    public ChainModelResult setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public ChainModelResult setAntchainId(String antchainId) {
        this.antchainId = antchainId;
        return this;
    }
    public String getAntchainId() {
        return this.antchainId;
    }

}
