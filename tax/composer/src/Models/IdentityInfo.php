<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class IdentityInfo extends Model
{
    // 需要打标的税号
    /**
     * @example 税号
     *
     * @var string
     */
    public $identityId;

    // 授权编号
    /**
     * @example 授权编号
     *
     * @var string
     */
    public $authCode;
    protected $_name = [
        'identityId' => 'identity_id',
        'authCode'   => 'auth_code',
    ];

    public function validate()
    {
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('authCode', $this->authCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }

        return $model;
    }
}
