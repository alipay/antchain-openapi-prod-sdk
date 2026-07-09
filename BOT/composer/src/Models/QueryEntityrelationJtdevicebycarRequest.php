<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryEntityrelationJtdevicebycarRequest extends Model
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

    // 车辆ID： 车辆车牌颜色+车牌号
    /**
     * @var string
     */
    public $deviceId;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 标识设别来源：分为SERVER(服务端)、JT808(部标机设备等)
    /**
     * @var string
     */
    public $fromType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'scene'             => 'scene',
        'fromType'          => 'from_type',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('scene', $this->scene, true);
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
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->fromType) {
            $res['from_type'] = $this->fromType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEntityrelationJtdevicebycarRequest
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
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['from_type'])) {
            $model->fromType = $map['from_type'];
        }

        return $model;
    }
}
