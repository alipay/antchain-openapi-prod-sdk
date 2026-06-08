<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class CutToMessage extends Model
{
    // 【可用优惠的商品最高单价】 可用优惠的商品最高单价，单位：分。
    /**
     * @example 100
     *
     * @var int
     */
    public $singlePriceMax;

    // 【减至后的优惠单价】 减至后的优惠单价，单位：分。
    /**
     * @example 80
     *
     * @var int
     */
    public $cutToPrice;
    protected $_name = [
        'singlePriceMax' => 'single_price_max',
        'cutToPrice'     => 'cut_to_price',
    ];

    public function validate()
    {
        Model::validateRequired('singlePriceMax', $this->singlePriceMax, true);
        Model::validateRequired('cutToPrice', $this->cutToPrice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->singlePriceMax) {
            $res['single_price_max'] = $this->singlePriceMax;
        }
        if (null !== $this->cutToPrice) {
            $res['cut_to_price'] = $this->cutToPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CutToMessage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['single_price_max'])) {
            $model->singlePriceMax = $map['single_price_max'];
        }
        if (isset($map['cut_to_price'])) {
            $model->cutToPrice = $map['cut_to_price'];
        }

        return $model;
    }
}
