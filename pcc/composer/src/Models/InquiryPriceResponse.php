<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class InquiryPriceResponse extends Model
{
    // 高精度12位价格
    /**
     * @example test
     *
     * @var string
     */
    public $price;

    // 币种
    /**
     * @example test
     *
     * @var string
     */
    public $currency;

    // BD销售价格(高精度12位)
    /**
     * @example test
     *
     * @var string
     */
    public $bdPrice;

    // 最低成本价(高精度12位)
    /**
     * @example test
     *
     * @var string
     */
    public $costPrice;

    // 收费项结果明细列表
    /**
     * @example test
     *
     * @var PriceObjectFee[]
     */
    public $priceObjectFeeList;
    protected $_name = [
        'price'              => 'price',
        'currency'           => 'currency',
        'bdPrice'            => 'bd_price',
        'costPrice'          => 'cost_price',
        'priceObjectFeeList' => 'price_object_fee_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->bdPrice) {
            $res['bd_price'] = $this->bdPrice;
        }
        if (null !== $this->costPrice) {
            $res['cost_price'] = $this->costPrice;
        }
        if (null !== $this->priceObjectFeeList) {
            $res['price_object_fee_list'] = [];
            if (null !== $this->priceObjectFeeList && \is_array($this->priceObjectFeeList)) {
                $n = 0;
                foreach ($this->priceObjectFeeList as $item) {
                    $res['price_object_fee_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InquiryPriceResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['bd_price'])) {
            $model->bdPrice = $map['bd_price'];
        }
        if (isset($map['cost_price'])) {
            $model->costPrice = $map['cost_price'];
        }
        if (isset($map['price_object_fee_list'])) {
            if (!empty($map['price_object_fee_list'])) {
                $model->priceObjectFeeList = [];
                $n                         = 0;
                foreach ($map['price_object_fee_list'] as $item) {
                    $model->priceObjectFeeList[$n++] = null !== $item ? PriceObjectFee::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
