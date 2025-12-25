<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateNewcarRequest extends Model
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

    // testchannleCode
    /**
     * @var string
     */
    public $sceneCode;

    // 新车线索集合
    /**
     * @var NewCarInfo[]
     */
    public $newCarInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneCode'         => 'scene_code',
        'newCarInfo'        => 'new_car_info',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('newCarInfo', $this->newCarInfo, true);
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->newCarInfo) {
            $res['new_car_info'] = [];
            if (null !== $this->newCarInfo && \is_array($this->newCarInfo)) {
                $n = 0;
                foreach ($this->newCarInfo as $item) {
                    $res['new_car_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateNewcarRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['new_car_info'])) {
            if (!empty($map['new_car_info'])) {
                $model->newCarInfo = [];
                $n                 = 0;
                foreach ($map['new_car_info'] as $item) {
                    $model->newCarInfo[$n++] = null !== $item ? NewCarInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
