<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CommunicationPageModel extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 规则名称
    /**
     * @example rule1
     *
     * @var string
     */
    public $name;

    // 取值(0-客户端,1-服务端)
    /**
     * @example 1
     *
     * @var int
     */
    public $direction;

    // 模式(0-tls,1-mtls)
    /**
     * @example 1
     *
     * @var int
     */
    public $mode;

    // 策略(0-普通,1-国密)
    /**
     * @example 1
     *
     * @var string
     */
    public $strategy;

    // 状态(0-关闭,1-开启)
    /**
     * @example 0
     *
     * @var int
     */
    public $enabled;

    // 分类(0-应用,1-标签)
    /**
     * @example 1
     *
     * @var int
     */
    public $scope;

    // 操作人
    /**
     * @example aaa
     *
     * @var string
     */
    public $operator;

    // 操作时间
    /**
     * @example 2020-10-22 11:33:22
     *
     * @var string
     */
    public $operateTime;
    protected $_name = [
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'name'        => 'name',
        'direction'   => 'direction',
        'mode'        => 'mode',
        'strategy'    => 'strategy',
        'enabled'     => 'enabled',
        'scope'       => 'scope',
        'operator'    => 'operator',
        'operateTime' => 'operate_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->strategy) {
            $res['strategy'] = $this->strategy;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommunicationPageModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['strategy'])) {
            $model->strategy = $map['strategy'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }

        return $model;
    }
}
