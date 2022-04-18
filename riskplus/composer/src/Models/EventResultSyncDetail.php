<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EventResultSyncDetail extends Model
{
    // 事件唯一id（单个租户全局唯一）
    /**
     * @example 12345
     *
     * @var string
     */
    public $eventId;

    // 营销计划id
    /**
     * @example 12345
     *
     * @var string
     */
    public $planId;

    // 消息id
    /**
     * @example 1122
     *
     * @var string
     */
    public $msgId;

    // 事件时间
    /**
     * @example yyyy-MM-dd HH:mm:ss.SSS
     *
     * @var string
     */
    public $eventTime;

    // 事件类型：1为富信贴尾
    /**
     * @example 1
     *
     * @var int
     */
    public $eventType;

    // 1为成功 2为失败
    /**
     * @example 1
     *
     * @var int
     */
    public $state;

    // 用户key类型
    /**
     * @example MOBILE
     *
     * @var string
     */
    public $keyType;

    // 手机号
    /**
     * @example 15012340000
     *
     * @var string
     */
    public $customerKey;

    // 扩展字段
    /**
     * @example {"operator":"CMCC"}
     *
     * @var string
     */
    public $extData;
    protected $_name = [
        'eventId'     => 'event_id',
        'planId'      => 'plan_id',
        'msgId'       => 'msg_id',
        'eventTime'   => 'event_time',
        'eventType'   => 'event_type',
        'state'       => 'state',
        'keyType'     => 'key_type',
        'customerKey' => 'customer_key',
        'extData'     => 'ext_data',
    ];

    public function validate()
    {
        Model::validateRequired('eventId', $this->eventId, true);
        Model::validateRequired('planId', $this->planId, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('eventType', $this->eventType, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('keyType', $this->keyType, true);
        Model::validateRequired('customerKey', $this->customerKey, true);
        Model::validateRequired('extData', $this->extData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->eventType) {
            $res['event_type'] = $this->eventType;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->keyType) {
            $res['key_type'] = $this->keyType;
        }
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->extData) {
            $res['ext_data'] = $this->extData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventResultSyncDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['event_type'])) {
            $model->eventType = $map['event_type'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['key_type'])) {
            $model->keyType = $map['key_type'];
        }
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['ext_data'])) {
            $model->extData = $map['ext_data'];
        }

        return $model;
    }
}
