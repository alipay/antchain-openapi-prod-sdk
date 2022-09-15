<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateThingmodelRequest extends Model
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

    // 物模型内容（多个物模型功能拼合的json）
    /**
     * @var string
     */
    public $thingModel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'thingModel'        => 'thing_model',
    ];

    public function validate()
    {
        Model::validateRequired('thingModel', $this->thingModel, true);
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
        if (null !== $this->thingModel) {
            $res['thing_model'] = $this->thingModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateThingmodelRequest
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
        if (isset($map['thing_model'])) {
            $model->thingModel = $map['thing_model'];
        }

        return $model;
    }
}
