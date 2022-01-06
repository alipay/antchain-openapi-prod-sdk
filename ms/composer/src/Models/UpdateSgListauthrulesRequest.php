<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateSgListauthrulesRequest extends Model
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

    // 所属黑白名单规则组id
    /**
     * @var int
     */
    public $authGroupId;

    // 更新的规则数据
    //
    /**
     * @var string
     */
    public $authRule;

    // 服务接口id
    //
    /**
     * @var string
     */
    public $dataId;

    // 租户实例id
    //
    /**
     * @var string
     */
    public $instanceId;

    // 更新的规则id
    //
    /**
     * @var int
     */
    public $ruleId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authGroupId'       => 'auth_group_id',
        'authRule'          => 'auth_rule',
        'dataId'            => 'data_id',
        'instanceId'        => 'instance_id',
        'ruleId'            => 'rule_id',
    ];

    public function validate()
    {
        Model::validateRequired('authGroupId', $this->authGroupId, true);
        Model::validateRequired('authRule', $this->authRule, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->authGroupId) {
            $res['auth_group_id'] = $this->authGroupId;
        }
        if (null !== $this->authRule) {
            $res['auth_rule'] = $this->authRule;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSgListauthrulesRequest
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
        if (isset($map['auth_group_id'])) {
            $model->authGroupId = $map['auth_group_id'];
        }
        if (isset($map['auth_rule'])) {
            $model->authRule = $map['auth_rule'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }

        return $model;
    }
}
