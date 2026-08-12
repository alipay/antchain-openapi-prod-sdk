<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\ContinuousOtaVersionPredicate;

class ContinuousOtaOpenApiRuleResponse extends Model {
    protected $_name = [
        'ruleId' => 'rule_id',
        'requestIndex' => 'request_index',
        'lockVersion' => 'lock_version',
        'triggerModuleName' => 'trigger_module_name',
        'versionPredicate' => 'version_predicate',
        'predicateHash' => 'predicate_hash',
        'firmwareId' => 'firmware_id',
        'targetModuleName' => 'target_module_name',
        'targetVersionNo' => 'target_version_no',
        'targetSelection' => 'target_selection',
        'executionChannel' => 'execution_channel',
        'upgradeMode' => 'upgrade_mode',
        'needPush' => 'need_push',
        'needConfirm' => 'need_confirm',
        'retryCount' => 'retry_count',
        'retryInterval' => 'retry_interval',
        'timeoutInMinutes' => 'timeout_in_minutes',
        'delayInSeconds' => 'delay_in_seconds',
        'enabled' => 'enabled',
        'deviceScopeType' => 'device_scope_type',
        'lifecycleStatus' => 'lifecycle_status',
        'creationSource' => 'creation_source',
        'creationSourceDescription' => 'creation_source_description',
        'createRequestId' => 'create_request_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->requestIndex) {
            $res['request_index'] = $this->requestIndex;
        }
        if (null !== $this->lockVersion) {
            $res['lock_version'] = $this->lockVersion;
        }
        if (null !== $this->triggerModuleName) {
            $res['trigger_module_name'] = $this->triggerModuleName;
        }
        if (null !== $this->versionPredicate) {
            $res['version_predicate'] = null !== $this->versionPredicate ? $this->versionPredicate->toMap() : null;
        }
        if (null !== $this->predicateHash) {
            $res['predicate_hash'] = $this->predicateHash;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->targetModuleName) {
            $res['target_module_name'] = $this->targetModuleName;
        }
        if (null !== $this->targetVersionNo) {
            $res['target_version_no'] = $this->targetVersionNo;
        }
        if (null !== $this->targetSelection) {
            $res['target_selection'] = $this->targetSelection;
        }
        if (null !== $this->executionChannel) {
            $res['execution_channel'] = $this->executionChannel;
        }
        if (null !== $this->upgradeMode) {
            $res['upgrade_mode'] = $this->upgradeMode;
        }
        if (null !== $this->needPush) {
            $res['need_push'] = $this->needPush;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }
        if (null !== $this->retryCount) {
            $res['retry_count'] = $this->retryCount;
        }
        if (null !== $this->retryInterval) {
            $res['retry_interval'] = $this->retryInterval;
        }
        if (null !== $this->timeoutInMinutes) {
            $res['timeout_in_minutes'] = $this->timeoutInMinutes;
        }
        if (null !== $this->delayInSeconds) {
            $res['delay_in_seconds'] = $this->delayInSeconds;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->deviceScopeType) {
            $res['device_scope_type'] = $this->deviceScopeType;
        }
        if (null !== $this->lifecycleStatus) {
            $res['lifecycle_status'] = $this->lifecycleStatus;
        }
        if (null !== $this->creationSource) {
            $res['creation_source'] = $this->creationSource;
        }
        if (null !== $this->creationSourceDescription) {
            $res['creation_source_description'] = $this->creationSourceDescription;
        }
        if (null !== $this->createRequestId) {
            $res['create_request_id'] = $this->createRequestId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContinuousOtaOpenApiRuleResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['rule_id'])){
            $model->ruleId = $map['rule_id'];
        }
        if(isset($map['request_index'])){
            $model->requestIndex = $map['request_index'];
        }
        if(isset($map['lock_version'])){
            $model->lockVersion = $map['lock_version'];
        }
        if(isset($map['trigger_module_name'])){
            $model->triggerModuleName = $map['trigger_module_name'];
        }
        if(isset($map['version_predicate'])){
            $model->versionPredicate = ContinuousOtaVersionPredicate::fromMap($map['version_predicate']);
        }
        if(isset($map['predicate_hash'])){
            $model->predicateHash = $map['predicate_hash'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['target_module_name'])){
            $model->targetModuleName = $map['target_module_name'];
        }
        if(isset($map['target_version_no'])){
            $model->targetVersionNo = $map['target_version_no'];
        }
        if(isset($map['target_selection'])){
            $model->targetSelection = $map['target_selection'];
        }
        if(isset($map['execution_channel'])){
            $model->executionChannel = $map['execution_channel'];
        }
        if(isset($map['upgrade_mode'])){
            $model->upgradeMode = $map['upgrade_mode'];
        }
        if(isset($map['need_push'])){
            $model->needPush = $map['need_push'];
        }
        if(isset($map['need_confirm'])){
            $model->needConfirm = $map['need_confirm'];
        }
        if(isset($map['retry_count'])){
            $model->retryCount = $map['retry_count'];
        }
        if(isset($map['retry_interval'])){
            $model->retryInterval = $map['retry_interval'];
        }
        if(isset($map['timeout_in_minutes'])){
            $model->timeoutInMinutes = $map['timeout_in_minutes'];
        }
        if(isset($map['delay_in_seconds'])){
            $model->delayInSeconds = $map['delay_in_seconds'];
        }
        if(isset($map['enabled'])){
            $model->enabled = $map['enabled'];
        }
        if(isset($map['device_scope_type'])){
            $model->deviceScopeType = $map['device_scope_type'];
        }
        if(isset($map['lifecycle_status'])){
            $model->lifecycleStatus = $map['lifecycle_status'];
        }
        if(isset($map['creation_source'])){
            $model->creationSource = $map['creation_source'];
        }
        if(isset($map['creation_source_description'])){
            $model->creationSourceDescription = $map['creation_source_description'];
        }
        if(isset($map['create_request_id'])){
            $model->createRequestId = $map['create_request_id'];
        }
        return $model;
    }
    // 规则 ID
    /**
     * @example 735103937447464960
     * @var string
     */
    public $ruleId;

    // 规则在请求列表中的位置
    /**
     * @example 规则在请求列表中的位置
     * @var string
     */
    public $requestIndex;

    // 规则乐观锁版本号
    /**
     * @example 规则乐观锁版本号
     * @var string
     */
    public $lockVersion;

    // 触发连续推送规则的设备上报模块名
    /**
     * @example BLE
     * @var string
     */
    public $triggerModuleName;

    // 结构化版本谓词
    /**
     * @example undefined
     * @var ContinuousOtaVersionPredicate
     */
    public $versionPredicate;

    // 服务端规范化版本谓词后生成的摘要
    /**
     * @example 服务端规范化版本谓词后生成的摘要
     * @var string
     */
    public $predicateHash;

    // 规则命中后需要升级的目标固件 ID
    /**
     * @example 规则命中后需要升级的目标固件 ID
     * @var string
     */
    public $firmwareId;

    // 目标固件模块名
    /**
     * @example 目标固件模块名
     * @var string
     */
    public $targetModuleName;

    // 目标固件版本号
    /**
     * @example 目标固件版本号
     * @var string
     */
    public $targetVersionNo;

    // 目标设备选择类型
    /**
     * @example 目标设备选择类型
     * @var string
     */
    public $targetSelection;

    // 规则执行通道
    /**
     * @example 规则执行通道
     * @var string
     */
    public $executionChannel;

    // OTA 升级模式
    /**
     * @example OTA 升级模式
     * @var string
     */
    public $upgradeMode;

    // 是否主动推送升级
    /**
     * @example 是否主动推送升级
     * @var bool
     */
    public $needPush;

    // 是否需要设备确认
    /**
     * @example 是否需要设备确认
     * @var bool
     */
    public $needConfirm;

    // 失败重试次数
    /**
     * @example 失败重试次数
     * @var string
     */
    public $retryCount;

    // 重试间隔
    /**
     * @example 重试间隔
     * @var string
     */
    public $retryInterval;

    // 单次升级超时时间
    /**
     * @example 单次升级超时时间
     * @var string
     */
    public $timeoutInMinutes;

    // 规则命中后的延迟执行时间
    /**
     * @example 规则命中后的延迟执行时间
     * @var string
     */
    public $delayInSeconds;

    // 规则是否启用
    /**
     * @example 规则是否启用
     * @var bool
     */
    public $enabled;

    // 规则设备范围
    /**
     * @example 规则设备范围
     * @var string
     */
    public $deviceScopeType;

    // 规则生命周期状态
    /**
     * @example 规则生命周期状态
     * @var string
     */
    public $lifecycleStatus;

    // 规则创建来源
    /**
     * @example 规则创建来源
     * @var string
     */
    public $creationSource;

    // 规则创建来源说明
    /**
     * @example 规则创建来源说明
     * @var string
     */
    public $creationSourceDescription;

    // 自动建批接口的幂等请求号
    /**
     * @example 自动建批接口的幂等请求号
     * @var string
     */
    public $createRequestId;

}
