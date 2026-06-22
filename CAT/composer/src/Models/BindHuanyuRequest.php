<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAT\Models;

use AlibabaCloud\Tea\Model;

class BindHuanyuRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // huanyu
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken' => 'auth_token',
        'operator'  => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindHuanyuRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
