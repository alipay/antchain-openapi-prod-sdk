<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MsgQueryDO extends Model
{
    // delivery_count
    /**
     * @example
     *
     * @var int
     */
    public $deliveryCount;

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

    // gmt_last_delivery
    /**
     * @example gmt_last_delivery
     *
     * @var string
     */
    public $gmtLastDelivery;

    // gmt_next_delivery
    /**
     * @example gmt_next_delivery
     *
     * @var string
     */
    public $gmtNextDelivery;

    // message_id
    /**
     * @example message_id
     *
     * @var string
     */
    public $messageId;

    // publisher_group
    /**
     * @example publisher_group
     *
     * @var string
     */
    public $publisherGroup;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // topic
    /**
     * @example topic
     *
     * @var string
     */
    public $topic;

    // transaction
    /**
     * @example transaction
     *
     * @var bool
     */
    public $transaction;

    // subscriber_group_delivery
    /**
     * @example subscriber_group_delivery
     *
     * @var string
     */
    public $subscriberGroupDelivery;

    // subscriber_group_undelivery
    /**
     * @example subscriber_group_undelivery
     *
     * @var string
     */
    public $subscriberGroupUndelivery;
    protected $_name = [
        'deliveryCount'             => 'delivery_count',
        'eventcode'                 => 'eventcode',
        'gmtCreate'                 => 'gmt_create',
        'gmtLastDelivery'           => 'gmt_last_delivery',
        'gmtNextDelivery'           => 'gmt_next_delivery',
        'messageId'                 => 'message_id',
        'publisherGroup'            => 'publisher_group',
        'status'                    => 'status',
        'topic'                     => 'topic',
        'transaction'               => 'transaction',
        'subscriberGroupDelivery'   => 'subscriber_group_delivery',
        'subscriberGroupUndelivery' => 'subscriber_group_undelivery',
    ];

    public function validate()
    {
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtLastDelivery', $this->gmtLastDelivery, true);
        Model::validateRequired('gmtNextDelivery', $this->gmtNextDelivery, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('publisherGroup', $this->publisherGroup, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deliveryCount) {
            $res['delivery_count'] = $this->deliveryCount;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtLastDelivery) {
            $res['gmt_last_delivery'] = $this->gmtLastDelivery;
        }
        if (null !== $this->gmtNextDelivery) {
            $res['gmt_next_delivery'] = $this->gmtNextDelivery;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->publisherGroup) {
            $res['publisher_group'] = $this->publisherGroup;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->transaction) {
            $res['transaction'] = $this->transaction;
        }
        if (null !== $this->subscriberGroupDelivery) {
            $res['subscriber_group_delivery'] = $this->subscriberGroupDelivery;
        }
        if (null !== $this->subscriberGroupUndelivery) {
            $res['subscriber_group_undelivery'] = $this->subscriberGroupUndelivery;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MsgQueryDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['delivery_count'])) {
            $model->deliveryCount = $map['delivery_count'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_last_delivery'])) {
            $model->gmtLastDelivery = $map['gmt_last_delivery'];
        }
        if (isset($map['gmt_next_delivery'])) {
            $model->gmtNextDelivery = $map['gmt_next_delivery'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['publisher_group'])) {
            $model->publisherGroup = $map['publisher_group'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['transaction'])) {
            $model->transaction = $map['transaction'];
        }
        if (isset($map['subscriber_group_delivery'])) {
            $model->subscriberGroupDelivery = $map['subscriber_group_delivery'];
        }
        if (isset($map['subscriber_group_undelivery'])) {
            $model->subscriberGroupUndelivery = $map['subscriber_group_undelivery'];
        }

        return $model;
    }
}
