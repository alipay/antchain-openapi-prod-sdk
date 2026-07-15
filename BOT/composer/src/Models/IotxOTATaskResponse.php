<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxOTATaskResponse extends Model {
    protected $_name = [
        'taskId' => 'task_id',
        'deviceName' => 'device_name',
        'jobId' => 'job_id',
        'firmwareId' => 'firmware_id',
        'trustProductKey' => 'trust_product_key',
        'productName' => 'product_name',
        'srcVersion' => 'src_version',
        'destVersion' => 'dest_version',
        'taskStatus' => 'task_status',
        'progress' => 'progress',
        'taskDesc' => 'task_desc',
        'timeout' => 'timeout',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
    ];
    public function validate() {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->srcVersion) {
            $res['src_version'] = $this->srcVersion;
        }
        if (null !== $this->destVersion) {
            $res['dest_version'] = $this->destVersion;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->progress) {
            $res['progress'] = $this->progress;
        }
        if (null !== $this->taskDesc) {
            $res['task_desc'] = $this->taskDesc;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
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
     * @return IotxOTATaskResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['device_name'])){
            $model->deviceName = $map['device_name'];
        }
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['src_version'])){
            $model->srcVersion = $map['src_version'];
        }
        if(isset($map['dest_version'])){
            $model->destVersion = $map['dest_version'];
        }
        if(isset($map['task_status'])){
            $model->taskStatus = $map['task_status'];
        }
        if(isset($map['progress'])){
            $model->progress = $map['progress'];
        }
        if(isset($map['task_desc'])){
            $model->taskDesc = $map['task_desc'];
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        return $model;
    }
    // 任务ID
    /**
     * @example 785c56486ff14f72aa53c0aff20b1760
     * @var string
     */
    public $taskId;

    // 设备名称
    /**
     * @example FF9999995FF10202603252F71EC54393
     * @var string
     */
    public $deviceName;

    // OTA批次ID
    /**
     * @example cef4fc962ee7456985d011d30d3f448f
     * @var string
     */
    public $jobId;

    // 固件ID
    /**
     * @example 84a1f449422946d2a4e87c1c23503f6b
     * @var string
     */
    public $firmwareId;

    // 可信物联唯一产品标识
    /**
     * @example A7njznJkBrCCDdeIKl
     * @var string
     */
    public $trustProductKey;

    // 产品名称
    /**
     * @example 产品名称
     * @var string
     */
    public $productName;

    // 源版本
    /**
     * @example -
     * @var string
     */
    public $srcVersion;

    // 目标版本
    /**
     * @example 1.0.0
     * @var string
     */
    public $destVersion;

    // 任务状态：CONFIRM, QUEUED, NOTIFIED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
    /**
     * @example CONFIRM
     * @var string
     */
    public $taskStatus;

    // 升级进度
    /**
     * @example 10
     * @var string
     */
    public $progress;

    // 任务描述
    /**
     * @example 任务描述
     * @var string
     */
    public $taskDesc;

    // 超时时间
    /**
     * @example 10
     * @var string
     */
    public $timeout;

    // 创建时间
    /**
     * @example 1783948258774
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 1783948258774
     * @var string
     */
    public $utcModified;

}
