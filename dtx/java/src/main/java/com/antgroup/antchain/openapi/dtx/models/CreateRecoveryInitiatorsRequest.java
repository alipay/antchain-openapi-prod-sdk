// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateRecoveryInitiatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // action_mode
    @NameInMap("action_mode")
    public Long actionMode;

    // activity_mode
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 业务码
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // Client 版本
    @NameInMap("client_version")
    @Validation(required = true)
    public String clientVersion;

    // 应用描述
    // 
    @NameInMap("desc")
    public String desc;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否异步化
    @NameInMap("is_asyn")
    @Validation(required = true)
    public Boolean isAsyn;

    // 是否压测任务
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Boolean isLoadTest;

    // 是否混合模式
    @NameInMap("is_mix")
    @Validation(required = true)
    public Boolean isMix;

    // 发起方数据源
    @NameInMap("recovery_datasources")
    @Validation(required = true)
    public java.util.List<InitiatorDatasource> recoveryDatasources;

    // 恢复条数/分/表
    @NameInMap("recovery_limit")
    @Validation(required = true)
    public Long recoveryLimit;

    // 恢复线程数
    @NameInMap("recovery_thread_num")
    @Validation(required = true)
    public Long recoveryThreadNum;

    // SINGLE：单库单表 SPLIT：分库分表
    // 
    @NameInMap("split_mode")
    public String splitMode;

    // 分库分表规则
    // 
    @NameInMap("split_rule")
    public SplitRule splitRule;

    public static CreateRecoveryInitiatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecoveryInitiatorsRequest self = new CreateRecoveryInitiatorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecoveryInitiatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRecoveryInitiatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRecoveryInitiatorsRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public CreateRecoveryInitiatorsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateRecoveryInitiatorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRecoveryInitiatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateRecoveryInitiatorsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateRecoveryInitiatorsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateRecoveryInitiatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRecoveryInitiatorsRequest setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public CreateRecoveryInitiatorsRequest setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public CreateRecoveryInitiatorsRequest setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public CreateRecoveryInitiatorsRequest setRecoveryDatasources(java.util.List<InitiatorDatasource> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<InitiatorDatasource> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public CreateRecoveryInitiatorsRequest setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public CreateRecoveryInitiatorsRequest setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

    public CreateRecoveryInitiatorsRequest setSplitMode(String splitMode) {
        this.splitMode = splitMode;
        return this;
    }
    public String getSplitMode() {
        return this.splitMode;
    }

    public CreateRecoveryInitiatorsRequest setSplitRule(SplitRule splitRule) {
        this.splitRule = splitRule;
        return this;
    }
    public SplitRule getSplitRule() {
        return this.splitRule;
    }

}
