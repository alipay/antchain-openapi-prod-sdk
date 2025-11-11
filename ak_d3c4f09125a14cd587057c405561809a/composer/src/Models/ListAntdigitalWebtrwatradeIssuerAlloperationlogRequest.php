<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class ListAntdigitalWebtrwatradeIssuerAlloperationlogRequest extends Model
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

    // 操作员用户id
    /**
     * @var string
     */
    public $userId;

    // 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    /**
     * @var string
     */
    public $userAddress;

    // 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    /**
     * @var string
     */
    public $loginAccountType;

    // 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    /**
     * @var string
     */
    public $loginAccount;

    // 开始时间 (时间戳)
    /**
     * @var int
     */
    public $startTimeMills;

    // 结束时间 (时间戳)
    /**
     * @var int
     */
    public $endTimeMills;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'userAddress'       => 'user_address',
        'loginAccountType'  => 'login_account_type',
        'loginAccount'      => 'login_account',
        'startTimeMills'    => 'start_time_mills',
        'endTimeMills'      => 'end_time_mills',
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
        if (null !== $this->loginAccountType) {
            $res['login_account_type'] = $this->loginAccountType;
        }
        if (null !== $this->loginAccount) {
            $res['login_account'] = $this->loginAccount;
        }
        if (null !== $this->startTimeMills) {
            $res['start_time_mills'] = $this->startTimeMills;
        }
        if (null !== $this->endTimeMills) {
            $res['end_time_mills'] = $this->endTimeMills;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAntdigitalWebtrwatradeIssuerAlloperationlogRequest
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
        if (isset($map['login_account_type'])) {
            $model->loginAccountType = $map['login_account_type'];
        }
        if (isset($map['login_account'])) {
            $model->loginAccount = $map['login_account'];
        }
        if (isset($map['start_time_mills'])) {
            $model->startTimeMills = $map['start_time_mills'];
        }
        if (isset($map['end_time_mills'])) {
            $model->endTimeMills = $map['end_time_mills'];
        }

        return $model;
    }
}
