// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddAlertStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 场景码
    @NameInMap("scene")
    public String scene;

    // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
    @NameInMap("strategy_type")
    @Validation(required = true)
    public String strategyType;

    // 策略详情，json格式
    @NameInMap("strategy_detail")
    @Validation(required = true)
    public String strategyDetail;

    // 是否启用，默认false
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static AddAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAlertStrategyRequest self = new AddAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public AddAlertStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAlertStrategyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAlertStrategyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AddAlertStrategyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddAlertStrategyRequest setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public AddAlertStrategyRequest setStrategyDetail(String strategyDetail) {
        this.strategyDetail = strategyDetail;
        return this;
    }
    public String getStrategyDetail() {
        return this.strategyDetail;
    }

    public AddAlertStrategyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public AddAlertStrategyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
