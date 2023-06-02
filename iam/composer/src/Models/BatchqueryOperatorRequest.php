<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryOperatorRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用户id列表
    /**
     * @var string[]
     */
    public $operatorIds;
    protected $_name = [
        'authToken'   => 'auth_token',
        'operatorIds' => 'operator_ids',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operatorIds) {
            $res['operator_ids'] = $this->operatorIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryOperatorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operator_ids'])) {
            if (!empty($map['operator_ids'])) {
                $model->operatorIds = $map['operator_ids'];
            }
        }

        return $model;
    }
}
