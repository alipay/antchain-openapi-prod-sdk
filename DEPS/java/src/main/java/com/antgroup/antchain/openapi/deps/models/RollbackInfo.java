// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackInfo extends TeaModel {
    // group_amount
    @NameInMap("group_amount")
    @Validation(required = true)
    public Long groupAmount;

    // group_strategy
    @NameInMap("group_strategy")
    @Validation(required = true)
    public String groupStrategy;

    // reason
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // sub_entities
    @NameInMap("sub_entities")
    @Validation(required = true)
    public java.util.List<String> subEntities;

    // target_id
    @NameInMap("target_id")
    @Validation(required = true)
    public String targetId;

    // target_version
    @NameInMap("target_version")
    @Validation(required = true)
    public String targetVersion;

    // need_beta_group
    @NameInMap("need_beta_group")
    public Boolean needBetaGroup;

    // env_config
    @NameInMap("env_config")
    public java.util.List<Pair> envConfig;

    // confirm_succeeded_rollback
    @NameInMap("confirm_succeeded_rollback")
    public Boolean confirmSucceededRollback;

    // retry_rollbacked
    @NameInMap("retry_rollbacked")
    public Boolean retryRollbacked;

    public static RollbackInfo build(java.util.Map<String, ?> map) throws Exception {
        RollbackInfo self = new RollbackInfo();
        return TeaModel.build(map, self);
    }

    public RollbackInfo setGroupAmount(Long groupAmount) {
        this.groupAmount = groupAmount;
        return this;
    }
    public Long getGroupAmount() {
        return this.groupAmount;
    }

    public RollbackInfo setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public RollbackInfo setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RollbackInfo setSubEntities(java.util.List<String> subEntities) {
        this.subEntities = subEntities;
        return this;
    }
    public java.util.List<String> getSubEntities() {
        return this.subEntities;
    }

    public RollbackInfo setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public RollbackInfo setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public RollbackInfo setNeedBetaGroup(Boolean needBetaGroup) {
        this.needBetaGroup = needBetaGroup;
        return this;
    }
    public Boolean getNeedBetaGroup() {
        return this.needBetaGroup;
    }

    public RollbackInfo setEnvConfig(java.util.List<Pair> envConfig) {
        this.envConfig = envConfig;
        return this;
    }
    public java.util.List<Pair> getEnvConfig() {
        return this.envConfig;
    }

    public RollbackInfo setConfirmSucceededRollback(Boolean confirmSucceededRollback) {
        this.confirmSucceededRollback = confirmSucceededRollback;
        return this;
    }
    public Boolean getConfirmSucceededRollback() {
        return this.confirmSucceededRollback;
    }

    public RollbackInfo setRetryRollbacked(Boolean retryRollbacked) {
        this.retryRollbacked = retryRollbacked;
        return this;
    }
    public Boolean getRetryRollbacked() {
        return this.retryRollbacked;
    }

}
