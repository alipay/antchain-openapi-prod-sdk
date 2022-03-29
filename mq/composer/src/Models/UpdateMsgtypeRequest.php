<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateMsgtypeRequest extends Model
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

    // description of message type
    /**
     * @var string
     */
    public $desc;

    // message type: eventcode
    /**
     * @var string
     */
    public $eventcode;

    // middleware instance id
    /**
     * @var string
     */
    public $instanceId;

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
        'desc'              => 'desc',
        'eventcode'         => 'eventcode',
        'instanceId'        => 'instance_id',
        'tenant'            => 'tenant',
        'topic'             => 'topic',
        'workspace'         => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
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
     * @return UpdateMsgtypeRequest
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
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
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
