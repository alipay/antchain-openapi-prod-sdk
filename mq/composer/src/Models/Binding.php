<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class Binding extends Model
{
    // appName
    /**
     * @example appName
     *
     * @var string
     */
    public $appName;

    // creation_time
    /**
     * @example 2018-04-16T00:01:59Z
     *
     * @var string
     */
    public $creationTime;

    // eventcode
    /**
     * @example eventcode
     *
     * @var string
     */
    public $eventcode;

    // exchangeType
    /**
     * @example exchange_type
     *
     * @var string
     */
    public $exchangeType;

    // expression
    /**
     * @example expression
     *
     * @var string
     */
    public $expression;

    // group
    /**
     * @example group
     *
     * @var string
     */
    public $group;

    // id
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // persistence
    /**
     * @example true
     *
     * @var bool
     */
    public $persistence;

    // topic
    /**
     * @example instance_id
     *
     * @var string
     */
    public $topic;

    // update_time
    /**
     * @example 2018-04-16T00:01:59Z
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'appName'      => 'app_name',
        'creationTime' => 'creation_time',
        'eventcode'    => 'eventcode',
        'exchangeType' => 'exchange_type',
        'expression'   => 'expression',
        'group'        => 'group',
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'persistence'  => 'persistence',
        'topic'        => 'topic',
        'updateTime'   => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->persistence) {
            $res['persistence'] = $this->persistence;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Binding
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['persistence'])) {
            $model->persistence = $map['persistence'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
