// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncPccCommodityStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 主商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 商品名称
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 商品服务模式，PLATFORM-平台型
    @NameInMap("commodity_service_mode")
    @Validation(required = true)
    public String commodityServiceMode;

    // 商品计费模式，PREPAY_BY_MONTH-包年包月 AFTER_PAY_BY_HOUR-按量付费
    @NameInMap("commodity_charge_type")
    @Validation(required = true)
    public String commodityChargeType;

    // 商品状态，ONLINE-上架，OFFLINE-下架
    @NameInMap("commodity_status")
    @Validation(required = true)
    public String commodityStatus;

    // 产品干系人
    @NameInMap("product_rel_uses")
    @Validation(required = true)
    public java.util.List<RelUser> productRelUses;

    public static SyncPccCommodityStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncPccCommodityStatusRequest self = new SyncPccCommodityStatusRequest();
        return TeaModel.build(map, self);
    }

    public SyncPccCommodityStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncPccCommodityStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncPccCommodityStatusRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncPccCommodityStatusRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public SyncPccCommodityStatusRequest setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public SyncPccCommodityStatusRequest setCommodityServiceMode(String commodityServiceMode) {
        this.commodityServiceMode = commodityServiceMode;
        return this;
    }
    public String getCommodityServiceMode() {
        return this.commodityServiceMode;
    }

    public SyncPccCommodityStatusRequest setCommodityChargeType(String commodityChargeType) {
        this.commodityChargeType = commodityChargeType;
        return this;
    }
    public String getCommodityChargeType() {
        return this.commodityChargeType;
    }

    public SyncPccCommodityStatusRequest setCommodityStatus(String commodityStatus) {
        this.commodityStatus = commodityStatus;
        return this;
    }
    public String getCommodityStatus() {
        return this.commodityStatus;
    }

    public SyncPccCommodityStatusRequest setProductRelUses(java.util.List<RelUser> productRelUses) {
        this.productRelUses = productRelUses;
        return this;
    }
    public java.util.List<RelUser> getProductRelUses() {
        return this.productRelUses;
    }

}
