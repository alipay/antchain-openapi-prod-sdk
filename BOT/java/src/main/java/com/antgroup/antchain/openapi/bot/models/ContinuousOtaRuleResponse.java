// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ContinuousOtaRuleResponse extends TeaModel {
    // 规则 ID
    /**
     * <strong>example:</strong>
     * <p>649425581309837312</p>
     */
    @NameInMap("rule_id")
    public String ruleId;

    // 规则在请求列表中的位置；非请求校验响应时为空
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("request_index")
    public Long requestIndex;

    // 规则乐观锁版本号，以字符串返回
    /**
     * <strong>example:</strong>
     * <p>1</p>
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

    // 触发版本匹配条件
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("version_predicate")
    public ContinuousOtaVersionPredicate versionPredicate;

    // 服务端规范化版本谓词后生成的摘要
    /**
     * <strong>example:</strong>
     * <p>ee76b371d0352fc0fbb17a19fdf584b2352eb8948583a620ce8ba3b238956c3c</p>
     */
    @NameInMap("predicate_hash")
    public String predicateHash;

    // 规则命中后需要升级的目标固件 ID
    /**
     * <strong>example:</strong>
     * <p>84a1f449422946d2a4e87c1c23503f6b</p>
     */
    @NameInMap("firmware_id")
    public String firmwareId;

    // 目标固件模块名
    /**
     * <strong>example:</strong>
     * <p>ble</p>
     */
    @NameInMap("target_module_name")
    public String targetModuleName;

    // 目标固件版本号
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("target_version_no")
    public String targetVersionNo;

    // 目标设备选择类型，管理面固定为 SPECIFIC
    /**
     * <strong>example:</strong>
     * <p>SPECIFIC</p>
     */
    @NameInMap("target_selection")
    public String targetSelection;

    // 规则执行通道
    /**
     * <strong>example:</strong>
     * <p>TUYA_4G</p>
     */
    @NameInMap("execution_channel")
    public String executionChannel;

    // OTA 升级模式
    /**
     * <strong>example:</strong>
     * <p>SILENT</p>
     */
    @NameInMap("upgrade_mode")
    public String upgradeMode;

    // 是否主动推送升级
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_push")
    public Boolean needPush;

    // 是否需要设备确认
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_confirm")
    public Boolean needConfirm;

    // 失败重试次数
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("retry_count")
    public Long retryCount;

    // 重试间隔，单位为分钟
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("retry_interval")
    public Long retryInterval;

    // 单次升级超时时间，单位为分钟
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("timeout_in_minutes")
    public Long timeoutInMinutes;

    // 规则命中后的延迟执行时间，单位为秒
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("delay_in_seconds")
    public Long delayInSeconds;

    // 规则是否启用
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    // 规则设备范围
    /**
     * <strong>example:</strong>
     * <p>ALL_DEVICES</p>
     */
    @NameInMap("device_scope_type")
    public String deviceScopeType;

    // 规则生命周期状态
    /**
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("lifecycle_status")
    public String lifecycleStatus;

    // 规则创建来源：MANUAL_CONFIG 或 MODULE_VERSION_JOB。
    /**
     * <strong>example:</strong>
     * <p>MANUAL_CONFIG</p>
     */
    @NameInMap("creation_source")
    public String creationSource;

    // 规则创建来源说明
    /**
     * <strong>example:</strong>
     * <p>由连续推送规则配置接口创建</p>
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

    public static ContinuousOtaRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousOtaRuleResponse self = new ContinuousOtaRuleResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousOtaRuleResponse setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ContinuousOtaRuleResponse setRequestIndex(Long requestIndex) {
        this.requestIndex = requestIndex;
        return this;
    }
    public Long getRequestIndex() {
        return this.requestIndex;
    }

    public ContinuousOtaRuleResponse setLockVersion(String lockVersion) {
        this.lockVersion = lockVersion;
        return this;
    }
    public String getLockVersion() {
        return this.lockVersion;
    }

    public ContinuousOtaRuleResponse setTriggerModuleName(String triggerModuleName) {
        this.triggerModuleName = triggerModuleName;
        return this;
    }
    public String getTriggerModuleName() {
        return this.triggerModuleName;
    }

    public ContinuousOtaRuleResponse setVersionPredicate(ContinuousOtaVersionPredicate versionPredicate) {
        this.versionPredicate = versionPredicate;
        return this;
    }
    public ContinuousOtaVersionPredicate getVersionPredicate() {
        return this.versionPredicate;
    }

    public ContinuousOtaRuleResponse setPredicateHash(String predicateHash) {
        this.predicateHash = predicateHash;
        return this;
    }
    public String getPredicateHash() {
        return this.predicateHash;
    }

    public ContinuousOtaRuleResponse setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public ContinuousOtaRuleResponse setTargetModuleName(String targetModuleName) {
        this.targetModuleName = targetModuleName;
        return this;
    }
    public String getTargetModuleName() {
        return this.targetModuleName;
    }

    public ContinuousOtaRuleResponse setTargetVersionNo(String targetVersionNo) {
        this.targetVersionNo = targetVersionNo;
        return this;
    }
    public String getTargetVersionNo() {
        return this.targetVersionNo;
    }

    public ContinuousOtaRuleResponse setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public ContinuousOtaRuleResponse setExecutionChannel(String executionChannel) {
        this.executionChannel = executionChannel;
        return this;
    }
    public String getExecutionChannel() {
        return this.executionChannel;
    }

    public ContinuousOtaRuleResponse setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public ContinuousOtaRuleResponse setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
    }

    public ContinuousOtaRuleResponse setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public ContinuousOtaRuleResponse setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

    public ContinuousOtaRuleResponse setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public ContinuousOtaRuleResponse setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public ContinuousOtaRuleResponse setDelayInSeconds(Long delayInSeconds) {
        this.delayInSeconds = delayInSeconds;
        return this;
    }
    public Long getDelayInSeconds() {
        return this.delayInSeconds;
    }

    public ContinuousOtaRuleResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ContinuousOtaRuleResponse setDeviceScopeType(String deviceScopeType) {
        this.deviceScopeType = deviceScopeType;
        return this;
    }
    public String getDeviceScopeType() {
        return this.deviceScopeType;
    }

    public ContinuousOtaRuleResponse setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
        return this;
    }
    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    public ContinuousOtaRuleResponse setCreationSource(String creationSource) {
        this.creationSource = creationSource;
        return this;
    }
    public String getCreationSource() {
        return this.creationSource;
    }

    public ContinuousOtaRuleResponse setCreationSourceDescription(String creationSourceDescription) {
        this.creationSourceDescription = creationSourceDescription;
        return this;
    }
    public String getCreationSourceDescription() {
        return this.creationSourceDescription;
    }

    public ContinuousOtaRuleResponse setCreateRequestId(String createRequestId) {
        this.createRequestId = createRequestId;
        return this;
    }
    public String getCreateRequestId() {
        return this.createRequestId;
    }

}
