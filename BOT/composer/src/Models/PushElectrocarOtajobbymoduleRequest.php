<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushElectrocarOtajobbymoduleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'jobType' => 'job_type',
        'trustProductKey' => 'trust_product_key',
        'firmwareId' => 'firmware_id',
        'targetSelection' => 'target_selection',
        'retryInterval' => 'retry_interval',
        'retryCount' => 'retry_count',
        'timeoutInMinutes' => 'timeout_in_minutes',
        'needConfirm' => 'need_confirm',
        'upgradeCopy' => 'upgrade_copy',
        'channel' => 'channel',
        'overrideMode' => 'override_mode',
        'multiModuleMode' => 'multi_module_mode',
        'upgradeMode' => 'upgrade_mode',
        'needPush' => 'need_push',
        'moduleName' => 'module_name',
        'version' => 'version',
    ];
    public function validate() {
        Model::validateRequired('jobType', $this->jobType, true);
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
        Model::validateRequired('firmwareId', $this->firmwareId, true);
        Model::validateRequired('targetSelection', $this->targetSelection, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('moduleName', $this->moduleName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->jobType) {
            $res['job_type'] = $this->jobType;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->targetSelection) {
            $res['target_selection'] = $this->targetSelection;
        }
        if (null !== $this->retryInterval) {
            $res['retry_interval'] = $this->retryInterval;
        }
        if (null !== $this->retryCount) {
            $res['retry_count'] = $this->retryCount;
        }
        if (null !== $this->timeoutInMinutes) {
            $res['timeout_in_minutes'] = $this->timeoutInMinutes;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }
        if (null !== $this->upgradeCopy) {
            $res['upgrade_copy'] = $this->upgradeCopy;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->overrideMode) {
            $res['override_mode'] = $this->overrideMode;
        }
        if (null !== $this->multiModuleMode) {
            $res['multi_module_mode'] = $this->multiModuleMode;
        }
        if (null !== $this->upgradeMode) {
            $res['upgrade_mode'] = $this->upgradeMode;
        }
        if (null !== $this->needPush) {
            $res['need_push'] = $this->needPush;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushElectrocarOtajobbymoduleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['job_type'])){
            $model->jobType = $map['job_type'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['target_selection'])){
            $model->targetSelection = $map['target_selection'];
        }
        if(isset($map['retry_interval'])){
            $model->retryInterval = $map['retry_interval'];
        }
        if(isset($map['retry_count'])){
            $model->retryCount = $map['retry_count'];
        }
        if(isset($map['timeout_in_minutes'])){
            $model->timeoutInMinutes = $map['timeout_in_minutes'];
        }
        if(isset($map['need_confirm'])){
            $model->needConfirm = $map['need_confirm'];
        }
        if(isset($map['upgrade_copy'])){
            $model->upgradeCopy = $map['upgrade_copy'];
        }
        if(isset($map['channel'])){
            $model->channel = $map['channel'];
        }
        if(isset($map['override_mode'])){
            $model->overrideMode = $map['override_mode'];
        }
        if(isset($map['multi_module_mode'])){
            $model->multiModuleMode = $map['multi_module_mode'];
        }
        if(isset($map['upgrade_mode'])){
            $model->upgradeMode = $map['upgrade_mode'];
        }
        if(isset($map['need_push'])){
            $model->needPush = $map['need_push'];
        }
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 任务类型：默认STATIC_UPGRADE
    /**
     * @var string
     */
    public $jobType;

    // 可信物联产品唯一标识
    /**
     * @var string
     */
    public $trustProductKey;

    // OTA固件包ID
    /**
     * @var string
     */
    public $firmwareId;

    // 升级范围：默认SPECIFIC，不支持其他
    /**
     * @var string
     */
    public $targetSelection;

    // 升级失败后自动重试间隔：0：立即重试、10：10分钟后重试、30：30分钟后重试、60：60分钟（即1小时）后重试、1440：1,440分钟（即24小时）后重试。不传入此参数，则表示不重试。
    /**
     * @var int
     */
    public $retryInterval;

    // 自动重试次数：1：1次、2：2次、5：5次。如果传入RetryInterval参数，则需传入该参数。
    /**
     * @var int
     */
    public $retryCount;

    // 升级超时时间
    /**
     * @var int
     */
    public $timeoutInMinutes;

    // 是否需要 APP 确认升级：TUYA_4G 通道：true 表示批次创建后等待 APP/端侧确认，再触发 Hub 下发；false 表示不需要 APP 确认。若 upgradeMode=SILENT，该字段固定为 false，调用方无需传入。BLE 通道：服务端默认按 APP 确认拉取升级材料处理。
    /**
     * @var bool
     */
    public $needConfirm;

    // 升级文案
    /**
     * @var string
     */
    public $upgradeCopy;

    // 本次批次实际执行通道：TUYA_4G：涂鸦 4G/MQTT 通道；EKYT_BLE：数字钥匙 BLE 通道；IOT_AGENT_BLE：AI 硬件 BLE 通道；
    /**
     * @var string
     */
    public $channel;

    // 同设备同模块任务覆盖策略：OVERRIDE：覆盖旧任务创建新任务前取消同设备同模块可取消的旧任务；REJECT：存在可取消旧任务时拒绝创建；COEXIST：允许并存的预留策略，本期同模块 APP 确认型升级不推荐使用。不传时默认 OVERRIDE。
    /**
     * @var string
     */
    public $overrideMode;

    // 多模块并发策略：ALLOW：允许同一设备多个模块同时存在未完成升级任务；DENY：同一设备已有其他模块未完成升级任务时拒绝创建。不传时默认 ALLOW。
    /**
     * @var string
     */
    public $multiModuleMode;

    // 批次升级方式：CHECK：检测升级，只在用户主动检查升级入口展示；REMIND：提醒升级，进入待确认列表并可提示用户升级；FORCE：强制升级，APP 侧应展示强提示或不可跳过交互；SILENT：静默升级，仅后台 4G 通道可用，不进入 APP 待确认列表。
    /**
     * @var string
     */
    public $upgradeMode;

    // 4G Hub 是否主动推送。TUYA_4G 通道：true 表示批次创建后由 Hub 主动向设备推送；false 表示不主动推送，通常需要配合 needConfirm=true 由 APP 确认后触发。若 upgradeMode=SILENT，该字段固定为 true，调用方无需传入。BLE 通道：不支持服务端主动推送；传 true 会被拒绝。
    /**
     * @var bool
     */
    public $needPush;

    // 用于筛选目标设备的模块名称；
    /**
     * @var string
     */
    public $moduleName;

    // 用于筛选目标设备的模块版本；不传时仅按模块名称筛选。
    /**
     * @var string
     */
    public $version;

}
