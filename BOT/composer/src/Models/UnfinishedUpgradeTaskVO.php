<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceIdentity;
use AntChain\BOT\Models\ModuleLocator;

class UnfinishedUpgradeTaskVO extends Model {
    protected $_name = [
        'channel' => 'channel',
        'taskId' => 'task_id',
        'deviceIdentity' => 'device_identity',
        'moduleLocator' => 'module_locator',
        'srcVersion' => 'src_version',
        'destVersion' => 'dest_version',
        'curVersion' => 'cur_version',
        'firmwareId' => 'firmware_id',
        'jobId' => 'job_id',
        'upgradeDesc' => 'upgrade_desc',
        'upgradeMode' => 'upgrade_mode',
        'taskStatus' => 'task_status',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
    ];
    public function validate() {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->deviceIdentity) {
            $res['device_identity'] = null !== $this->deviceIdentity ? $this->deviceIdentity->toMap() : null;
        }
        if (null !== $this->moduleLocator) {
            $res['module_locator'] = null !== $this->moduleLocator ? $this->moduleLocator->toMap() : null;
        }
        if (null !== $this->srcVersion) {
            $res['src_version'] = $this->srcVersion;
        }
        if (null !== $this->destVersion) {
            $res['dest_version'] = $this->destVersion;
        }
        if (null !== $this->curVersion) {
            $res['cur_version'] = $this->curVersion;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->upgradeDesc) {
            $res['upgrade_desc'] = $this->upgradeDesc;
        }
        if (null !== $this->upgradeMode) {
            $res['upgrade_mode'] = $this->upgradeMode;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UnfinishedUpgradeTaskVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['channel'])){
            $model->channel = $map['channel'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['device_identity'])){
            $model->deviceIdentity = DeviceIdentity::fromMap($map['device_identity']);
        }
        if(isset($map['module_locator'])){
            $model->moduleLocator = ModuleLocator::fromMap($map['module_locator']);
        }
        if(isset($map['src_version'])){
            $model->srcVersion = $map['src_version'];
        }
        if(isset($map['dest_version'])){
            $model->destVersion = $map['dest_version'];
        }
        if(isset($map['cur_version'])){
            $model->curVersion = $map['cur_version'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['upgrade_desc'])){
            $model->upgradeDesc = $map['upgrade_desc'];
        }
        if(isset($map['upgrade_mode'])){
            $model->upgradeMode = $map['upgrade_mode'];
        }
        if(isset($map['task_status'])){
            $model->taskStatus = $map['task_status'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        return $model;
    }
    // OTA 任务所属通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
    /**
     * @example TUYA_4G
     * @var string
     */
    public $channel;

    // OTA 任务 ID
    /**
     * @example fc5068e629284b3a8c4424b109583705
     * @var string
     */
    public $taskId;

    // 任务对应的设备展示标识
    /**
     * @example undefined
     * @var DeviceIdentity
     */
    public $deviceIdentity;

    // 任务对应的 OTA 模块定位信息
    /**
     * @example undefined
     * @var ModuleLocator
     */
    public $moduleLocator;

    // 任务源版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $srcVersion;

    // 任务目标版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $destVersion;

    // 设备当前模块版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $curVersion;

    // 固件包 ID
    /**
     * @example 25c3f69752244678a84f663e4d48a56a
     * @var string
     */
    public $firmwareId;

    // OTA 批次 ID
    /**
     * @example 3a1fd361e7984e15afca3450d9b0df8b
     * @var string
     */
    public $jobId;

    // 升级提示文案
    /**
     * @example 升级提示文案
     * @var string
     */
    public $upgradeDesc;

    // 升级模式：CHECK -检测升级 / REMIND - 提醒升级/ FORCE - 强制升级
    /**
     * @example CHECK
     * @var string
     */
    public $upgradeMode;

    // 任务状态：CONFIRM / QUEUED / NOTIFIED / IN_PROGRESS / FAILED / CANCELED 等
    /**
     * @example CONFIRM
     * @var string
     */
    public $taskStatus;

    // 任务创建时间
    /**
     * @example 1782973123964
     * @var string
     */
    public $utcCreate;

    // 任务最后更新时间
    /**
     * @example 1782973123964
     * @var string
     */
    public $utcModified;

}
