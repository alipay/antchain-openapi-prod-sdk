// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushElectrocarOtajobbymoduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务类型：默认STATIC_UPGRADE
    @NameInMap("job_type")
    @Validation(required = true)
    public String jobType;

    // 可信物联产品唯一标识
    @NameInMap("trust_product_key")
    @Validation(required = true)
    public String trustProductKey;

    // OTA固件包ID
    @NameInMap("firmware_id")
    @Validation(required = true)
    public String firmwareId;

    // 升级范围：默认SPECIFIC，不支持其他
    @NameInMap("target_selection")
    @Validation(required = true)
    public String targetSelection;

    // 升级失败后自动重试间隔：0：立即重试、10：10分钟后重试、30：30分钟后重试、60：60分钟（即1小时）后重试、1440：1,440分钟（即24小时）后重试。不传入此参数，则表示不重试。
    @NameInMap("retry_interval")
    public Long retryInterval;

    // 自动重试次数：1：1次、2：2次、5：5次。如果传入RetryInterval参数，则需传入该参数。
    @NameInMap("retry_count")
    public Long retryCount;

    // 升级超时时间
    @NameInMap("timeout_in_minutes")
    public Long timeoutInMinutes;

    // 是否需要 APP 确认升级：TUYA_4G 通道：true 表示批次创建后等待 APP/端侧确认，再触发 Hub 下发；false 表示不需要 APP 确认。若 upgradeMode=SILENT，该字段固定为 false，调用方无需传入。BLE 通道：服务端默认按 APP 确认拉取升级材料处理。
    @NameInMap("need_confirm")
    public Boolean needConfirm;

    // 升级文案
    @NameInMap("upgrade_copy")
    public String upgradeCopy;

    // 本次批次实际执行通道：TUYA_4G：涂鸦 4G/MQTT 通道；EKYT_BLE：数字钥匙 BLE 通道；IOT_AGENT_BLE：AI 硬件 BLE 通道；
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 同设备同模块任务覆盖策略：OVERRIDE：覆盖旧任务创建新任务前取消同设备同模块可取消的旧任务；REJECT：存在可取消旧任务时拒绝创建；COEXIST：允许并存的预留策略，本期同模块 APP 确认型升级不推荐使用。不传时默认 OVERRIDE。
    @NameInMap("override_mode")
    public String overrideMode;

    // 多模块并发策略：ALLOW：允许同一设备多个模块同时存在未完成升级任务；DENY：同一设备已有其他模块未完成升级任务时拒绝创建。不传时默认 ALLOW。
    @NameInMap("multi_module_mode")
    public String multiModuleMode;

    // 批次升级方式：CHECK：检测升级，只在用户主动检查升级入口展示；REMIND：提醒升级，进入待确认列表并可提示用户升级；FORCE：强制升级，APP 侧应展示强提示或不可跳过交互；SILENT：静默升级，仅后台 4G 通道可用，不进入 APP 待确认列表。
    @NameInMap("upgrade_mode")
    public String upgradeMode;

    // 4G Hub 是否主动推送。TUYA_4G 通道：true 表示批次创建后由 Hub 主动向设备推送；false 表示不主动推送，通常需要配合 needConfirm=true 由 APP 确认后触发。若 upgradeMode=SILENT，该字段固定为 true，调用方无需传入。BLE 通道：不支持服务端主动推送；传 true 会被拒绝。
    @NameInMap("need_push")
    public Boolean needPush;

    // 用于筛选目标设备的模块名称；
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    // 用于筛选目标设备的模块版本；不传时仅按模块名称筛选。
    @NameInMap("version")
    public String version;

    public static PushElectrocarOtajobbymoduleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushElectrocarOtajobbymoduleRequest self = new PushElectrocarOtajobbymoduleRequest();
        return TeaModel.build(map, self);
    }

    public PushElectrocarOtajobbymoduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushElectrocarOtajobbymoduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushElectrocarOtajobbymoduleRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public PushElectrocarOtajobbymoduleRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public PushElectrocarOtajobbymoduleRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public PushElectrocarOtajobbymoduleRequest setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public PushElectrocarOtajobbymoduleRequest setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public PushElectrocarOtajobbymoduleRequest setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

    public PushElectrocarOtajobbymoduleRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public PushElectrocarOtajobbymoduleRequest setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public PushElectrocarOtajobbymoduleRequest setUpgradeCopy(String upgradeCopy) {
        this.upgradeCopy = upgradeCopy;
        return this;
    }
    public String getUpgradeCopy() {
        return this.upgradeCopy;
    }

    public PushElectrocarOtajobbymoduleRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public PushElectrocarOtajobbymoduleRequest setOverrideMode(String overrideMode) {
        this.overrideMode = overrideMode;
        return this;
    }
    public String getOverrideMode() {
        return this.overrideMode;
    }

    public PushElectrocarOtajobbymoduleRequest setMultiModuleMode(String multiModuleMode) {
        this.multiModuleMode = multiModuleMode;
        return this;
    }
    public String getMultiModuleMode() {
        return this.multiModuleMode;
    }

    public PushElectrocarOtajobbymoduleRequest setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public PushElectrocarOtajobbymoduleRequest setNeedPush(Boolean needPush) {
        this.needPush = needPush;
        return this;
    }
    public Boolean getNeedPush() {
        return this.needPush;
    }

    public PushElectrocarOtajobbymoduleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public PushElectrocarOtajobbymoduleRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
