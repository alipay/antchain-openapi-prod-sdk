<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIotlinkAppreleasedeviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 应用名称
    /**
     * @var string
     */
    public $apkName;

    // 应用版本号
    /**
     * @var string
     */
    public $apkVersion;

    // 工单id
    /**
     * @var string
     */
    public $orderId;

    // 设备sn
    /**
     * @var string
     */
    public $deviceSn;

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
     * @var string
     */
    public $status;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apkName'           => 'apk_name',
        'apkVersion'        => 'apk_version',
        'orderId'           => 'order_id',
        'deviceSn'          => 'device_sn',
        'status'            => 'status',
        'current'           => 'current',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->apkName) {
            $res['apk_name'] = $this->apkName;
        }
        if (null !== $this->apkVersion) {
            $res['apk_version'] = $this->apkVersion;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIotlinkAppreleasedeviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['apk_name'])) {
            $model->apkName = $map['apk_name'];
        }
        if (isset($map['apk_version'])) {
            $model->apkVersion = $map['apk_version'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
