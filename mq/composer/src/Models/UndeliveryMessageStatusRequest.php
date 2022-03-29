<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UndeliveryMessageStatusRequest extends Model
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

    // end time
    /**
     * @var int
     */
    public $endTime;

    // message type: eventcode
    /**
     * @var string
     */
    public $eventcode;

    // group of subscriber
    /**
     * @var string
     */
    public $group;

    // middleware instance id
    /**
     * @var string
     */
    public $instanceId;

    // stauts
    /**
     * @var string
     */
    public $status;

    // message type: topic
    /**
     * @var string
     */
    public $topic;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'endTime'           => 'end_time',
        'eventcode'         => 'eventcode',
        'group'             => 'group',
        'instanceId'        => 'instance_id',
        'status'            => 'status',
        'topic'             => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('topic', $this->topic, true);
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
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UndeliveryMessageStatusRequest
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
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
