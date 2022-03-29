<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MsgQueryBatchDO extends Model
{
    // eventcode
    /**
     * @example eventcode
     *
     * @var string
     */
    public $eventcode;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // message_id
    /**
     * @example message_id
     *
     * @var string
     */
    public $messageId;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // subscriber_group_undelivery
    /**
     * @example subscriber_group_undelivery
     *
     * @var string
     */
    public $subscriberGroupUndelivery;
    protected $_name = [
        'eventcode'                 => 'eventcode',
        'gmtCreate'                 => 'gmt_create',
        'messageId'                 => 'message_id',
        'status'                    => 'status',
        'subscriberGroupUndelivery' => 'subscriber_group_undelivery',
    ];

    public function validate()
    {
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('messageId', $this->messageId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subscriberGroupUndelivery) {
            $res['subscriber_group_undelivery'] = $this->subscriberGroupUndelivery;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MsgQueryBatchDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subscriber_group_undelivery'])) {
            $model->subscriberGroupUndelivery = $map['subscriber_group_undelivery'];
        }

        return $model;
    }
}
