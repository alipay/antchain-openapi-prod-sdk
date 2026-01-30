// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    // 租户id
    /**
     * <strong>example:</strong>
     * <p>2088*****</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>实例id</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 商品code
    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
    /**
     * <strong>example:</strong>
     * <p>PREPAY_BY_MONTH</p>
     */
    @NameInMap("charge_type")
    @Validation(required = true)
    public String chargeType;

    // 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
    /**
     * <strong>example:</strong>
     * <p>STARTED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static Instance build(java.util.Map<String, ?> map) throws Exception {
        Instance self = new Instance();
        return TeaModel.build(map, self);
    }

    public Instance setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public Instance setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
