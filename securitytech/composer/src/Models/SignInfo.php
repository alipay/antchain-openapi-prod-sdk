<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SignInfo extends Model
{
    // 司机证件号
    /**
     * @example 310681200001017789
     *
     * @var string
     */
    public $employeeCertNo;

    // 灵工卡号
    /**
     * @example 111222190002309999
     *
     * @var string
     */
    public $employeeCardNo;

    // 借贷专户ID，用于后续资金相关操作
    /**
     * @example 111222190002309999
     *
     * @var string
     */
    public $accountBookId;

    // 签约状态，枚举值
    // ● SIGNED：已签约【灵工卡状态正常，可入金出金】
    // ● TERMINATED：已解约【不可入金出金】
    /**
     * @example SIGNED
     *
     * @var string
     */
    public $status;

    // 签约时间 "yyyy-MM-dd HH:mm:ss"
    /**
     * @example 2000-10-10 00:00:00
     *
     * @var string
     */
    public $signTime;

    // 解约时间 "yyyy-MM-dd HH:mm:ss"
    /**
     * @example 2000-10-10 00:00:00
     *
     * @var string
     */
    public $terminateTime;

    // 签约协议生效时间
    /**
     * @example 2000-10-10 00:00:00
     *
     * @var string
     */
    public $effectTime;

    // 签约协议解约时间
    /**
     * @example 2000-10-10 00:00:00
     *
     * @var string
     */
    public $expireTime;

    // 月租金额：单位为元
    /**
     * @example 100
     *
     * @var string
     */
    public $paymentAmount;
    protected $_name = [
        'employeeCertNo' => 'employee_cert_no',
        'employeeCardNo' => 'employee_card_no',
        'accountBookId'  => 'account_book_id',
        'status'         => 'status',
        'signTime'       => 'sign_time',
        'terminateTime'  => 'terminate_time',
        'effectTime'     => 'effect_time',
        'expireTime'     => 'expire_time',
        'paymentAmount'  => 'payment_amount',
    ];

    public function validate()
    {
        Model::validateRequired('employeeCertNo', $this->employeeCertNo, true);
        Model::validateRequired('employeeCardNo', $this->employeeCardNo, true);
        Model::validateRequired('accountBookId', $this->accountBookId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('effectTime', $this->effectTime, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validateRequired('paymentAmount', $this->paymentAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->employeeCertNo) {
            $res['employee_cert_no'] = $this->employeeCertNo;
        }
        if (null !== $this->employeeCardNo) {
            $res['employee_card_no'] = $this->employeeCardNo;
        }
        if (null !== $this->accountBookId) {
            $res['account_book_id'] = $this->accountBookId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->terminateTime) {
            $res['terminate_time'] = $this->terminateTime;
        }
        if (null !== $this->effectTime) {
            $res['effect_time'] = $this->effectTime;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['employee_cert_no'])) {
            $model->employeeCertNo = $map['employee_cert_no'];
        }
        if (isset($map['employee_card_no'])) {
            $model->employeeCardNo = $map['employee_card_no'];
        }
        if (isset($map['account_book_id'])) {
            $model->accountBookId = $map['account_book_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['terminate_time'])) {
            $model->terminateTime = $map['terminate_time'];
        }
        if (isset($map['effect_time'])) {
            $model->effectTime = $map['effect_time'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }

        return $model;
    }
}
