<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRTESTDEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryInternalFailureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 入参
    /**
     * @var string
     */
    public $param;
    protected $_name = [
        'authToken' => 'auth_token',
        'param'     => 'param',
    ];

    public function validate()
    {
        Model::validateRequired('param', $this->param, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->param) {
            $res['param'] = $this->param;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInternalFailureRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['param'])) {
            $model->param = $map['param'];
        }

        return $model;
    }
}
