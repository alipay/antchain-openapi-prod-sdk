<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicReleaseDeviceInfo extends Model
{
    // 应用名称
    /**
     * @example 应用名称
     *
     * @var string
     */
    public $apkName;

    // 应用版本号
    /**
     * @example apkVersion
     *
     * @var string
     */
    public $apkVersion;

    // 工单id
    /**
     * @example orderId
     *
     * @var string
     */
    public $orderId;

    // 工单名称
    /**
     * @example orderName
     *
     * @var string
     */
    public $orderName;

    // 任务id
    /**
     * @example taskId
     *
     * @var string
     */
    public $taskId;

    // 设备升级任务唯一id
    /**
     * @example orderDetailId
     *
     * @var string
     */
    public $orderDetailId;

    // 设备sn
    /**
     * @example deviceSn
     *
     * @var string
     */
    public $deviceSn;

    // 设备id
    /**
     * @example deviceId
     *
     * @var string
     */
    public $deviceId;

    // 设备升级状态
    // 待确认：CONFIRM
    // 待推送：QUEUED
    // 已推送：NOTIFIED
    // 升级中：IN_PROGRESS
    // 升级成功：SUCCEEDED
    // 升级失败：FAILED
    // 已取消：CANCELED
    // 升级超时：TIMEOUT
    /**
     * @example QUEUED
     *
     * @var string
     */
    public $status;

    // 发布时间
    /**
     * @example 2024-06-06 11:11:11
     *
     * @var string
     */
    public $releaseTime;

    // 升级完成时间
    /**
     * @example 2024-06-06 11:11:11
     *
     * @var string
     */
    public $upgradeTime;
    protected $_name = [
        'apkName'       => 'apk_name',
        'apkVersion'    => 'apk_version',
        'orderId'       => 'order_id',
        'orderName'     => 'order_name',
        'taskId'        => 'task_id',
        'orderDetailId' => 'order_detail_id',
        'deviceSn'      => 'device_sn',
        'deviceId'      => 'device_id',
        'status'        => 'status',
        'releaseTime'   => 'release_time',
        'upgradeTime'   => 'upgrade_time',
    ];

    public function validate()
    {
        Model::validateRequired('apkName', $this->apkName, true);
        Model::validateRequired('apkVersion', $this->apkVersion, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderName', $this->orderName, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('orderDetailId', $this->orderDetailId, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apkName) {
            $res['apk_name'] = $this->apkName;
        }
        if (null !== $this->apkVersion) {
            $res['apk_version'] = $this->apkVersion;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderName) {
            $res['order_name'] = $this->orderName;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->orderDetailId) {
            $res['order_detail_id'] = $this->orderDetailId;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }
        if (null !== $this->upgradeTime) {
            $res['upgrade_time'] = $this->upgradeTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicReleaseDeviceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apk_name'])) {
            $model->apkName = $map['apk_name'];
        }
        if (isset($map['apk_version'])) {
            $model->apkVersion = $map['apk_version'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_name'])) {
            $model->orderName = $map['order_name'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['order_detail_id'])) {
            $model->orderDetailId = $map['order_detail_id'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }
        if (isset($map['upgrade_time'])) {
            $model->upgradeTime = $map['upgrade_time'];
        }

        return $model;
    }
}
