<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

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

    // 登录名称
    /**
     * @var string
     */
    public $loginId;

    // 非登录账号无需密码
    /**
     * @var string
     */
    public $password;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 用户类型
    /**
     * @var string
     */
    public $userType;

    // 用户名称
    /**
     * @var string
     */
    public $userName;

    // 手机号码
    /**
     * @var string
     */
    public $telphone;

    // 用户邮箱
    /**
     * @var string
     */
    public $email;

    // 创建者,一般是C创建B类账号。非提其他主体创建，可以不传
    /**
     * @var int
     */
    public $creatorUserId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'loginId'           => 'login_id',
        'password'          => 'password',
        'tenantId'          => 'tenant_id',
        'userType'          => 'user_type',
        'userName'          => 'user_name',
        'telphone'          => 'telphone',
        'email'             => 'email',
        'creatorUserId'     => 'creator_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('userType', $this->userType, true);
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
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->telphone) {
            $res['telphone'] = $this->telphone;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->creatorUserId) {
            $res['creator_user_id'] = $this->creatorUserId;
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
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['telphone'])) {
            $model->telphone = $map['telphone'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['creator_user_id'])) {
            $model->creatorUserId = $map['creator_user_id'];
        }

        return $model;
    }
}
