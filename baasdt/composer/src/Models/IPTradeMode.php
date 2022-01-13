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

    // 销售抽拥设置类型，0批量设置，1，单独设置
    /**
     * @example 0
     *
     * @var string
     */
    public $commissionSetType;

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

    // 销售抽佣单独设置信息
    /**
     * @example
     *
     * @var IPCommissionSeparateSetInfo[]
     */
    public $commissionSeparateSetInfo;

    // 按件付费设置类型，0批量设置，1，单独设置
    /**
     * @example 0
     *
     * @var string
     */
    public $paytSetType;

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

    // 按件付费单独设置信息
    /**
     * @example
     *
     * @var IPPaytSeparateSetInfo[]
     */
    public $paytSeparateSetInfo;
    protected $_name = [
        'tradeType'                 => 'trade_type',
        'commissionSetType'         => 'commission_set_type',
        'commissionWeight'          => 'commission_weight',
        'guaranteeSaleNumber'       => 'guarantee_sale_number',
        'commissionSeparateSetInfo' => 'commission_separate_set_info',
        'paytSetType'               => 'payt_set_type',
        'unitPrice'                 => 'unit_price',
        'guaranteeGoodsNumber'      => 'guarantee_goods_number',
        'paytSeparateSetInfo'       => 'payt_separate_set_info',
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
        if (null !== $this->commissionSetType) {
            $res['commission_set_type'] = $this->commissionSetType;
        }
        if (null !== $this->commissionWeight) {
            $res['commission_weight'] = $this->commissionWeight;
        }
        if (null !== $this->guaranteeSaleNumber) {
            $res['guarantee_sale_number'] = $this->guaranteeSaleNumber;
        }
        if (null !== $this->commissionSeparateSetInfo) {
            $res['commission_separate_set_info'] = [];
            if (null !== $this->commissionSeparateSetInfo && \is_array($this->commissionSeparateSetInfo)) {
                $n = 0;
                foreach ($this->commissionSeparateSetInfo as $item) {
                    $res['commission_separate_set_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->paytSetType) {
            $res['payt_set_type'] = $this->paytSetType;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }
        if (null !== $this->guaranteeGoodsNumber) {
            $res['guarantee_goods_number'] = $this->guaranteeGoodsNumber;
        }
        if (null !== $this->paytSeparateSetInfo) {
            $res['payt_separate_set_info'] = [];
            if (null !== $this->paytSeparateSetInfo && \is_array($this->paytSeparateSetInfo)) {
                $n = 0;
                foreach ($this->paytSeparateSetInfo as $item) {
                    $res['payt_separate_set_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (isset($map['commission_set_type'])) {
            $model->commissionSetType = $map['commission_set_type'];
        }
        if (isset($map['commission_weight'])) {
            $model->commissionWeight = $map['commission_weight'];
        }
        if (isset($map['guarantee_sale_number'])) {
            $model->guaranteeSaleNumber = $map['guarantee_sale_number'];
        }
        if (isset($map['commission_separate_set_info'])) {
            if (!empty($map['commission_separate_set_info'])) {
                $model->commissionSeparateSetInfo = [];
                $n                                = 0;
                foreach ($map['commission_separate_set_info'] as $item) {
                    $model->commissionSeparateSetInfo[$n++] = null !== $item ? IPCommissionSeparateSetInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['payt_set_type'])) {
            $model->paytSetType = $map['payt_set_type'];
        }
        if (isset($map['unit_price'])) {
            $model->unitPrice = $map['unit_price'];
        }
        if (isset($map['guarantee_goods_number'])) {
            $model->guaranteeGoodsNumber = $map['guarantee_goods_number'];
        }
        if (isset($map['payt_separate_set_info'])) {
            if (!empty($map['payt_separate_set_info'])) {
                $model->paytSeparateSetInfo = [];
                $n                          = 0;
                foreach ($map['payt_separate_set_info'] as $item) {
                    $model->paytSeparateSetInfo[$n++] = null !== $item ? IPPaytSeparateSetInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
