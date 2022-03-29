<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DingDingRobot extends Model
{
    // 钉钉机器人名称
    /**
     * @example 奥特曼
     *
     * @var string
     */
    public $name;

    // 钉钉机器人token
    /**
     * @example 11111
     *
     * @var string
     */
    public $token;

    // 钉钉机器人ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 是否全局有效
    /**
     * @example true, false
     *
     * @var bool
     */
    public $scopeGlobal;

    // 订阅类型：0、当前workspace有效； 1、当前租户有效
    /**
     * @example 1
     *
     * @var int
     */
    public $validScope;

    // 订阅告警规则数量
    /**
     * @example 1
     *
     * @var int
     */
    public $subscribeCount;
    protected $_name = [
        'name'           => 'name',
        'token'          => 'token',
        'id'             => 'id',
        'scopeGlobal'    => 'scope_global',
        'validScope'     => 'valid_scope',
        'subscribeCount' => 'subscribe_count',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('token', $this->token, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->scopeGlobal) {
            $res['scope_global'] = $this->scopeGlobal;
        }
        if (null !== $this->validScope) {
            $res['valid_scope'] = $this->validScope;
        }
        if (null !== $this->subscribeCount) {
            $res['subscribe_count'] = $this->subscribeCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DingDingRobot
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['scope_global'])) {
            $model->scopeGlobal = $map['scope_global'];
        }
        if (isset($map['valid_scope'])) {
            $model->validScope = $map['valid_scope'];
        }
        if (isset($map['subscribe_count'])) {
            $model->subscribeCount = $map['subscribe_count'];
        }

        return $model;
    }
}
