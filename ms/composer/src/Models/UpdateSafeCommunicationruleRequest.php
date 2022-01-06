<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateSafeCommunicationruleRequest extends Model
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

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // id
    /**
     * @var int
     */
    public $id;

    // 规则名称
    /**
     * @var string
     */
    public $name;

    // 取值(0-客户端,1-服务端)
    /**
     * @var int
     */
    public $direction;

    // 模式(0-tls,1-mtls)
    /**
     * @var int
     */
    public $mode;

    // 策略(0-普通,1-国密)
    /**
     * @var string
     */
    public $strategy;

    // 分类(0-应用,1-标签)
    /**
     * @var int
     */
    public $scope;

    // [{"key":"aa","value":"bb","type":1}]
    /**
     * @var string
     */
    public $labels;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'id'                => 'id',
        'name'              => 'name',
        'direction'         => 'direction',
        'mode'              => 'mode',
        'strategy'          => 'strategy',
        'scope'             => 'scope',
        'labels'            => 'labels',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSafeCommunicationruleRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['labels'])) {
            $model->labels = $map['labels'];
        }

        return $model;
    }
}
