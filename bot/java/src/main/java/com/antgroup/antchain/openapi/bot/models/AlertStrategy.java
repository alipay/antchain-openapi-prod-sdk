// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AlertStrategy extends TeaModel {
    // 主键ID 
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 租户
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 场景码
    // 
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

    public static AlertStrategy build(java.util.Map<String, ?> map) throws Exception {
        AlertStrategy self = new AlertStrategy();
        return TeaModel.build(map, self);
    }

    public AlertStrategy setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlertStrategy setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AlertStrategy setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AlertStrategy setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AlertStrategy setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AlertStrategy setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public AlertStrategy setStrategyDetail(String strategyDetail) {
        this.strategyDetail = strategyDetail;
        return this;
    }
    public String getStrategyDetail() {
        return this.strategyDetail;
    }

    public AlertStrategy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public AlertStrategy setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
