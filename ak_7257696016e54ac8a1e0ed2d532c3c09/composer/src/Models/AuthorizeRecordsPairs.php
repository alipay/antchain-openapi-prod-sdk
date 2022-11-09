<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7257696016e54ac8a1e0ed2d532c3c09\Models;

use AlibabaCloud\Tea\Model;

class AuthorizeRecordsPairs extends Model
{
    // 授权业务
    /**
     * @example TIANMAO_CHONGWU
     *
     * @var string
     */
    public $authBusinessCode;

    // 授权密钥
    /**
     * @example klj;lsdkjfaf
     *
     * @var string
     */
    public $authBusinessSecret;
    protected $_name = [
        'authBusinessCode'   => 'auth_business_code',
        'authBusinessSecret' => 'auth_business_secret',
    ];

    public function validate()
    {
        Model::validateRequired('authBusinessCode', $this->authBusinessCode, true);
        Model::validateRequired('authBusinessSecret', $this->authBusinessSecret, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authBusinessCode) {
            $res['auth_business_code'] = $this->authBusinessCode;
        }
        if (null !== $this->authBusinessSecret) {
            $res['auth_business_secret'] = $this->authBusinessSecret;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthorizeRecordsPairs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_business_code'])) {
            $model->authBusinessCode = $map['auth_business_code'];
        }
        if (isset($map['auth_business_secret'])) {
            $model->authBusinessSecret = $map['auth_business_secret'];
        }

        return $model;
    }
}
