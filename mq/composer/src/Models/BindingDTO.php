<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class BindingDTO extends Model
{
    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // group
    /**
     * @example group
     *
     * @var string
     */
    public $group;

    // topic
    /**
     * @example topic
     *
     * @var string
     */
    public $topic;

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

    // persistence
    /**
     * @example true, false
     *
     * @var bool
     */
    public $persistence;
    protected $_name = [
        'appName'      => 'app_name',
        'group'        => 'group',
        'topic'        => 'topic',
        'eventcode'    => 'eventcode',
        'exchangeType' => 'exchange_type',
        'expression'   => 'expression',
        'persistence'  => 'persistence',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
        Model::validateRequired('exchangeType', $this->exchangeType, true);
        Model::validateRequired('persistence', $this->persistence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
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
     * @return BindingDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
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
