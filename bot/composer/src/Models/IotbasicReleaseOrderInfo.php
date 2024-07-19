<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotbasicReleaseOrderInfo extends Model
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

    // 发布批次状态
    // 升级中：IN_PROGRESS
    // 取消中：CANCELING
    // 部分成功：PARTIAL_SUCCESS
    // 部分失败：PARTIAL_FAILED
    // 部分取消：PARTIAL_CANCELED
    // 全部成功：ALL_SUCCESS
    // 全部失败：ALL_FAILED
    // 全部取消：ALL_CANCELED
    /**
     * @example IN_PROGRESS
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

    // 设备升级总数
    /**
     * @example
     *
     * @var int
     */
    public $releaseTotal;

    // 设备升级完成数
    /**
     * @example
     *
     * @var int
     */
    public $releaseFinished;

    // 工单状态变更时间
    /**
     * @example 2024-06-06 11:11:11
     *
     * @var string
     */
    public $statusChangeTime;
    protected $_name = [
        'apkName'          => 'apk_name',
        'apkVersion'       => 'apk_version',
        'orderId'          => 'order_id',
        'orderName'        => 'order_name',
        'status'           => 'status',
        'releaseTime'      => 'release_time',
        'releaseTotal'     => 'release_total',
        'releaseFinished'  => 'release_finished',
        'statusChangeTime' => 'status_change_time',
    ];

    public function validate()
    {
        Model::validateRequired('apkName', $this->apkName, true);
        Model::validateRequired('apkVersion', $this->apkVersion, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderName', $this->orderName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('releaseTime', $this->releaseTime, true);
        Model::validateRequired('releaseTotal', $this->releaseTotal, true);
        Model::validateRequired('releaseFinished', $this->releaseFinished, true);
        Model::validateRequired('statusChangeTime', $this->statusChangeTime, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }
        if (null !== $this->releaseTotal) {
            $res['release_total'] = $this->releaseTotal;
        }
        if (null !== $this->releaseFinished) {
            $res['release_finished'] = $this->releaseFinished;
        }
        if (null !== $this->statusChangeTime) {
            $res['status_change_time'] = $this->statusChangeTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotbasicReleaseOrderInfo
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }
        if (isset($map['release_total'])) {
            $model->releaseTotal = $map['release_total'];
        }
        if (isset($map['release_finished'])) {
            $model->releaseFinished = $map['release_finished'];
        }
        if (isset($map['status_change_time'])) {
            $model->statusChangeTime = $map['status_change_time'];
        }

        return $model;
    }
}
