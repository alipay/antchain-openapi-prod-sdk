<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ReparationsInfo extends Model
{
    // 平台赔款支付流水号
    /**
     * @example 2023112222332xxxx
     *
     * @var string
     */
    public $paymentNo;

    // 平台赔款支付金额
    /**
     * @example 12.32
     *
     * @var string
     */
    public $paymentAmount;

    // 平台是否放弃货物所有权。Y:是，N:否
    /**
     * @example Y
     *
     * @var string
     */
    public $relinquishGoods;

    // 退货本身是否高于货物本身价值。Y:是，N:否
    /**
     * @example Y
     *
     * @var string
     */
    public $returnOverValue;
    protected $_name = [
        'paymentNo'       => 'payment_no',
        'paymentAmount'   => 'payment_amount',
        'relinquishGoods' => 'relinquish_goods',
        'returnOverValue' => 'return_over_value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->paymentNo) {
            $res['payment_no'] = $this->paymentNo;
        }
        if (null !== $this->paymentAmount) {
            $res['payment_amount'] = $this->paymentAmount;
        }
        if (null !== $this->relinquishGoods) {
            $res['relinquish_goods'] = $this->relinquishGoods;
        }
        if (null !== $this->returnOverValue) {
            $res['return_over_value'] = $this->returnOverValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReparationsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['payment_no'])) {
            $model->paymentNo = $map['payment_no'];
        }
        if (isset($map['payment_amount'])) {
            $model->paymentAmount = $map['payment_amount'];
        }
        if (isset($map['relinquish_goods'])) {
            $model->relinquishGoods = $map['relinquish_goods'];
        }
        if (isset($map['return_over_value'])) {
            $model->returnOverValue = $map['return_over_value'];
        }

        return $model;
    }
}
