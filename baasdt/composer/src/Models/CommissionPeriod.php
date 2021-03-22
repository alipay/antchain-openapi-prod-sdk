<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CommissionPeriod extends Model
{
    // 手续费费率
    /**
     * @example 0.0001
     *
     * @var string
     */
    public $deductRatio;

    // 手续费子结构
    /**
     * @example
     *
     * @var SubCommissionRule[]
     */
    public $subCommissionRules;

    // 买家的历史统计做阶梯计费，最多50个
    /**
     * @example
     *
     * @var CommissionLayer[]
     */
    public $merchantLayers;

    // 商品阶梯
    /**
     * @example
     *
     * @var CommissionLayer[]
     */
    public $goodsLayers;

    // 手续费开始时间（无结束时间）
    /**
     * @example
     *
     * @var int
     */
    public $startTimeMills;

    // 0: txcount（成功的交易）; 1: 累计交易金额; 2:累计手续费; 3：单笔金额, ...
    /**
     * @example
     *
     * @var int
     */
    public $layerType;

    // 分层的周期，（0是月，1是日，2是年（这期不用，需要设置一下）, 3是季度）
    /**
     * @example
     *
     * @var int
     */
    public $counterTimeType;

    // 商品固定费用
    /**
     * @example 10
     *
     * @var string
     */
    public $deductToken;
    protected $_name = [
        'deductRatio'        => 'deduct_ratio',
        'subCommissionRules' => 'sub_commission_rules',
        'merchantLayers'     => 'merchant_layers',
        'goodsLayers'        => 'goods_layers',
        'startTimeMills'     => 'start_time_mills',
        'layerType'          => 'layer_type',
        'counterTimeType'    => 'counter_time_type',
        'deductToken'        => 'deduct_token',
    ];

    public function validate()
    {
        Model::validateRequired('deductRatio', $this->deductRatio, true);
        Model::validateRequired('subCommissionRules', $this->subCommissionRules, true);
        Model::validateRequired('merchantLayers', $this->merchantLayers, true);
        Model::validateRequired('goodsLayers', $this->goodsLayers, true);
        Model::validateRequired('startTimeMills', $this->startTimeMills, true);
        Model::validateRequired('layerType', $this->layerType, true);
        Model::validateRequired('counterTimeType', $this->counterTimeType, true);
        Model::validateRequired('deductToken', $this->deductToken, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deductRatio) {
            $res['deduct_ratio'] = $this->deductRatio;
        }
        if (null !== $this->subCommissionRules) {
            $res['sub_commission_rules'] = [];
            if (null !== $this->subCommissionRules && \is_array($this->subCommissionRules)) {
                $n = 0;
                foreach ($this->subCommissionRules as $item) {
                    $res['sub_commission_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->merchantLayers) {
            $res['merchant_layers'] = [];
            if (null !== $this->merchantLayers && \is_array($this->merchantLayers)) {
                $n = 0;
                foreach ($this->merchantLayers as $item) {
                    $res['merchant_layers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->goodsLayers) {
            $res['goods_layers'] = [];
            if (null !== $this->goodsLayers && \is_array($this->goodsLayers)) {
                $n = 0;
                foreach ($this->goodsLayers as $item) {
                    $res['goods_layers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startTimeMills) {
            $res['start_time_mills'] = $this->startTimeMills;
        }
        if (null !== $this->layerType) {
            $res['layer_type'] = $this->layerType;
        }
        if (null !== $this->counterTimeType) {
            $res['counter_time_type'] = $this->counterTimeType;
        }
        if (null !== $this->deductToken) {
            $res['deduct_token'] = $this->deductToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommissionPeriod
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deduct_ratio'])) {
            $model->deductRatio = $map['deduct_ratio'];
        }
        if (isset($map['sub_commission_rules'])) {
            if (!empty($map['sub_commission_rules'])) {
                $model->subCommissionRules = [];
                $n                         = 0;
                foreach ($map['sub_commission_rules'] as $item) {
                    $model->subCommissionRules[$n++] = null !== $item ? SubCommissionRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['merchant_layers'])) {
            if (!empty($map['merchant_layers'])) {
                $model->merchantLayers = [];
                $n                     = 0;
                foreach ($map['merchant_layers'] as $item) {
                    $model->merchantLayers[$n++] = null !== $item ? CommissionLayer::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['goods_layers'])) {
            if (!empty($map['goods_layers'])) {
                $model->goodsLayers = [];
                $n                  = 0;
                foreach ($map['goods_layers'] as $item) {
                    $model->goodsLayers[$n++] = null !== $item ? CommissionLayer::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_time_mills'])) {
            $model->startTimeMills = $map['start_time_mills'];
        }
        if (isset($map['layer_type'])) {
            $model->layerType = $map['layer_type'];
        }
        if (isset($map['counter_time_type'])) {
            $model->counterTimeType = $map['counter_time_type'];
        }
        if (isset($map['deduct_token'])) {
            $model->deductToken = $map['deduct_token'];
        }

        return $model;
    }
}
