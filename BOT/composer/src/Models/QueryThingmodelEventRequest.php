<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryThingmodelEventRequest extends Model
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

    // 物模型事件ID
    /**
     * @var string
     */
    public $eventId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventId'           => 'event_id',
    ];

    public function validate()
    {
        Model::validateRequired('eventId', $this->eventId, true);
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
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThingmodelEventRequest
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
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }

        return $model;
    }
}
