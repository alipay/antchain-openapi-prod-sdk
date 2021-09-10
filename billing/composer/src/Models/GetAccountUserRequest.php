<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class GetAccountUserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // alipay托管子户ID
    /**
     * @var string
     */
    public $alipayUserId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'alipayUserId' => 'alipay_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAccountUserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }

        return $model;
    }
}
