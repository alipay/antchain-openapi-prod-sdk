<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class OrderList extends Model
{
    // 活动ID
    /**
     * @example 0zgNdId0nxi95b5lsNpazWYoCo5
     *
     * @var string
     */
    public $activityId;

    // 记录ID
    /**
     * @example 110000199001011234
     *
     * @var string
     */
    public $id;

    // 业务ID
    /**
     * @example b5lsNpazWYoCo5
     *
     * @var string
     */
    public $bizId;

    // 奖品id
    /**
     * @example 110000199001011234
     *
     * @var string
     */
    public $prizeId;
    protected $_name = [
        'activityId' => 'activity_id',
        'id'         => 'id',
        'bizId'      => 'biz_id',
        'prizeId'    => 'prize_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->activityId) {
            $res['activity_id'] = $this->activityId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->prizeId) {
            $res['prize_id'] = $this->prizeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['activity_id'])) {
            $model->activityId = $map['activity_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['prize_id'])) {
            $model->prizeId = $map['prize_id'];
        }

        return $model;
    }
}
