<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class EnableSgAuthrulesRequest extends Model
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

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 所属的鉴权规则黑、白名单id
    /**
     * @var int
     */
    public $authGroupId;

    // 服务接口id
    /**
     * @var string
     */
    public $dataId;

    // 启用的规则id
    /**
     * @var int
     */
    public $ruleId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'authGroupId'       => 'auth_group_id',
        'dataId'            => 'data_id',
        'ruleId'            => 'rule_id',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('authGroupId', $this->authGroupId, true);
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->authGroupId) {
            $res['auth_group_id'] = $this->authGroupId;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnableSgAuthrulesRequest
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
        if (isset($map['auth_group_id'])) {
            $model->authGroupId = $map['auth_group_id'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }

        return $model;
    }
}
