<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GoodSkuInfo extends Model
{
    // 授权规格序号
    /**
     * @example 001
     *
     * @var string
     */
    public $skuNum;

    // 授权规格价格(单位：分)
    /**
     * @example 10
     *
     * @var int
     */
    public $price;
    protected $_name = [
        'skuNum' => 'sku_num',
        'price'  => 'price',
    ];

    public function validate()
    {
        Model::validateRequired('skuNum', $this->skuNum, true);
        Model::validateRequired('price', $this->price, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->skuNum) {
            $res['sku_num'] = $this->skuNum;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodSkuInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sku_num'])) {
            $model->skuNum = $map['sku_num'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }

        return $model;
    }
}
