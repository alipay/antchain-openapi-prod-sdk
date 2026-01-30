<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class QueryAntdigitalWebtrwatradeIssuerSubuseraccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 用户ID-用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    /**
     * @var string
     */
    public $userId;

    // 本侧链用户地址-用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    /**
     * @var string
     */
    public $userAddress;

    // 登录名-用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    /**
     * @var string
     */
    public $loginName;

    // 登录名类型(EMAIL) -用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    /**
     * @var string
     */
    public $loginAccountType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'userAddress'       => 'user_address',
        'loginName'         => 'login_name',
        'loginAccountType'  => 'login_account_type',
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
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->loginAccountType) {
            $res['login_account_type'] = $this->loginAccountType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntdigitalWebtrwatradeIssuerSubuseraccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['login_account_type'])) {
            $model->loginAccountType = $map['login_account_type'];
        }

        return $model;
    }
}
