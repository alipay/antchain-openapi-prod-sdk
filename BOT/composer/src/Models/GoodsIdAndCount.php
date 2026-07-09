<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsIdAndCount extends Model
{
    // 商品id
    /**
     * @example 23123131
     *
     * @var int
     */
    public $goodsSkuId;

    // 商品采购数量
    /**
     * @example 100
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'goodsSkuId' => 'goods_sku_id',
        'count'      => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('goodsSkuId', $this->goodsSkuId, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsSkuId) {
            $res['goods_sku_id'] = $this->goodsSkuId;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsIdAndCount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_sku_id'])) {
            $model->goodsSkuId = $map['goods_sku_id'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
