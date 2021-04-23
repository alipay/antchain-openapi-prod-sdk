<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryIotplatformPurchaseorderResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 是否为链上采购商品，true：是，false：否
    /**
     * @var bool
     */
    public $goodsFromChain;

    // 采购时间
    /**
     * @var string
     */
    public $purchaseTime;

    // 采购商名称
    /**
     * @var string
     */
    public $leaseName;

    // 采购价
    /**
     * @var string
     */
    public $purchaseOrderPrice;

    // 商品名称
    /**
     * @var string
     */
    public $goodsName;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'goodsFromChain'     => 'goods_from_chain',
        'purchaseTime'       => 'purchase_time',
        'leaseName'          => 'lease_name',
        'purchaseOrderPrice' => 'purchase_order_price',
        'goodsName'          => 'goods_name',
    ];

    public function validate()
    {
        Model::validatePattern('purchaseTime', $this->purchaseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->goodsFromChain) {
            $res['goods_from_chain'] = $this->goodsFromChain;
        }
        if (null !== $this->purchaseTime) {
            $res['purchase_time'] = $this->purchaseTime;
        }
        if (null !== $this->leaseName) {
            $res['lease_name'] = $this->leaseName;
        }
        if (null !== $this->purchaseOrderPrice) {
            $res['purchase_order_price'] = $this->purchaseOrderPrice;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIotplatformPurchaseorderResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['goods_from_chain'])) {
            $model->goodsFromChain = $map['goods_from_chain'];
        }
        if (isset($map['purchase_time'])) {
            $model->purchaseTime = $map['purchase_time'];
        }
        if (isset($map['lease_name'])) {
            $model->leaseName = $map['lease_name'];
        }
        if (isset($map['purchase_order_price'])) {
            $model->purchaseOrderPrice = $map['purchase_order_price'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }

        return $model;
    }
}
