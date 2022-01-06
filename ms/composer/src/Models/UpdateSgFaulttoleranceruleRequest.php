<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateSgFaulttoleranceruleRequest extends Model
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
     * @var int
     */
    public $id;

    // app名称
    /**
     * @var string
     */
    public $appName;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 规则名称
    /**
     * @var string
     */
    public $name;

    // 具体规则项 {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
    /**
     * @var string
     */
    public $ruleItemList;

    // 取值client,server二选1，默认是client
    /**
     * @var string
     */
    public $direction;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'appName'           => 'app_name',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'ruleItemList'      => 'rule_item_list',
        'direction'         => 'direction',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('ruleItemList', $this->ruleItemList, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ruleItemList) {
            $res['rule_item_list'] = $this->ruleItemList;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSgFaulttoleranceruleRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['rule_item_list'])) {
            $model->ruleItemList = $map['rule_item_list'];
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }

        return $model;
    }
}
