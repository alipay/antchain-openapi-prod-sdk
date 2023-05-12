// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class BatchcreateAppsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与者数组
    @NameInMap("action_array")
    public java.util.List<Participator> actionArray;

    // 1 同库； 2 异库
    @NameInMap("activity_mode")
    public Long activityMode;

    // app
    @NameInMap("app_name")
    public String appName;

    // Hash
    @NameInMap("db_rule_name")
    public String dbRuleName;

    // xxx
    @NameInMap("db_rule_templete")
    public String dbRuleTemplete;

    // 描述
    @NameInMap("desc")
    public String desc;

    // 编辑时传
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 发起方信息
    @NameInMap("recovery_array")
    public java.util.List<RecoveryDTO> recoveryArray;

    // 数据源数组
    @NameInMap("recovery_ds_array")
    public java.util.List<RecoveryDsDTO> recoveryDsArray;

    // hash
    @NameInMap("table_rule_name")
    public String tableRuleName;

    // xxx
    @NameInMap("table_rule_templete")
    public String tableRuleTemplete;

    public static BatchcreateAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAppsRequest self = new BatchcreateAppsRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateAppsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateAppsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateAppsRequest setActionArray(java.util.List<Participator> actionArray) {
        this.actionArray = actionArray;
        return this;
    }
    public java.util.List<Participator> getActionArray() {
        return this.actionArray;
    }

    public BatchcreateAppsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public BatchcreateAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchcreateAppsRequest setDbRuleName(String dbRuleName) {
        this.dbRuleName = dbRuleName;
        return this;
    }
    public String getDbRuleName() {
        return this.dbRuleName;
    }

    public BatchcreateAppsRequest setDbRuleTemplete(String dbRuleTemplete) {
        this.dbRuleTemplete = dbRuleTemplete;
        return this;
    }
    public String getDbRuleTemplete() {
        return this.dbRuleTemplete;
    }

    public BatchcreateAppsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public BatchcreateAppsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BatchcreateAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchcreateAppsRequest setRecoveryArray(java.util.List<RecoveryDTO> recoveryArray) {
        this.recoveryArray = recoveryArray;
        return this;
    }
    public java.util.List<RecoveryDTO> getRecoveryArray() {
        return this.recoveryArray;
    }

    public BatchcreateAppsRequest setRecoveryDsArray(java.util.List<RecoveryDsDTO> recoveryDsArray) {
        this.recoveryDsArray = recoveryDsArray;
        return this;
    }
    public java.util.List<RecoveryDsDTO> getRecoveryDsArray() {
        return this.recoveryDsArray;
    }

    public BatchcreateAppsRequest setTableRuleName(String tableRuleName) {
        this.tableRuleName = tableRuleName;
        return this;
    }
    public String getTableRuleName() {
        return this.tableRuleName;
    }

    public BatchcreateAppsRequest setTableRuleTemplete(String tableRuleTemplete) {
        this.tableRuleTemplete = tableRuleTemplete;
        return this;
    }
    public String getTableRuleTemplete() {
        return this.tableRuleTemplete;
    }

}
