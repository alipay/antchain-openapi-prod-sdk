<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateGuardianGuardiangrayrulestatusRequest extends Model
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

    // ip 列表
    /**
     * @var string
     */
    public $ipList;

    // 规则id
    /**
     * @var int
     */
    public $ruleId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'ipList'            => 'ip_list',
        'ruleId'            => 'rule_id',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('ipList', $this->ipList, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
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
        if (null !== $this->ipList) {
            $res['ip_list'] = $this->ipList;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateGuardianGuardiangrayrulestatusRequest
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
        if (isset($map['ip_list'])) {
            $model->ipList = $map['ip_list'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }

        return $model;
    }
}
