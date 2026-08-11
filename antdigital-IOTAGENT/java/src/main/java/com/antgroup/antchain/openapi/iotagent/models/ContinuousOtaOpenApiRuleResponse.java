// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ContinuousOtaOpenApiRuleResponse extends TeaModel {
    // 规则 ID
    /**
     * <strong>example:</strong>
     * <p>735103937447464960</p>
     */
    @NameInMap("rule_id")
    public String ruleId;

    // 规则在请求列表中的位置
    /**
     * <strong>example:</strong>
     * <p>规则在请求列表中的位置</p>
     */
    @NameInMap("request_index")
    public String requestIndex;

    // 规则乐观锁版本号
    /**
     * <strong>example:</strong>
     * <p>规则乐观锁版本号</p>
     */
    @NameInMap("lock_version")
    public String lockVersion;

    // 触发连续推送规则的设备上报模块名
    /**
     * <strong>example:</strong>
     * <p>BLE</p>
     */
    @NameInMap("trigger_module_name")
    public String triggerModuleName;

    // 结构化版本谓词
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("version_predicate")
    public ContinuousOtaVersionPredicate versionPredicate;

    // 服务端规范化版本谓词后生成的摘要
    /**
     * <strong>example:</strong>
     * <p>服务端规范化版本谓词后生成的摘要</p>
     */
    @NameInMap("predicate_hash")
    public String predicateHash;

    // 规则命中后需要升级的目标固件 ID
    /**
     * <strong>example:</strong>
     * <p>规则命中后需要升级的目标固件 ID</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // 目标固件模块名
    /**
     * <strong>example:</strong>
     * <p>目标固件模块名</p>
     */
    @NameInMap("target_module_name")
    public String targetModuleName;

    // 目标固件版本号
    /**
     * <strong>example:</strong>
     * <p>目标固件版本号</p>
     */
    @NameInMap("target_version_no")
    public String targetVersionNo;

    // 目标设备选择类型
    /**
     * <strong>example:</strong>
     * <p>目标设备选择类型</p>
     */
    @NameInMap("target_selection")
    public String targetSelection;

    // 规则执行通道
    /**
     * <strong>example:</strong>
     * <p>规则执行通道</p>
     */
    @NameInMap("execution_channel")
    public String executionChannel;

    // OTA 升级模式
    /**
     * <strong>example:</strong>
     * <p>OTA 升级模式</p>
     */
    @NameInMap("upgrade_mode")
    public String upgradeMode;

    // 是否主动推送升级
    /**
     * <strong>example:</strong>
     * <p>是否主动推送升级</p>
     */
    @NameInMap("need_push")
    public Boolean needPush;

    // 是否需要设备确认
    /**
     * <strong>example:</strong>
     * <p>是否需要设备确认</p>
     */
    @NameInMap("need_confirm")
    public Boolean needConfirm;

    // 失败重试次数
    /**
     * <strong>example:</strong>
     * <p>失败重试次数</p>
     */
    @NameInMap("retry_count")
    public String retryCount;

    // 重试间隔
    /**
     * <strong>example:</strong>
     * <p>重试间隔</p>
     */
    @NameInMap("retry_interval")
    public String retryInterval;

    // 单次升级超时时间
    /**
     * <strong>example:</strong>
     * <p>单次升级超时时间</p>
     */
    @NameInMap("timeout_in_minutes")
    public String timeoutInMinutes;

    // 规则命中后的延迟执行时间
    /**
     * <strong>example:</strong>
     * <p>规则命中后的延迟执行时间</p>
     */
    @NameInMap("delay_in_seconds")
    public String delayInSeconds;

    // 规则是否启用
    /**
     * <strong>example:</strong>
     * <p>规则是否启用</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    // 规则设备范围
    /**
     * <strong>example:</strong>
     * <p>规则设备范围</p>
     */
    @NameInMap("device_scope_type")
    public String deviceScopeType;

    // 规则生命周期状态
    /**
     * <strong>example:</strong>
     * <p>规则生命周期状态</p>
     */
    @NameInMap("lifecycle_status")
    public String lifecycleStatus;

    // 规则创建来源
    /**
     * <strong>example:</strong>
     * <p>规则创建来源</p>
     */
    @NameInMap("creation_source")
    public String creationSource;

    // 规则创建来源说明
    /**
     * <strong>example:</strong>
     * <p>规则创建来源说明</p>
     */
    @NameInMap("creation_source_description")
    public String creationSourceDescription;

    // 自动建批接口的幂等请求号
    /**
     * <strong>example:</strong>
     * <p>自动建批接口的幂等请求号</p>
     */
    @NameInMap("create_request_id")
    public String createRequestId;

    public static ContinuousOtaOpenApiRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousOtaOpenApiRuleResponse self = new ContinuousOtaOpenApiRuleResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousOtaOpenApiRuleResponse setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ContinuousOtaOpenApiRuleResponse setRequestIndex(String requestIndex) {
        this.requestIndex = requestIndex;
        return this;
    }
    public String getRequestIndex() {
        return this.requestIndex;
    }

    public ContinuousOtaOpenApiRuleResponse setLockVersion(String lockVersion) {
        this.lockVersion = lockVersion;
        return this;
    }
    public String getLockVersion() {
        return this.lockVersion;
    }

    public ContinuousOtaOpenApiRuleResponse setTriggerModuleName(String triggerModuleName) {
        this.triggerModuleName = triggerModuleName;
        return this;
    }
    public String getTriggerModuleName() {
        return this.triggerModuleName;
    }

    public ContinuousOtaOpenApiRuleResponse setVersionPredicate(ContinuousOtaVersionPredicate versionPredicate) {
        this.versionPredicate = versionPredicate;
        return this;
    }
    public ContinuousOtaVersionPredicate getVersionPredicate() {
        return this.versionPredicate;
    }

    public ContinuousOtaOpenApiRuleResponse setPredicateHash(String predicateHash) {
        this.predicateHash = predicateHash;
        return this;
    }
    public String getPredicateHash() {
        return this.predicateHash;
    }

    public ContinuousOtaOpenApiRuleResponse setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public ContinuousOtaOpenApiRuleResponse setTargetModuleName(String targetModuleName) {
        this.targetModuleName = targetModuleName;
        return this;
    }
    public String getTargetModuleName() {
        return this.targetModuleName;
    }

    public ContinuousOtaOpenApiRuleResponse setTargetVersionNo(String targetVersionNo) {
        this.targetVersionNo = targetVersionNo;
        return this;
    }
    public String getTargetVersionNo() {
        return this.targetVersionNo;
    }

    public ContinuousOtaOpenApiRuleResponse setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public ContinuousOtaOpenApiRuleResponse setExecutionChannel(String executionChannel) {
        this.executionChannel = executionChannel;
        return this;
    }
    public String getExecutionChannel() {
        return this.executionChannel;
    }

    public ContinuousOtaOpenApiRuleResponse setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public ContinuousOtaOpenApiRuleResponse setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
    }

    public ContinuousOtaOpenApiRuleResponse setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public ContinuousOtaOpenApiRuleResponse setRetryCount(String retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public String getRetryCount() {
        return this.retryCount;
    }

    public ContinuousOtaOpenApiRuleResponse setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public String getRetryInterval() {
        return this.retryInterval;
    }

    public ContinuousOtaOpenApiRuleResponse setTimeoutInMinutes(String timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public String getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public ContinuousOtaOpenApiRuleResponse setDelayInSeconds(String delayInSeconds) {
        this.delayInSeconds = delayInSeconds;
        return this;
    }
    public String getDelayInSeconds() {
        return this.delayInSeconds;
    }

    public ContinuousOtaOpenApiRuleResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ContinuousOtaOpenApiRuleResponse setDeviceScopeType(String deviceScopeType) {
        this.deviceScopeType = deviceScopeType;
        return this;
    }
    public String getDeviceScopeType() {
        return this.deviceScopeType;
    }

    public ContinuousOtaOpenApiRuleResponse setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
        return this;
    }
    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    public ContinuousOtaOpenApiRuleResponse setCreationSource(String creationSource) {
        this.creationSource = creationSource;
        return this;
    }
    public String getCreationSource() {
        return this.creationSource;
    }

    public ContinuousOtaOpenApiRuleResponse setCreationSourceDescription(String creationSourceDescription) {
        this.creationSourceDescription = creationSourceDescription;
        return this;
    }
    public String getCreationSourceDescription() {
        return this.creationSourceDescription;
    }

    public ContinuousOtaOpenApiRuleResponse setCreateRequestId(String createRequestId) {
        this.createRequestId = createRequestId;
        return this;
    }
    public String getCreateRequestId() {
        return this.createRequestId;
    }

}
