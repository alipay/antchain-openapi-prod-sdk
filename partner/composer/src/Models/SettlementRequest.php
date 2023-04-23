<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class SettlementRequest extends Model
{
    // 结算方式：
    // 企业支付宝账号 Alipay
    // 银行卡账号 BankCard
    /**
     * @example Alipay
     *
     * @var string
     */
    public $payType;

    // 银行卡账号
    /**
     * @example 银行卡账号
     *
     * @var string
     */
    public $bankNo;

    // 银行卡用户名称
    /**
     * @example 银行卡用户名称
     *
     * @var string
     */
    public $bankAccountName;

    // 银行支行名称
    /**
     * @example 银行支行名称
     *
     * @var string
     */
    public $bankBranchName;

    // 支付宝账号
    /**
     * @example 支付宝账号
     *
     * @var string
     */
    public $alipayAccount;
    protected $_name = [
        'payType'         => 'pay_type',
        'bankNo'          => 'bank_no',
        'bankAccountName' => 'bank_account_name',
        'bankBranchName'  => 'bank_branch_name',
        'alipayAccount'   => 'alipay_account',
    ];

    public function validate()
    {
        Model::validateRequired('payType', $this->payType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->bankAccountName) {
            $res['bank_account_name'] = $this->bankAccountName;
        }
        if (null !== $this->bankBranchName) {
            $res['bank_branch_name'] = $this->bankBranchName;
        }
        if (null !== $this->alipayAccount) {
            $res['alipay_account'] = $this->alipayAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettlementRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['bank_account_name'])) {
            $model->bankAccountName = $map['bank_account_name'];
        }
        if (isset($map['bank_branch_name'])) {
            $model->bankBranchName = $map['bank_branch_name'];
        }
        if (isset($map['alipay_account'])) {
            $model->alipayAccount = $map['alipay_account'];
        }

        return $model;
    }
}
