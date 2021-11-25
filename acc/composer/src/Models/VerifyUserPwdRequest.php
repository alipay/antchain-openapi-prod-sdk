<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class VerifyUserPwdRequest extends Model
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

    // 登录账号
    /**
     * @var string
     */
    public $loginId;

    // 登录密码
    /**
     * @var string
     */
    public $password;

    // 过期时间指定(单位 秒)，默认30分钟
    /**
     * @var int
     */
    public $expires;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 公钥名称
    /**
     * @var string
     */
    public $pubkeyName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'loginId'           => 'login_id',
        'password'          => 'password',
        'expires'           => 'expires',
        'tenantId'          => 'tenant_id',
        'pubkeyName'        => 'pubkey_name',
    ];

    public function validate()
    {
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('pubkeyName', $this->pubkeyName, true);
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
        if (null !== $this->expires) {
            $res['expires'] = $this->expires;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->pubkeyName) {
            $res['pubkey_name'] = $this->pubkeyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyUserPwdRequest
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
        if (isset($map['expires'])) {
            $model->expires = $map['expires'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['pubkey_name'])) {
            $model->pubkeyName = $map['pubkey_name'];
        }

        return $model;
    }
}
