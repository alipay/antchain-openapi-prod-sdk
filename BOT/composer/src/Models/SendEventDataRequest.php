<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SendEventDataRequest extends Model
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

    // 事件数据列表
    /**
     * @var EventData[]
     */
    public $eventDataList;

    // 事件数据领域参数
    /**
     * @var EventSpecs
     */
    public $eventSpecs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'eventDataList'     => 'event_data_list',
        'eventSpecs'        => 'event_specs',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('eventDataList', $this->eventDataList, true);
        Model::validateRequired('eventSpecs', $this->eventSpecs, true);
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
        if (null !== $this->eventDataList) {
            $res['event_data_list'] = [];
            if (null !== $this->eventDataList && \is_array($this->eventDataList)) {
                $n = 0;
                foreach ($this->eventDataList as $item) {
                    $res['event_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->eventSpecs) {
            $res['event_specs'] = null !== $this->eventSpecs ? $this->eventSpecs->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendEventDataRequest
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
        if (isset($map['event_data_list'])) {
            if (!empty($map['event_data_list'])) {
                $model->eventDataList = [];
                $n                    = 0;
                foreach ($map['event_data_list'] as $item) {
                    $model->eventDataList[$n++] = null !== $item ? EventData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['event_specs'])) {
            $model->eventSpecs = EventSpecs::fromMap($map['event_specs']);
        }

        return $model;
    }
}
