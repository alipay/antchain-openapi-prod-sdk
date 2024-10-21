// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class TradeFulfillResult extends TeaModel {
    // 履约单据号，可用于作为幂等依据
    @NameInMap("fulfill_order_no")
    @Validation(required = true)
    public String fulfillOrderNo;

    // 履约枚举，生产-PROVISION，停服-STOP，释放-RELEASE，恢复/RESUME
    // 
    @NameInMap("fulfill_type")
    @Validation(required = true)
    public String fulfillType;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 主商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 履约实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static TradeFulfillResult build(java.util.Map<String, ?> map) throws Exception {
        TradeFulfillResult self = new TradeFulfillResult();
        return TeaModel.build(map, self);
    }

    public TradeFulfillResult setFulfillOrderNo(String fulfillOrderNo) {
        this.fulfillOrderNo = fulfillOrderNo;
        return this;
    }
    public String getFulfillOrderNo() {
        return this.fulfillOrderNo;
    }

    public TradeFulfillResult setFulfillType(String fulfillType) {
        this.fulfillType = fulfillType;
        return this;
    }
    public String getFulfillType() {
        return this.fulfillType;
    }

    public TradeFulfillResult setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TradeFulfillResult setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public TradeFulfillResult setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
