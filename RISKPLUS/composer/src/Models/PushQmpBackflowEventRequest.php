<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushQmpBackflowEventRequest extends Model
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

    // 回流事件id，对应租户回流事件id
    /**
     * @var int
     */
    public $eventId;

    // 回流事件记录列表
    /**
     * @var BackflowEventRecord[]
     */
    public $eventRecords;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventId'           => 'event_id',
        'eventRecords'      => 'event_records',
    ];

    public function validate()
    {
        Model::validateRequired('eventId', $this->eventId, true);
        Model::validateRequired('eventRecords', $this->eventRecords, true);
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
        if (null !== $this->eventRecords) {
            $res['event_records'] = [];
            if (null !== $this->eventRecords && \is_array($this->eventRecords)) {
                $n = 0;
                foreach ($this->eventRecords as $item) {
                    $res['event_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushQmpBackflowEventRequest
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
        if (isset($map['event_records'])) {
            if (!empty($map['event_records'])) {
                $model->eventRecords = [];
                $n                   = 0;
                foreach ($map['event_records'] as $item) {
                    $model->eventRecords[$n++] = null !== $item ? BackflowEventRecord::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
