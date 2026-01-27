<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class TransactionDetail extends Model
{
    // 交易类型：RECHARGE 入金，TRANSFER 划拨 ，WITHDRAW 出金
    /**
     * @example RECHARGE
     *
     * @var string
     */
    public $transType;

    // 余额方向：CR-贷款（收入）/ DR-借款（支出）
    /**
     * @example CR
     *
     * @var string
     */
    public $direction;

    // 币种 CNY人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $ccy;

    // 交易金额，单位：元，整数部分最长10位数，保留两位小数
    /**
     * @example 1.11
     *
     * @var string
     */
    public $amount;

    // 交易后余额，单位：元，整数部分最长10位数，保留两位小数
    /**
     * @example 2.22
     *
     * @var string
     */
    public $afterAmount;

    // 创建时间，格式为：yyyy-MM-dd HH:mm:ss
    /**
     * @example 2026-01-15 09:10:11
     *
     * @var string
     */
    public $creatTime;

    // SHARE-分账
    // OFFSET_SHARE-差额分账
    // REFUND-退款
    // TRANSFER-转账
    // WITHDRAW-提现
    // CLEAR-资金清算
    // OTHER-其他
    // WITHDRAW_CANCEL-提现退回
    /**
     * @example SHARE
     *
     * @var string
     */
    public $businessType;
    protected $_name = [
        'transType'    => 'trans_type',
        'direction'    => 'direction',
        'ccy'          => 'ccy',
        'amount'       => 'amount',
        'afterAmount'  => 'after_amount',
        'creatTime'    => 'creat_time',
        'businessType' => 'business_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transType) {
            $res['trans_type'] = $this->transType;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->afterAmount) {
            $res['after_amount'] = $this->afterAmount;
        }
        if (null !== $this->creatTime) {
            $res['creat_time'] = $this->creatTime;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trans_type'])) {
            $model->transType = $map['trans_type'];
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }
        if (isset($map['ccy'])) {
            $model->ccy = $map['ccy'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['after_amount'])) {
            $model->afterAmount = $map['after_amount'];
        }
        if (isset($map['creat_time'])) {
            $model->creatTime = $map['creat_time'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }

        return $model;
    }
}
