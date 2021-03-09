<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class DeleteOperatorRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 操作员唯一id
    /**
     * @var string
     */
    public $operatorId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'operatorId' => 'operator_id',
    ];

    public function validate()
    {
        Model::validateRequired('operatorId', $this->operatorId, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteOperatorRequest
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

        return $model;
    }
}
