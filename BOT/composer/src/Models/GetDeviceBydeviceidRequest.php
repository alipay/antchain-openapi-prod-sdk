<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetDeviceBydeviceidRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 设备id列表（推荐使用该参数，deviceIdList不为空时，componentIdList不用填）
    /**
     * @var string[]
     */
    public $deviceIdList;

    // 模组ID(IMEI/SN/MAC)列表，当没有设备id时，可以用该字段查询设备
    /**
     * @var string[]
     */
    public $componentIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'deviceIdList'      => 'device_id_list',
        'componentIdList'   => 'component_id_list',
    ];

    public function validate()
    {
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceIdList) {
            $res['device_id_list'] = $this->deviceIdList;
        }
        if (null !== $this->componentIdList) {
            $res['component_id_list'] = $this->componentIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDeviceBydeviceidRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_id_list'])) {
            if (!empty($map['device_id_list'])) {
                $model->deviceIdList = $map['device_id_list'];
            }
        }
        if (isset($map['component_id_list'])) {
            if (!empty($map['component_id_list'])) {
                $model->componentIdList = $map['component_id_list'];
            }
        }

        return $model;
    }
}
