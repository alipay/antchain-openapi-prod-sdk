<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryXrCustomerdeviceRequest extends Model
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

    // 设备sn
    /**
     * @var string
     */
    public $deviceSn;

    // 服务状态
    /**
     * @var string
     */
    public $serviceStatus;

    // 设备状态
    /**
     * @var string
     */
    public $deviceStatus;

    // 设备品类-型号-规格
    /**
     * @var string
     */
    public $deviceType;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 每页数据
    /**
     * @var int
     */
    public $pageSize;

    // 业务类型
    /**
     * @var string
     */
    public $bizScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceSn'          => 'device_sn',
        'serviceStatus'     => 'service_status',
        'deviceStatus'      => 'device_status',
        'deviceType'        => 'device_type',
        'current'           => 'current',
        'pageSize'          => 'page_size',
        'bizScene'          => 'biz_scene',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
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
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->serviceStatus) {
            $res['service_status'] = $this->serviceStatus;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryXrCustomerdeviceRequest
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
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['service_status'])) {
            $model->serviceStatus = $map['service_status'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }

        return $model;
    }
}
