// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteGuardianGuardianrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 是否可用
    @NameInMap("enable")
    public Boolean enable;

    // 创建
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 监控规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 描述字段
    @NameInMap("name")
    public String name;

    // 编辑人
    @NameInMap("operator")
    public String operator;

    // 资源类型
    @NameInMap("resource_type")
    public String resourceType;

    // 规则配置
    @NameInMap("rule_config")
    public String ruleConfig;

    // 运行模式
    @NameInMap("run_mode")
    public String runMode;

    public static DeleteGuardianGuardianrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGuardianGuardianrulesRequest self = new DeleteGuardianGuardianrulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGuardianGuardianrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteGuardianGuardianrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteGuardianGuardianrulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteGuardianGuardianrulesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DeleteGuardianGuardianrulesRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DeleteGuardianGuardianrulesRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DeleteGuardianGuardianrulesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteGuardianGuardianrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteGuardianGuardianrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteGuardianGuardianrulesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteGuardianGuardianrulesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DeleteGuardianGuardianrulesRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public DeleteGuardianGuardianrulesRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

}
