<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class ACSUserInfo extends Model
{
    // 用户ID
    /**
     * @example acs
     *
     * @var string
     */
    public $userId;

    // 用户名称
    /**
     * @example 服务账号
     *
     * @var string
     */
    public $userName;

    // 用户类型，OPERATOR：登录用户；SERVICE：服务用户
    /**
     * @example OPERATOR
     *
     * @var string
     */
    public $userType;

    // 是否已失效
    /**
     * @example true, false
     *
     * @var bool
     */
    public $expired;

    // 是否被禁用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $disabled;

    // 邮箱
    /**
     * @example test@alitest.com
     *
     * @var string
     */
    public $email;

    // 手机号码
    /**
     * @example 13888888888
     *
     * @var string
     */
    public $phone;

    // 失效时间
    /**
     * @example 2028-10-10T10:10:00Z
     *
     * @var string
     */
    public $expiredTime;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

    // 更新时间
    /**
     * @example 2021-10-10T10:10:00Z
     *
     * @var string
     */
    public $updateTime;

    // 用户角色
    /**
     * @example
     *
     * @var ACSUserRole[]
     */
    public $userRoles;

    // 账户密码
    /**
     * @example 略
     *
     * @var string
     */
    public $password;
    protected $_name = [
        'userId'      => 'user_id',
        'userName'    => 'user_name',
        'userType'    => 'user_type',
        'expired'     => 'expired',
        'disabled'    => 'disabled',
        'email'       => 'email',
        'phone'       => 'phone',
        'expiredTime' => 'expired_time',
        'createTime'  => 'create_time',
        'updateTime'  => 'update_time',
        'userRoles'   => 'user_roles',
        'password'    => 'password',
    ];

    public function validate()
    {
        Model::validatePattern('expiredTime', $this->expiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('updateTime', $this->updateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->expired) {
            $res['expired'] = $this->expired;
        }
        if (null !== $this->disabled) {
            $res['disabled'] = $this->disabled;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->userRoles) {
            $res['user_roles'] = [];
            if (null !== $this->userRoles && \is_array($this->userRoles)) {
                $n = 0;
                foreach ($this->userRoles as $item) {
                    $res['user_roles'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ACSUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['expired'])) {
            $model->expired = $map['expired'];
        }
        if (isset($map['disabled'])) {
            $model->disabled = $map['disabled'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['user_roles'])) {
            if (!empty($map['user_roles'])) {
                $model->userRoles = [];
                $n                = 0;
                foreach ($map['user_roles'] as $item) {
                    $model->userRoles[$n++] = null !== $item ? ACSUserRole::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }

        return $model;
    }
}
