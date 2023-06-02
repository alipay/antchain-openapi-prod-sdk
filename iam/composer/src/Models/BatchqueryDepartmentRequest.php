<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryDepartmentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 部门唯一码
    /**
     * @var string[]
     */
    public $codes;
    protected $_name = [
        'authToken' => 'auth_token',
        'codes'     => 'codes',
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
        if (null !== $this->codes) {
            $res['codes'] = $this->codes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryDepartmentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['codes'])) {
            if (!empty($map['codes'])) {
                $model->codes = $map['codes'];
            }
        }

        return $model;
    }
}
