<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class ExecNftTransferRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // NFT发行成功的商品id
    /**
     * @var int
     */
    public $skuId;

    // C端用户的支付宝uid
    /**
     * @var string
     */
    public $toIdNo;

    // C端用户的支付宝账号类型
    /**
     * @var string
     */
    public $toIdType;

    // 用户在商户购买的订单号，用作幂等字段
    /**
     * @var string
     */
    public $orderNo;

    // 用户购买订单的时间
    /**
     * @var string
     */
    public $orderTime;

    // 用户购买订单的价格，可以为0；用户的购买历史记录会展示
    /**
     * @var int
     */
    public $priceCent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'skuId'             => 'sku_id',
        'toIdNo'            => 'to_id_no',
        'toIdType'          => 'to_id_type',
        'orderNo'           => 'order_no',
        'orderTime'         => 'order_time',
        'priceCent'         => 'price_cent',
    ];

    public function validate()
    {
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('toIdNo', $this->toIdNo, true);
        Model::validateRequired('toIdType', $this->toIdType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
        Model::validatePattern('orderTime', $this->orderTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->toIdNo) {
            $res['to_id_no'] = $this->toIdNo;
        }
        if (null !== $this->toIdType) {
            $res['to_id_type'] = $this->toIdType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->priceCent) {
            $res['price_cent'] = $this->priceCent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecNftTransferRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['to_id_no'])) {
            $model->toIdNo = $map['to_id_no'];
        }
        if (isset($map['to_id_type'])) {
            $model->toIdType = $map['to_id_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }
        if (isset($map['price_cent'])) {
            $model->priceCent = $map['price_cent'];
        }

        return $model;
    }
}
