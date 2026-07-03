<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateRbbUserRequest extends Model
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

    // 用户邮箱，非必填
    /**
     * @var string
     */
    public $email;

    // 用户姓名、真实名称，不要求全局唯一
    /**
     * @var string
     */
    public $fullName;

    // 用户密码
    /**
     * @var string
     */
    public $password;

    // 用户电话号码，非必填
    /**
     * @var string
     */
    public $phone;

    // 用户所属租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 用户名，必须全局唯一
    /**
     * @var string
     */
    public $userName;

    // 用户属性扩展字段，json格式，可以为空
    /**
     * @var string
     */
    public $userPropertyJson;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'email'             => 'email',
        'fullName'          => 'full_name',
        'password'          => 'password',
        'phone'             => 'phone',
        'tenantCode'        => 'tenant_code',
        'userName'          => 'user_name',
        'userPropertyJson'  => 'user_property_json',
    ];

    public function validate()
    {
        Model::validateMaxLength('email', $this->email, 128);
        Model::validateMaxLength('fullName', $this->fullName, 64);
        Model::validateMaxLength('password', $this->password, 200);
        Model::validateMaxLength('phone', $this->phone, 64);
        Model::validateMaxLength('tenantCode', $this->tenantCode, 64);
        Model::validateMinLength('email', $this->email, 3);
        Model::validateMinLength('fullName', $this->fullName, 1);
        Model::validateMinLength('password', $this->password, 8);
        Model::validateMinLength('phone', $this->phone, 4);
        Model::validateMinLength('tenantCode', $this->tenantCode, 2);
        Model::validateRequired('fullName', $this->fullName, true);
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->fullName) {
            $res['full_name'] = $this->fullName;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userPropertyJson) {
            $res['user_property_json'] = $this->userPropertyJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRbbUserRequest
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
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['full_name'])) {
            $model->fullName = $map['full_name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_property_json'])) {
            $model->userPropertyJson = $map['user_property_json'];
        }

        return $model;
    }
}
