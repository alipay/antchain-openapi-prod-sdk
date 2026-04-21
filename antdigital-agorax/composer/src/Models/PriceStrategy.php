<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class PriceStrategy extends Model
{
    // 定价策略类型
    /**
     * @example FIXED
     *
     * @var string
     */
    public $strategyType;

    // 策略值
    /**
     * @example 110000199001011234
     *
     * @var string
     */
    public $strategyValue;

    // 最小金额（单位：分）
    /**
     * @example 6.22
     *
     * @var int
     */
    public $minPrice;

    // 最大金额（单位：分）
    /**
     * @example 45.22
     *
     * @var int
     */
    public $maxPrice;

    // 门槛金额（单位：分）
    /**
     * @example 21.55
     *
     * @var int
     */
    public $threshold;

    // 门槛类型
    /**
     * @example 074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5
     *
     * @var string
     */
    public $thresholdType;
    protected $_name = [
        'strategyType'  => 'strategy_type',
        'strategyValue' => 'strategy_value',
        'minPrice'      => 'min_price',
        'maxPrice'      => 'max_price',
        'threshold'     => 'threshold',
        'thresholdType' => 'threshold_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->strategyType) {
            $res['strategy_type'] = $this->strategyType;
        }
        if (null !== $this->strategyValue) {
            $res['strategy_value'] = $this->strategyValue;
        }
        if (null !== $this->minPrice) {
            $res['min_price'] = $this->minPrice;
        }
        if (null !== $this->maxPrice) {
            $res['max_price'] = $this->maxPrice;
        }
        if (null !== $this->threshold) {
            $res['threshold'] = $this->threshold;
        }
        if (null !== $this->thresholdType) {
            $res['threshold_type'] = $this->thresholdType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['strategy_type'])) {
            $model->strategyType = $map['strategy_type'];
        }
        if (isset($map['strategy_value'])) {
            $model->strategyValue = $map['strategy_value'];
        }
        if (isset($map['min_price'])) {
            $model->minPrice = $map['min_price'];
        }
        if (isset($map['max_price'])) {
            $model->maxPrice = $map['max_price'];
        }
        if (isset($map['threshold'])) {
            $model->threshold = $map['threshold'];
        }
        if (isset($map['threshold_type'])) {
            $model->thresholdType = $map['threshold_type'];
        }

        return $model;
    }
}
