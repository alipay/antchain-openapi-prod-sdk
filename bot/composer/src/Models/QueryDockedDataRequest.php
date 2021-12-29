<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDockedDataRequest extends Model
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

    // 1. 已对接的接口名 ;
    // 2. docked_method可通过 实例化SDK中的Request模型后获取，例如：
    // String dockedMethod = new CreateDeviceDatamodelRequest().getMethod();
    /**
     * @var string
     */
    public $dockedMethod;

    // 关键key为chainDeviceId 时不填
    /**
     * @var string
     */
    public $scene;

    // 1. 接口中的关键key ，例如 deviceId ；
    // 2. key为chainDeviceId时，scene字段不填
    //
    /**
     * @var string[]
     */
    public $key;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dockedMethod'      => 'docked_method',
        'scene'             => 'scene',
        'key'               => 'key',
    ];

    public function validate()
    {
        Model::validateRequired('dockedMethod', $this->dockedMethod, true);
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
        if (null !== $this->dockedMethod) {
            $res['docked_method'] = $this->dockedMethod;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDockedDataRequest
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
        if (isset($map['docked_method'])) {
            $model->dockedMethod = $map['docked_method'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['key'])) {
            if (!empty($map['key'])) {
                $model->key = $map['key'];
            }
        }

        return $model;
    }
}
