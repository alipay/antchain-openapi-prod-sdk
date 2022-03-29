<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UndeliverMessageStatusRequest extends Model
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

    // interval in seconds to the current time
    /**
     * @var int
     */
    public $intervalInSecond;

    // tenant id
    /**
     * @var string
     */
    public $tenant;

    // message type: topic
    /**
     * @var string
     */
    public $topic;

    // workspace id
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventcode'         => 'eventcode',
        'group'             => 'group',
        'instanceId'        => 'instance_id',
        'intervalInSecond'  => 'interval_in_second',
        'tenant'            => 'tenant',
        'topic'             => 'topic',
        'workspace'         => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('intervalInSecond', $this->intervalInSecond, true);
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
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->intervalInSecond) {
            $res['interval_in_second'] = $this->intervalInSecond;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UndeliverMessageStatusRequest
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
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['interval_in_second'])) {
            $model->intervalInSecond = $map['interval_in_second'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
