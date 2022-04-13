<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetUnireleaseTenantsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 解决方案Json
    /**
     * @var string
     */
    public $solution;
    protected $_name = [
        'authToken' => 'auth_token',
        'solution'  => 'solution',
    ];

    public function validate()
    {
        Model::validateRequired('solution', $this->solution, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->solution) {
            $res['solution'] = $this->solution;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUnireleaseTenantsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['solution'])) {
            $model->solution = $map['solution'];
        }

        return $model;
    }
}
