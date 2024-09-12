<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class CreateUserRequest extends Model
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

    // 用户信息
    /**
     * @var ACSUserInfo
     */
    public $user;

    // 用户登陆名
    /**
     * @var string
     */
    public $userid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'user'              => 'user',
        'userid'            => 'userid',
    ];

    public function validate()
    {
        Model::validateRequired('user', $this->user, true);
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
        if (null !== $this->user) {
            $res['user'] = null !== $this->user ? $this->user->toMap() : null;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUserRequest
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
        if (isset($map['user'])) {
            $model->user = ACSUserInfo::fromMap($map['user']);
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }

        return $model;
    }
}
