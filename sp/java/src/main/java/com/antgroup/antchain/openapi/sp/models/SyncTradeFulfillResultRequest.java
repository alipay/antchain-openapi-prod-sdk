// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class SyncTradeFulfillResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 履约单据号，可用于作为幂等依据
    @NameInMap("fulfill_order_no")
    @Validation(required = true)
    public String fulfillOrderNo;

    // 履约枚举，新购-NEW
    @NameInMap("fulfill_type")
    @Validation(required = true)
    public String fulfillType;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 租户8位英文名
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 主商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 履约实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static SyncTradeFulfillResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradeFulfillResultRequest self = new SyncTradeFulfillResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradeFulfillResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradeFulfillResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradeFulfillResultRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public SyncTradeFulfillResultRequest setFulfillOrderNo(String fulfillOrderNo) {
        this.fulfillOrderNo = fulfillOrderNo;
        return this;
    }
    public String getFulfillOrderNo() {
        return this.fulfillOrderNo;
    }

    public SyncTradeFulfillResultRequest setFulfillType(String fulfillType) {
        this.fulfillType = fulfillType;
        return this;
    }
    public String getFulfillType() {
        return this.fulfillType;
    }

    public SyncTradeFulfillResultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncTradeFulfillResultRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public SyncTradeFulfillResultRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public SyncTradeFulfillResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
