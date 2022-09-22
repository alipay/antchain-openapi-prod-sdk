<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class RetryAppopsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 运维单id
    /**
     * @var string
     */
    public $operationId;

    // 操作人账号，lks1.23.0才支持
    /**
     * @var string
     */
    public $operator;

    // 租户编码
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'   => 'auth_token',
        'operationId' => 'operation_id',
        'operator'    => 'operator',
        'tenantName'  => 'tenant_name',
    ];

    public function validate()
    {
        Model::validateRequired('operationId', $this->operationId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RetryAppopsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
