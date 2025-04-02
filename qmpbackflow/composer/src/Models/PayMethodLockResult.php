<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PayMethodLockResult extends Model
{
    // 签约结果
    /**
     * @example 0、1
     *
     * @var string
     */
    public $signStatus;

    // 账号
    /**
     * @example userId
     *
     * @var string
     */
    public $accountId;

    // 登录号
    /**
     * @example userIdA
     *
     * @var string
     */
    public $loginId;

    // 支付公司
    /**
     * @example AliPay
     *
     * @var string
     */
    public $payChannel;

    // 绑定账号名称
    /**
     * @example someName
     *
     * @var string
     */
    public $accountName;
    protected $_name = [
        'signStatus'  => 'sign_status',
        'accountId'   => 'account_id',
        'loginId'     => 'login_id',
        'payChannel'  => 'pay_channel',
        'accountName' => 'account_name',
    ];

    public function validate()
    {
        Model::validateRequired('signStatus', $this->signStatus, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validateRequired('accountName', $this->accountName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayMethodLockResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }

        return $model;
    }
}
