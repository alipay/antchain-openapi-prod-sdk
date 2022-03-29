<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateBindingRequest extends Model
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

    // application name
    /**
     * @var string
     */
    public $appName;

    // message type: eventcode
    /**
     * @var string
     */
    public $eventcode;

    // binding: exchangeType, "DIRECT" or "HEADER"
    /**
     * @var string
     */
    public $exchangeType;

    // binding: expression
    /**
     * @var string
     */
    public $expression;

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

    // binding: expression
    /**
     * @var bool
     */
    public $persistence;

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

    // zone info
    /**
     * @var string
     */
    public $zone;

    // zone mode
    /**
     * @var string
     */
    public $zoneMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'eventcode'         => 'eventcode',
        'exchangeType'      => 'exchange_type',
        'expression'        => 'expression',
        'group'             => 'group',
        'instanceId'        => 'instance_id',
        'persistence'       => 'persistence',
        'tenant'            => 'tenant',
        'topic'             => 'topic',
        'workspace'         => 'workspace',
        'zone'              => 'zone',
        'zoneMode'          => 'zone_mode',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('exchangeType', $this->exchangeType, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('persistence', $this->persistence, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->exchangeType) {
            $res['exchange_type'] = $this->exchangeType;
        }
        if (null !== $this->expression) {
            $res['expression'] = $this->expression;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->persistence) {
            $res['persistence'] = $this->persistence;
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
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->zoneMode) {
            $res['zone_mode'] = $this->zoneMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBindingRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['exchange_type'])) {
            $model->exchangeType = $map['exchange_type'];
        }
        if (isset($map['expression'])) {
            $model->expression = $map['expression'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['persistence'])) {
            $model->persistence = $map['persistence'];
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
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['zone_mode'])) {
            $model->zoneMode = $map['zone_mode'];
        }

        return $model;
    }
}
