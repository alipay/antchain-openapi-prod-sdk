// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateComboOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 场景接入码，中台分配
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 业务流水号，用于幂等
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 套餐编码
    @NameInMap("combo_code")
    @Validation(required = true)
    public String comboCode;

    // 租户ID，和租户名二选一必填
    // 
    @NameInMap("tenant_id")
    public String tenantId;

    // 8位租户名，和租户ID二选一必填
    // 
    @NameInMap("tenant_name")
    public String tenantName;

    // 操作人ID，为空则等于当前租户ID
    @NameInMap("operator_id")
    public String operatorId;

    // 订购周期，当套餐中包含包周期型的商品，必填
    @NameInMap("duration")
    public OrderDuration duration;

    // 优惠券ID
    @NameInMap("coupon_id")
    public String couponId;

    // [{"instance_key":"isvId","instance_value":"邀请码},{"instance_key":"policyId","instance_value":"政策id}]
    @NameInMap("instance_labels")
    public java.util.List<InstanceLabel> instanceLabels;

    public static CreateComboOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComboOrderRequest self = new CreateComboOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateComboOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateComboOrderRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CreateComboOrderRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateComboOrderRequest setComboCode(String comboCode) {
        this.comboCode = comboCode;
        return this;
    }
    public String getComboCode() {
        return this.comboCode;
    }

    public CreateComboOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateComboOrderRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateComboOrderRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateComboOrderRequest setDuration(OrderDuration duration) {
        this.duration = duration;
        return this;
    }
    public OrderDuration getDuration() {
        return this.duration;
    }

    public CreateComboOrderRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public CreateComboOrderRequest setInstanceLabels(java.util.List<InstanceLabel> instanceLabels) {
        this.instanceLabels = instanceLabels;
        return this;
    }
    public java.util.List<InstanceLabel> getInstanceLabels() {
        return this.instanceLabels;
    }

}
