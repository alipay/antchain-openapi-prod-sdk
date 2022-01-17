// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class StrategyInfoVO extends TeaModel {
    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 策略唯一标识
    @NameInMap("strategy_id")
    public String strategyId;

    // 策略名称
    @NameInMap("strategy_name")
    public String strategyName;

    // 策略状态
    @NameInMap("strategy_status")
    public String strategyStatus;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 	
    // API数量
    @NameInMap("api_count")
    public Long apiCount;

    // 策略描述
    @NameInMap("description")
    public String description;

    // 策略类型
    @NameInMap("strategy_type")
    public String strategyType;

    // 名单集合
    @NameInMap("host")
    public java.util.List<String> host;

    // true, false
    @NameInMap("can_delete")
    public Boolean canDelete;

    public static StrategyInfoVO build(java.util.Map<String, ?> map) throws Exception {
        StrategyInfoVO self = new StrategyInfoVO();
        return TeaModel.build(map, self);
    }

    public StrategyInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public StrategyInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public StrategyInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public StrategyInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public StrategyInfoVO setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public StrategyInfoVO setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public StrategyInfoVO setStrategyStatus(String strategyStatus) {
        this.strategyStatus = strategyStatus;
        return this;
    }
    public String getStrategyStatus() {
        return this.strategyStatus;
    }

    public StrategyInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public StrategyInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public StrategyInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StrategyInfoVO setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public StrategyInfoVO setHost(java.util.List<String> host) {
        this.host = host;
        return this;
    }
    public java.util.List<String> getHost() {
        return this.host;
    }

    public StrategyInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

}
