<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class PrizeList extends Model
{
    // 对客展示信息
    /**
     * @example undefined
     *
     * @var DisplayInfo
     */
    public $displayInfo;

    // 定价策略
    /**
     * @example undefined
     *
     * @var PriceStrategy
     */
    public $priceStrategy;

    // 奖品基本信息
    /**
     * @example undefined
     *
     * @var PrizeBaseInfo
     */
    public $prizeBaseInfo;
    protected $_name = [
        'displayInfo'   => 'display_info',
        'priceStrategy' => 'price_strategy',
        'prizeBaseInfo' => 'prize_base_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->displayInfo) {
            $res['display_info'] = null !== $this->displayInfo ? $this->displayInfo->toMap() : null;
        }
        if (null !== $this->priceStrategy) {
            $res['price_strategy'] = null !== $this->priceStrategy ? $this->priceStrategy->toMap() : null;
        }
        if (null !== $this->prizeBaseInfo) {
            $res['prize_base_info'] = null !== $this->prizeBaseInfo ? $this->prizeBaseInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PrizeList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display_info'])) {
            $model->displayInfo = DisplayInfo::fromMap($map['display_info']);
        }
        if (isset($map['price_strategy'])) {
            $model->priceStrategy = PriceStrategy::fromMap($map['price_strategy']);
        }
        if (isset($map['prize_base_info'])) {
            $model->prizeBaseInfo = PrizeBaseInfo::fromMap($map['prize_base_info']);
        }

        return $model;
    }
}
