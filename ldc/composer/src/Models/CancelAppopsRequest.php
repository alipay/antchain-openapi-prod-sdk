<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CancelAppopsRequest extends Model
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

    // 取消原因。长度不超过100个UTF-8字符
    /**
     * @var string
     */
    public $reason;

    // 操作人账号，lks1.23.0才支持
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'   => 'auth_token',
        'operationId' => 'operation_id',
        'reason'      => 'reason',
        'operator'    => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('operationId', $this->operationId, true);
        Model::validateRequired('reason', $this->reason, true);
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
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelAppopsRequest
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
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
