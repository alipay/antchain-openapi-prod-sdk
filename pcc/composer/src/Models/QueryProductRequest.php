<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class QueryProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码,可以为空
    /**
     * @var string
     */
    public $code;
    protected $_name = [
        'authToken' => 'auth_token',
        'code'      => 'code',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }

        return $model;
    }
}
