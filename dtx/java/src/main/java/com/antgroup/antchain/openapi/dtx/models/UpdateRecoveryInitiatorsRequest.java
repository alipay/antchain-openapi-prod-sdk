// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class UpdateRecoveryInitiatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // action_mode
    @NameInMap("action_mode")
    @Validation(required = true)
    public Long actionMode;

    // 1同库，2异库
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 关联关系表的id，用于更新
    @NameInMap("biz_type_id")
    @Validation(required = true)
    public Long bizTypeId;

    // Client 版本
    @NameInMap("client_version")
    @Validation(required = true)
    public String clientVersion;

    // 记录id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

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

    public static UpdateRecoveryInitiatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecoveryInitiatorsRequest self = new UpdateRecoveryInitiatorsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecoveryInitiatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRecoveryInitiatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateRecoveryInitiatorsRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public UpdateRecoveryInitiatorsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public UpdateRecoveryInitiatorsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateRecoveryInitiatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateRecoveryInitiatorsRequest setBizTypeId(Long bizTypeId) {
        this.bizTypeId = bizTypeId;
        return this;
    }
    public Long getBizTypeId() {
        return this.bizTypeId;
    }

    public UpdateRecoveryInitiatorsRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UpdateRecoveryInitiatorsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateRecoveryInitiatorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRecoveryInitiatorsRequest setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public UpdateRecoveryInitiatorsRequest setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public UpdateRecoveryInitiatorsRequest setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public UpdateRecoveryInitiatorsRequest setRecoveryDatasources(java.util.List<InitiatorDatasource> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<InitiatorDatasource> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public UpdateRecoveryInitiatorsRequest setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public UpdateRecoveryInitiatorsRequest setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

}
