<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class InsureProductInfo extends Model
{
    // 商品库id
    /**
     * @example 23120408012017316448567772405769C
     *
     * @var string
     */
    public $productId;

    // 商品设备编号
    /**
     * @example G7776396641152936311S8125663851216
     *
     * @var string
     */
    public $productImeiId;

    // 商品采购价，单位：分
    /**
     * @example 598800
     *
     * @var int
     */
    public $purchaseAmount;
    protected $_name = [
        'productId'      => 'product_id',
        'productImeiId'  => 'product_imei_id',
        'purchaseAmount' => 'purchase_amount',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productImeiId', $this->productImeiId, true);
        Model::validateRequired('purchaseAmount', $this->purchaseAmount, true);
        Model::validateMaxLength('productId', $this->productId, 128);
        Model::validateMaxLength('productImeiId', $this->productImeiId, 256);
        Model::validateMaximum('purchaseAmount', $this->purchaseAmount, 100000000);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productImeiId) {
            $res['product_imei_id'] = $this->productImeiId;
        }
        if (null !== $this->purchaseAmount) {
            $res['purchase_amount'] = $this->purchaseAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsureProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_imei_id'])) {
            $model->productImeiId = $map['product_imei_id'];
        }
        if (isset($map['purchase_amount'])) {
            $model->purchaseAmount = $map['purchase_amount'];
        }

        return $model;
    }
}
