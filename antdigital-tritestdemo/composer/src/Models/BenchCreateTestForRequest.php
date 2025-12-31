<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRITESTDEMO\Models;

use AlibabaCloud\Tea\Model;

class BenchCreateTestForRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 3000
    /**
     * @var string
     */
    public $timeout;
    protected $_name = [
        'authToken' => 'auth_token',
        'timeout'   => 'timeout',
    ];

    public function validate()
    {
        Model::validateRequired('timeout', $this->timeout, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BenchCreateTestForRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }

        return $model;
    }
}
