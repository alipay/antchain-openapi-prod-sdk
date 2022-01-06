<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class RollbackDdcsDataRequest extends Model
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

    // 当前租户 instanceId
    /**
     * @var string
     */
    public $instanceId;

    // 回滚的属性的id
    /**
     * @var int
     */
    public $attributeId;

    // 再需要强制回滚的时候，需要通过指定 uniqueId 来强制回滚哪一次推送
    /**
     * @var string
     */
    public $uniqueId;

    // 默认情况下，只能回滚最后一次推送。
    //
    // 但是通过 force_rollback + unique_id 可以强制指定回滚某一次推送。风险较高，不建议使用。
    /**
     * @var bool
     */
    public $forceRollback;

    // 回滚操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'attributeId'       => 'attribute_id',
        'uniqueId'          => 'unique_id',
        'forceRollback'     => 'force_rollback',
        'operator'          => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('attributeId', $this->attributeId, true);
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
        if (null !== $this->attributeId) {
            $res['attribute_id'] = $this->attributeId;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->forceRollback) {
            $res['force_rollback'] = $this->forceRollback;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollbackDdcsDataRequest
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
        if (isset($map['attribute_id'])) {
            $model->attributeId = $map['attribute_id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['force_rollback'])) {
            $model->forceRollback = $map['force_rollback'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
