<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class BindingDO extends Model
{
    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // eventcode
    /**
     * @example eventcode
     *
     * @var string
     */
    public $eventcode;

    // exchange_type
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

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // group
    /**
     * @example group
     *
     * @var string
     */
    public $group;

    // id
    /**
     * @example
     *
     * @var int
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
     * @example true, false
     *
     * @var bool
     */
    public $persistence;

    // topic
    /**
     * @example topic
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'appName'      => 'app_name',
        'eventcode'    => 'eventcode',
        'exchangeType' => 'exchange_type',
        'expression'   => 'expression',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'group'        => 'group',
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'persistence'  => 'persistence',
        'topic'        => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('exchangeType', $this->exchangeType, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('persistence', $this->persistence, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindingDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
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

        return $model;
    }
}
