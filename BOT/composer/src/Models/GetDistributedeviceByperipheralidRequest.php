<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetDistributedeviceByperipheralidRequest extends Model
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

    // 外围设备Id数组
    /**
     * @var string[]
     */
    public $peripheralIdList;

    // 场景码
    /**
     * @var string
     */
    public $scene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'peripheralIdList'  => 'peripheral_id_list',
        'scene'             => 'scene',
    ];

    public function validate()
    {
        Model::validateRequired('peripheralIdList', $this->peripheralIdList, true);
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
        if (null !== $this->peripheralIdList) {
            $res['peripheral_id_list'] = $this->peripheralIdList;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDistributedeviceByperipheralidRequest
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
        if (isset($map['peripheral_id_list'])) {
            if (!empty($map['peripheral_id_list'])) {
                $model->peripheralIdList = $map['peripheral_id_list'];
            }
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }

        return $model;
    }
}
