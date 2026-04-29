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

    // 触发时间
    /**
     * @example 2026-04-29 10:19:23
     *
     * @var string
     */
    public $sendTime;

    // 发券结果
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $sendStatus;

    // 错误码
    /**
     * @example 10000911
     *
     * @var string
     */
    public $errorCode;

    // 错误描述
    /**
     * @example [10000911]指定奖品指定金额决策参数检查异常
     *
     * @var string
     */
    public $errorMsg;
    protected $_name = [
        'activityId' => 'activity_id',
        'id'         => 'id',
        'bizId'      => 'biz_id',
        'prizeId'    => 'prize_id',
        'sendTime'   => 'send_time',
        'sendStatus' => 'send_status',
        'errorCode'  => 'error_code',
        'errorMsg'   => 'error_msg',
    ];

    public function validate()
    {
        Model::validatePattern('sendTime', $this->sendTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->sendStatus) {
            $res['send_status'] = $this->sendStatus;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
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
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['send_status'])) {
            $model->sendStatus = $map['send_status'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }

        return $model;
    }
}
