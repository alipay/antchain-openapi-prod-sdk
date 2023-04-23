<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureQuotationOfferPrice extends Model
{
    // 定价条件
    /**
     * @example
     *
     * @var ExpenditureQuotationOfferPriceConditionAttr[]
     */
    public $conditionAttrs;

    // 阶梯起始值
    /**
     * @example 0
     *
     * @var string
     */
    public $ladderStart;

    // 阶梯结束值
    /**
     * @example infinity
     *
     * @var string
     */
    public $ladderEnd;

    // 价格
    /**
     * @example 1
     *
     * @var string
     */
    public $price;

    // 币种
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;
    protected $_name = [
        'conditionAttrs' => 'condition_attrs',
        'ladderStart'    => 'ladder_start',
        'ladderEnd'      => 'ladder_end',
        'price'          => 'price',
        'currency'       => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('ladderStart', $this->ladderStart, true);
        Model::validateRequired('ladderEnd', $this->ladderEnd, true);
        Model::validateRequired('price', $this->price, true);
        Model::validateRequired('currency', $this->currency, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->conditionAttrs) {
            $res['condition_attrs'] = [];
            if (null !== $this->conditionAttrs && \is_array($this->conditionAttrs)) {
                $n = 0;
                foreach ($this->conditionAttrs as $item) {
                    $res['condition_attrs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ladderStart) {
            $res['ladder_start'] = $this->ladderStart;
        }
        if (null !== $this->ladderEnd) {
            $res['ladder_end'] = $this->ladderEnd;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureQuotationOfferPrice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['condition_attrs'])) {
            if (!empty($map['condition_attrs'])) {
                $model->conditionAttrs = [];
                $n                     = 0;
                foreach ($map['condition_attrs'] as $item) {
                    $model->conditionAttrs[$n++] = null !== $item ? ExpenditureQuotationOfferPriceConditionAttr::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ladder_start'])) {
            $model->ladderStart = $map['ladder_start'];
        }
        if (isset($map['ladder_end'])) {
            $model->ladderEnd = $map['ladder_end'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
