<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxOTAJobResponse extends Model {
    protected $_name = [
        'jobId' => 'job_id',
        'jobStatus' => 'job_status',
        'jobType' => 'job_type',
        'trustOroductKey' => 'trust_oroduct_key',
        'firmwareId' => 'firmware_id',
        'destVersion' => 'dest_version',
        'downloadProtocol' => 'download_protocol',
        'jobDesc' => 'job_desc',
        'selectionType' => 'selection_type',
        'targetSelection' => 'target_selection',
        'srcVersion' => 'src_version',
        'retryInterval' => 'retry_interval',
        'retryCount' => 'retry_count',
        'timeoutInMinutes' => 'timeout_in_minutes',
        'targetDeviceName' => 'target_device_name',
        'needConfirm' => 'need_confirm',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'channel' => 'channel',
        'overrideMode' => 'override_mode',
        'multiModuleMode' => 'multi_module_mode',
        'upgradeMode' => 'upgrade_mode',
    ];
    public function validate() {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->jobStatus) {
            $res['job_status'] = $this->jobStatus;
        }
        if (null !== $this->jobType) {
            $res['job_type'] = $this->jobType;
        }
        if (null !== $this->trustOroductKey) {
            $res['trust_oroduct_key'] = $this->trustOroductKey;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->destVersion) {
            $res['dest_version'] = $this->destVersion;
        }
        if (null !== $this->downloadProtocol) {
            $res['download_protocol'] = $this->downloadProtocol;
        }
        if (null !== $this->jobDesc) {
            $res['job_desc'] = $this->jobDesc;
        }
        if (null !== $this->selectionType) {
            $res['selection_type'] = $this->selectionType;
        }
        if (null !== $this->targetSelection) {
            $res['target_selection'] = $this->targetSelection;
        }
        if (null !== $this->srcVersion) {
            $res['src_version'] = $this->srcVersion;
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
        if (null !== $this->targetDeviceName) {
            $res['target_device_name'] = $this->targetDeviceName;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
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
        return $res;
    }
    /**
     * @param array $map
     * @return IotxOTAJobResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['job_status'])){
            $model->jobStatus = $map['job_status'];
        }
        if(isset($map['job_type'])){
            $model->jobType = $map['job_type'];
        }
        if(isset($map['trust_oroduct_key'])){
            $model->trustOroductKey = $map['trust_oroduct_key'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['dest_version'])){
            $model->destVersion = $map['dest_version'];
        }
        if(isset($map['download_protocol'])){
            $model->downloadProtocol = $map['download_protocol'];
        }
        if(isset($map['job_desc'])){
            $model->jobDesc = $map['job_desc'];
        }
        if(isset($map['selection_type'])){
            $model->selectionType = $map['selection_type'];
        }
        if(isset($map['target_selection'])){
            $model->targetSelection = $map['target_selection'];
        }
        if(isset($map['src_version'])){
            if(!empty($map['src_version'])){
                $model->srcVersion = $map['src_version'];
            }
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
        if(isset($map['target_device_name'])){
            if(!empty($map['target_device_name'])){
                $model->targetDeviceName = $map['target_device_name'];
            }
        }
        if(isset($map['need_confirm'])){
            $model->needConfirm = $map['need_confirm'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
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
        return $model;
    }
    // 批次id
    /**
     * @example 2c692f39bbaf43b08590d6daede5895f
     * @var string
     */
    public $jobId;

    // 任务状态：PLANNED：计划中；IN_PROGRESS：执行中；COMPLETED：已完成；CANCELED：已取消；
    /**
     * @example PLANNED
     * @var string
     */
    public $jobStatus;

    // 任务类型：VERIFY：升级包验证批次。 STATIC_UPGRADE：批量升级批次。
    /**
     * @example STATIC_UPGRADE
     * @var string
     */
    public $jobType;

    // 产品唯一标识
    /**
     * @example FuPsO4bwFbyLSrQIiL
     * @var string
     */
    public $trustOroductKey;

    // OTA固件包ID
    /**
     * @example 563785f86a6144e2838b3bd1f077f652
     * @var string
     */
    public $firmwareId;

    // 升级目标版本号
    /**
     * @example 1.0.0
     * @var string
     */
    public $destVersion;

    // 下载协议
    /**
     * @example -
     * @var string
     */
    public $downloadProtocol;

    // 升级批次描述
    /**
     * @example 升级批次描述
     * @var string
     */
    public $jobDesc;

    // 升级策略：VERIFY、STATIC
    /**
     * @example STATIC
     * @var string
     */
    public $selectionType;

    // 升级范围 ALL：全量升级、SPECIFIC：定向升级
    /**
     * @example ALL
     * @var string
     */
    public $targetSelection;

    // 待升级版本号列表
    /**
     * @example 
     * @var string[]
     */
    public $srcVersion;

    // 升级失败后自动重试间隔：0：立即重试、10：10分钟后重试、30：30分钟后重试、60：60分钟（即1小时）后重试、1440：1,440分钟（即24小时）后重试。不传入此参数，则表示不重试。
    /**
     * @example 10
     * @var int
     */
    public $retryInterval;

    // 自动重试次数：1：1次、2：2次、5：5次。如果传入RetryInterval参数，则需传入该参数
    /**
     * @example 1
     * @var int
     */
    public $retryCount;

    // 升级超时时间：0-1440
    /**
     * @example 10
     * @var int
     */
    public $timeoutInMinutes;

    // 定向升级的设备名称列表
    /**
     * @example undefined
     * @var string[]
     */
    public $targetDeviceName;

    // 是否需App确认升级
    /**
     * @example true
     * @var bool
     */
    public $needConfirm;

    // 创建时间
    /**
     * @example 1783948258716
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 1783948258716
     * @var string
     */
    public $gmtModified;

    // 批次实际执行通道：TUYA_4G、EKYT_BLE
    /**
     * @example TUYA_4G
     * @var string
     */
    public $channel;

    // 同设备同模块覆盖策略
    /**
     * @example OVERRIDE
     * @var string
     */
    public $overrideMode;

    // 多模块并发策略
    /**
     * @example ALLOW
     * @var string
     */
    public $multiModuleMode;

    // 批次升级方式
    /**
     * @example REMIND
     * @var string
     */
    public $upgradeMode;

}
