<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class LoginOperationLogVO extends Model
{
    // 用户ID
    /**
     * @example 7
     *
     * @var string
     */
    public $userId;

    // 用户地址
    /**
     * @example 0xe328b8785ff0c1ecb2b52198f5637cc1fdabab20
     *
     * @var string
     */
    public $userAddress;

    // 登录名
    /**
     * @example 123@qq.com
     *
     * @var string
     */
    public $loginName;

    // 登录类型
    /**
     * @example EMAIL
     *
     * @var string
     */
    public $loginAccountType;

    // 请求URL
    /**
     * @example /api/v1/trade/ip/user/login-account/login
     *
     * @var string
     */
    public $requestURL;

    // 是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreated;
    protected $_name = [
        'userId'           => 'user_id',
        'userAddress'      => 'user_address',
        'loginName'        => 'login_name',
        'loginAccountType' => 'login_account_type',
        'requestURL'       => 'request_u_r_l',
        'success'          => 'success',
        'gmtCreated'       => 'gmt_created',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('requestURL', $this->requestURL, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->requestURL) {
            $res['request_u_r_l'] = $this->requestURL;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoginOperationLogVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['request_u_r_l'])) {
            $model->requestURL = $map['request_u_r_l'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }

        return $model;
    }
}
