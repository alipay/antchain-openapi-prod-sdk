<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddGuardianGuardiangrayrulesRequest extends Model
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

    // 监控规则
    /**
     * @var string
     */
    public $guardianRule;

    // ip 列表
    /**
     * @var string
     */
    public $ipList;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'guardianRule'      => 'guardian_rule',
        'ipList'            => 'ip_list',
        'instanceId'        => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('guardianRule', $this->guardianRule, true);
        Model::validateRequired('ipList', $this->ipList, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->guardianRule) {
            $res['guardian_rule'] = $this->guardianRule;
        }
        if (null !== $this->ipList) {
            $res['ip_list'] = $this->ipList;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddGuardianGuardiangrayrulesRequest
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
        if (isset($map['guardian_rule'])) {
            $model->guardianRule = $map['guardian_rule'];
        }
        if (isset($map['ip_list'])) {
            $model->ipList = $map['ip_list'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
