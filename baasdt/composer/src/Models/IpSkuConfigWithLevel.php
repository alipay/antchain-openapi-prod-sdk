<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpSkuConfigWithLevel extends Model
{
    // 价格区间
    /**
     * @example 1-100
     *
     * @var string
     */
    public $priceRange;

    // 单价
    /**
     * @example 111
     *
     * @var string
     */
    public $purchasePrice;

    // 销售数量
    /**
     * @example 1111
     *
     * @var int
     */
    public $saleNum;

    // ip等级
    /**
     * @example
     *
     * @var int
     */
    public $ipLevel;
    protected $_name = [
        'priceRange'    => 'price_range',
        'purchasePrice' => 'purchase_price',
        'saleNum'       => 'sale_num',
        'ipLevel'       => 'ip_level',
    ];

    public function validate()
    {
        Model::validateRequired('priceRange', $this->priceRange, true);
        Model::validateRequired('purchasePrice', $this->purchasePrice, true);
        Model::validateRequired('saleNum', $this->saleNum, true);
        Model::validateRequired('ipLevel', $this->ipLevel, true);
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
        if (null !== $this->ipLevel) {
            $res['ip_level'] = $this->ipLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpSkuConfigWithLevel
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
        if (isset($map['ip_level'])) {
            $model->ipLevel = $map['ip_level'];
        }

        return $model;
    }
}
