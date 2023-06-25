<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateThingmodelEventRequest extends Model
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

    // 物模型事件json
    /**
     * @var string
     */
    public $thingModelEventJson;

    // 数据样例
    /**
     * @var string
     */
    public $dataDemo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'thingModelEventJson' => 'thing_model_event_json',
        'dataDemo'            => 'data_demo',
    ];

    public function validate()
    {
        Model::validateRequired('thingModelEventJson', $this->thingModelEventJson, true);
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
        if (null !== $this->thingModelEventJson) {
            $res['thing_model_event_json'] = $this->thingModelEventJson;
        }
        if (null !== $this->dataDemo) {
            $res['data_demo'] = $this->dataDemo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateThingmodelEventRequest
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
        if (isset($map['thing_model_event_json'])) {
            $model->thingModelEventJson = $map['thing_model_event_json'];
        }
        if (isset($map['data_demo'])) {
            $model->dataDemo = $map['data_demo'];
        }

        return $model;
    }
}
