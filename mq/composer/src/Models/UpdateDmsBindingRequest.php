<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateDmsBindingRequest extends Model
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

    // id
    /**
     * @var string
     */
    public $id;

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // eventcode
    /**
     * @var string
     */
    public $eventcode;

    // exchange_type
    /**
     * @var string
     */
    public $exchangeType;

    // expression
    /**
     * @var string
     */
    public $expression;

    // persistence
    /**
     * @var bool
     */
    public $persistence;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'eventcode'         => 'eventcode',
        'exchangeType'      => 'exchange_type',
        'expression'        => 'expression',
        'persistence'       => 'persistence',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('exchangeType', $this->exchangeType, true);
        Model::validateRequired('persistence', $this->persistence, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
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
        if (null !== $this->persistence) {
            $res['persistence'] = $this->persistence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDmsBindingRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
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
        if (isset($map['persistence'])) {
            $model->persistence = $map['persistence'];
        }

        return $model;
    }
}
