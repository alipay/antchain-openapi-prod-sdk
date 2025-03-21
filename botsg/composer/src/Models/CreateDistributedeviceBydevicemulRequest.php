<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTSG\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributedeviceBydevicemulRequest extends Model
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

    // 场景码，由蚂蚁侧定义
    /**
     * @var string
     */
    public $scene;

    // 设备注册信息集合, 数组长度不超过50
    /**
     * @var RegByDeviceParm[]
     */
    public $deviceParamList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'deviceParamList'   => 'device_param_list',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceParamList', $this->deviceParamList, true);
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
        if (null !== $this->deviceParamList) {
            $res['device_param_list'] = [];
            if (null !== $this->deviceParamList && \is_array($this->deviceParamList)) {
                $n = 0;
                foreach ($this->deviceParamList as $item) {
                    $res['device_param_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributedeviceBydevicemulRequest
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
        if (isset($map['device_param_list'])) {
            if (!empty($map['device_param_list'])) {
                $model->deviceParamList = [];
                $n                      = 0;
                foreach ($map['device_param_list'] as $item) {
                    $model->deviceParamList[$n++] = null !== $item ? RegByDeviceParm::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
