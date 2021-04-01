<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpSkuEmphasisInfo extends Model
{
    // 价格区间，不做校验
    /**
     * @example x x x x x
     *
     * @var string
     */
    public $priceRange;

    // 单价
    /**
     * @example 1.1
     *
     * @var string
     */
    public $purchasePrice;

    // 套餐数量
    /**
     * @example 1111
     *
     * @var string
     */
    public $saleNum;
    protected $_name = [
        'priceRange'    => 'price_range',
        'purchasePrice' => 'purchase_price',
        'saleNum'       => 'sale_num',
    ];

    public function validate()
    {
        Model::validateRequired('priceRange', $this->priceRange, true);
        Model::validateRequired('purchasePrice', $this->purchasePrice, true);
        Model::validateRequired('saleNum', $this->saleNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->priceRange) {
            $res['price_range'] = $this->priceRange;
        }
        if (null !== $this->purchasePrice) {
            $res['purchase_price'] = $this->purchasePrice;
        }
        if (null !== $this->saleNum) {
            $res['sale_num'] = $this->saleNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpSkuEmphasisInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['price_range'])) {
            $model->priceRange = $map['price_range'];
        }
        if (isset($map['purchase_price'])) {
            $model->purchasePrice = $map['purchase_price'];
        }
        if (isset($map['sale_num'])) {
            $model->saleNum = $map['sale_num'];
        }

        return $model;
    }
}
