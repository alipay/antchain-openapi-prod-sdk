<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcMonthData extends Model
{
    // 月份格式为YYYYMM
    /**
     * @example 202210
     *
     * @var string
     */
    public $month;

    // 实际结算金额/销售收入 单位：元，格式：数字，小数点后两位
    /**
     * @example 22300000.00
     *
     * @var int
     */
    public $purchaseAmount;

    // GMV，单位：元，格式：数字，小数点后两位
    /**
     * @example 22300000.00
     *
     * @var int
     */
    public $gmv;

    // 退货率。单位：%，格式：数字，小数点后两位
    /**
     * @example 3.08
     *
     * @var int
     */
    public $retRate;
    protected $_name = [
        'month'          => 'month',
        'purchaseAmount' => 'purchase_amount',
        'gmv'            => 'gmv',
        'retRate'        => 'ret_rate',
    ];

    public function validate()
    {
        Model::validateRequired('month', $this->month, true);
        Model::validateRequired('purchaseAmount', $this->purchaseAmount, true);
        Model::validateRequired('gmv', $this->gmv, true);
        Model::validateRequired('retRate', $this->retRate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }
        if (null !== $this->purchaseAmount) {
            $res['purchase_amount'] = $this->purchaseAmount;
        }
        if (null !== $this->gmv) {
            $res['gmv'] = $this->gmv;
        }
        if (null !== $this->retRate) {
            $res['ret_rate'] = $this->retRate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcMonthData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }
        if (isset($map['purchase_amount'])) {
            $model->purchaseAmount = $map['purchase_amount'];
        }
        if (isset($map['gmv'])) {
            $model->gmv = $map['gmv'];
        }
        if (isset($map['ret_rate'])) {
            $model->retRate = $map['ret_rate'];
        }

        return $model;
    }
}
