<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class AuthAgreement extends Model
{
    // 授权协议code
    /**
     * @example 000000000001
     *
     * @var string
     */
    public $authAgreementCode;

    // 授权协议类型：
    // TIME、时间授权
    // COUNT、次数授权
    // TIME_COUNT、时间范围内次数授权
    /**
     * @example TIME
     *
     * @var string
     */
    public $authAgreementType;

    // 授权开始ishi见
    /**
     * @example 2020-07-24 03:07:50
     *
     * @var string
     */
    public $authBeginTime;

    // 授权截止日期
    //
    //
    /**
     * @example 2020-07-24 03:07:50
     *
     * @var string
     */
    public $authEndTime;

    // 授权次数
    //
    //
    /**
     * @example 10
     *
     * @var int
     */
    public $authCount;

    // 剩余授权次数
    /**
     * @example 1
     *
     * @var int
     */
    public $authBalanceCount;
    protected $_name = [
        'authAgreementCode' => 'auth_agreement_code',
        'authAgreementType' => 'auth_agreement_type',
        'authBeginTime'     => 'auth_begin_time',
        'authEndTime'       => 'auth_end_time',
        'authCount'         => 'auth_count',
        'authBalanceCount'  => 'auth_balance_count',
    ];

    public function validate()
    {
        Model::validateRequired('authAgreementCode', $this->authAgreementCode, true);
        Model::validateRequired('authAgreementType', $this->authAgreementType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authAgreementCode) {
            $res['auth_agreement_code'] = $this->authAgreementCode;
        }
        if (null !== $this->authAgreementType) {
            $res['auth_agreement_type'] = $this->authAgreementType;
        }
        if (null !== $this->authBeginTime) {
            $res['auth_begin_time'] = $this->authBeginTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->authCount) {
            $res['auth_count'] = $this->authCount;
        }
        if (null !== $this->authBalanceCount) {
            $res['auth_balance_count'] = $this->authBalanceCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAgreement
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_agreement_code'])) {
            $model->authAgreementCode = $map['auth_agreement_code'];
        }
        if (isset($map['auth_agreement_type'])) {
            $model->authAgreementType = $map['auth_agreement_type'];
        }
        if (isset($map['auth_begin_time'])) {
            $model->authBeginTime = $map['auth_begin_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['auth_count'])) {
            $model->authCount = $map['auth_count'];
        }
        if (isset($map['auth_balance_count'])) {
            $model->authBalanceCount = $map['auth_balance_count'];
        }

        return $model;
    }
}
