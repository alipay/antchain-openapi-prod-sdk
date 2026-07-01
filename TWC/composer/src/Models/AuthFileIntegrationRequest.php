<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AuthFileIntegrationRequest extends Model
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

    // 授权过期时间，格式为 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $authExpireTime;

    // 被授权的租户id
    /**
     * @var string
     */
    public $targetTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authType'          => 'auth_type',
        'objectName'        => 'object_name',
        'authExpireTime'    => 'auth_expire_time',
        'targetTenant'      => 'target_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('authExpireTime', $this->authExpireTime, true);
        Model::validateRequired('targetTenant', $this->targetTenant, true);
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
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->objectName) {
            $res['object_name'] = $this->objectName;
        }
        if (null !== $this->authExpireTime) {
            $res['auth_expire_time'] = $this->authExpireTime;
        }
        if (null !== $this->targetTenant) {
            $res['target_tenant'] = $this->targetTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthFileIntegrationRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['object_name'])) {
            $model->objectName = $map['object_name'];
        }
        if (isset($map['auth_expire_time'])) {
            $model->authExpireTime = $map['auth_expire_time'];
        }
        if (isset($map['target_tenant'])) {
            $model->targetTenant = $map['target_tenant'];
        }

        return $model;
    }
}
