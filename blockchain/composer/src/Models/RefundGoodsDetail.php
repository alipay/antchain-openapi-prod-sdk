<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RefundGoodsDetail extends Model
{
    // 商品编号
    /**
     * @example apple-01
     *
     * @var string
     */
    public $goodsId;

    // 该商品的退款总金额
    /**
     * @example 19.50
     *
     * @var string
     */
    public $refundAmount;
    protected $_name = [
        'goodsId'      => 'goods_id',
        'refundAmount' => 'refund_amount',
    ];

    public function validate()
    {
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefundGoodsDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }

        return $model;
    }
}
