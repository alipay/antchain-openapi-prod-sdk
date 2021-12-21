<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPTradeMode extends Model
{
    // 交易类型，0：销售抽拥；1:按件付费
    /**
     * @example 0
     *
     * @var int[]
     */
    public $tradeType;

    // 佣金比例
    /**
     * @example 0.1
     *
     * @var string
     */
    public $commissionWeight;

    // 保底商品销售金额
    /**
     * @example 1000000
     *
     * @var string
     */
    public $guaranteeSaleNumber;

    // 单件单价
    /**
     * @example 12
     *
     * @var string
     */
    public $unitPrice;

    // 保底商品数量
    /**
     * @example 20000
     *
     * @var string
     */
    public $guaranteeGoodsNumber;
    protected $_name = [
        'tradeType'            => 'trade_type',
        'commissionWeight'     => 'commission_weight',
        'guaranteeSaleNumber'  => 'guarantee_sale_number',
        'unitPrice'            => 'unit_price',
        'guaranteeGoodsNumber' => 'guarantee_goods_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tradeType) {
            $res['trade_type'] = $this->tradeType;
        }
        if (null !== $this->commissionWeight) {
            $res['commission_weight'] = $this->commissionWeight;
        }
        if (null !== $this->guaranteeSaleNumber) {
            $res['guarantee_sale_number'] = $this->guaranteeSaleNumber;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }
        if (null !== $this->guaranteeGoodsNumber) {
            $res['guarantee_goods_number'] = $this->guaranteeGoodsNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPTradeMode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trade_type'])) {
            if (!empty($map['trade_type'])) {
                $model->tradeType = $map['trade_type'];
            }
        }
        if (isset($map['commission_weight'])) {
            $model->commissionWeight = $map['commission_weight'];
        }
        if (isset($map['guarantee_sale_number'])) {
            $model->guaranteeSaleNumber = $map['guarantee_sale_number'];
        }
        if (isset($map['unit_price'])) {
            $model->unitPrice = $map['unit_price'];
        }
        if (isset($map['guarantee_goods_number'])) {
            $model->guaranteeGoodsNumber = $map['guarantee_goods_number'];
        }

        return $model;
    }
}
