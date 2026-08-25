// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    // 付费方式 PREPAY_BY_MONTH _按月预付_; AFTER_PAY_BY_HOUR _按小时后收_
    /**
     * <strong>example:</strong>
     * <p>PREPAY_BY_MONTH</p>
     */
    @NameInMap("charge_type")
    public String chargeType;

    // 实例当前配置
    @NameInMap("components")
    public java.util.List<Component> components;

    // 合约截止时间
    /**
     * <strong>example:</strong>
     * <p>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 实例Id
    /**
     * <strong>example:</strong>
     * <p>A0CSCMAYIBANKPWBATNA4F</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    // 产品code
    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("product_code")
    public String productCode;

    // 续费信息
    @NameInMap("renewals")
    public java.util.List<Renewal> renewals;

    // 合约生效时间
    /**
     * <strong>example:</strong>
     * <p>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 实例状态 CREATING 创建中,FAILED 创建失败,STARTED 运行中,STOPPED 已停服,CHANGING 变配中,RELEASED 已释放
    /**
     * <strong>example:</strong>
     * <p>STARTED</p>
     */
    @NameInMap("status")
    public String status;

    public static Instance build(java.util.Map<String, ?> map) throws Exception {
        Instance self = new Instance();
        return TeaModel.build(map, self);
    }

    public Instance setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public Instance setComponents(java.util.List<Component> components) {
        this.components = components;
        return this;
    }
    public java.util.List<Component> getComponents() {
        return this.components;
    }

    public Instance setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public Instance setRenewals(java.util.List<Renewal> renewals) {
        this.renewals = renewals;
        return this;
    }
    public java.util.List<Renewal> getRenewals() {
        return this.renewals;
    }

    public Instance setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
