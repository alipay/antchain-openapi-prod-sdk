// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateAlertStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键ID，更新依据
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户
    @NameInMap("tenant_name")
    public String tenantName;

    // 场景码
    // 
    @NameInMap("scene")
    public String scene;

    // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
    @NameInMap("strategy_type")
    public String strategyType;

    // 策略详情，json格式
    @NameInMap("strategy_detail")
    public String strategyDetail;

    // 是否启用，默认false
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // 备注
    // 
    @NameInMap("remark")
    public String remark;

    public static UpdateAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertStrategyRequest self = new UpdateAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAlertStrategyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAlertStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlertStrategyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateAlertStrategyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateAlertStrategyRequest setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public UpdateAlertStrategyRequest setStrategyDetail(String strategyDetail) {
        this.strategyDetail = strategyDetail;
        return this;
    }
    public String getStrategyDetail() {
        return this.strategyDetail;
    }

    public UpdateAlertStrategyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateAlertStrategyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
