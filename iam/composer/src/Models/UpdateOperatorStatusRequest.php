<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class UpdateOperatorStatusRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 操作员ID
    /**
     * @var string
     */
    public $operatorId;

    // 要更新到的状态，FROZEN为冻结，NORMAL为正常
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'  => 'auth_token',
        'operatorId' => 'operator_id',
        'status'     => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateOperatorStatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
