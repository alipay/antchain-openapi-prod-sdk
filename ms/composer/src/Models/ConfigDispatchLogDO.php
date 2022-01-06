<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ConfigDispatchLogDO extends Model
{
    // 实例id
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 配置的key
    /**
     * @example objectIdUnitTest-service
     *
     * @var string
     */
    public $key;

    // 配置的类型
    /**
     * @example RouterRule
     *
     * @var string
     */
    public $type;

    // 状态
    /**
     * @example 0,1
     *
     * @var int
     */
    public $status;

    // 配置下发的信息
    /**
     * @example json：{}
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'instanceId' => 'instance_id',
        'key'        => 'key',
        'type'       => 'type',
        'status'     => 'status',
        'value'      => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfigDispatchLogDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
