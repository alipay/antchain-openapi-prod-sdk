<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelFileIntegrationRequest extends Model
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

    // 被授权目标租户ID
    /**
     * @var string
     */
    public $targetTenant;

    // 授权类型：BUCKET，OBJECT
    /**
     * @var string
     */
    public $authType;

    // object名称（当auth_type为OBJECT必填）
    /**
     * @var string
     */
    public $objectName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'targetTenant'      => 'target_tenant',
        'authType'          => 'auth_type',
        'objectName'        => 'object_name',
    ];

    public function validate()
    {
        Model::validateRequired('targetTenant', $this->targetTenant, true);
        Model::validateRequired('authType', $this->authType, true);
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
        if (null !== $this->targetTenant) {
            $res['target_tenant'] = $this->targetTenant;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->objectName) {
            $res['object_name'] = $this->objectName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelFileIntegrationRequest
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
        if (isset($map['target_tenant'])) {
            $model->targetTenant = $map['target_tenant'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['object_name'])) {
            $model->objectName = $map['object_name'];
        }

        return $model;
    }
}
