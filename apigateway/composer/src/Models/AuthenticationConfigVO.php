<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class AuthenticationConfigVO extends Model
{
    // access_key
    /**
     * @example key1
     *
     * @var string
     */
    public $accessKey;

    // secret_key
    /**
     * @example key1
     *
     * @var string
     */
    public $secretKey;
    protected $_name = [
        'accessKey' => 'access_key',
        'secretKey' => 'secret_key',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthenticationConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['secret_key'])) {
            $model->secretKey = $map['secret_key'];
        }

        return $model;
    }
}
