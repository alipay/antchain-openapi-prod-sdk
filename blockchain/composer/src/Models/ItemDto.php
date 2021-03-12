<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ItemDto extends Model
{
    // 商品id
    /**
     * @example test id
     *
     * @var string
     */
    public $productId;

    // 商户id
    /**
     * @example test id
     *
     * @var string
     */
    public $shopId;

    // 链上地址
    /**
     * @example 123
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'productId' => 'product_id',
        'shopId'    => 'shop_id',
        'txHash'    => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ItemDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
