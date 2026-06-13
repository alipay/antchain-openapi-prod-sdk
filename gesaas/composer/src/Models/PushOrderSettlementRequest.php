<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class PushOrderSettlementRequest extends Model
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

    // 商家产品唯一编码，64个字符以内
    /**
     * @var string
     */
    public $outProductId;

    // 外部订单号，需保证在商家端不重复，64个字符以内，每次发起需定义唯一的outOrderNo(包括重试)
    /**
     * @var string
     */
    public $outOrderNo;

    // 支付宝/微信/其他  平台订单号
    /**
     * @var string
     */
    public $tradeNo;

    // 支付渠道类型，枚举值：ALIPAY / WECHAT
    /**
     * @var string
     */
    public $orderType;

    // 订单金额，单位：分（如 990 表示 9.90元）
    /**
     * @var int
     */
    public $orderAmount;

    // 扩展参数，JSONString格式
    /**
     * @var string
     */
    public $extInfo;

    // true：是最终分账，分账完成后资金自动解冻
    // false：非最终分账，资金保持冻结
    // 默认值：true
    /**
     * @var bool
     */
    public $isFinalSplit;

    // 订单产生时间，格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $outOrderTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outProductId'      => 'out_product_id',
        'outOrderNo'        => 'out_order_no',
        'tradeNo'           => 'trade_no',
        'orderType'         => 'order_type',
        'orderAmount'       => 'order_amount',
        'extInfo'           => 'ext_info',
        'isFinalSplit'      => 'is_final_split',
        'outOrderTime'      => 'out_order_time',
    ];

    public function validate()
    {
        Model::validateRequired('outProductId', $this->outProductId, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('orderAmount', $this->orderAmount, true);
        Model::validateRequired('outOrderTime', $this->outOrderTime, true);
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
        if (null !== $this->outProductId) {
            $res['out_product_id'] = $this->outProductId;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->isFinalSplit) {
            $res['is_final_split'] = $this->isFinalSplit;
        }
        if (null !== $this->outOrderTime) {
            $res['out_order_time'] = $this->outOrderTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushOrderSettlementRequest
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
        if (isset($map['out_product_id'])) {
            $model->outProductId = $map['out_product_id'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['is_final_split'])) {
            $model->isFinalSplit = $map['is_final_split'];
        }
        if (isset($map['out_order_time'])) {
            $model->outOrderTime = $map['out_order_time'];
        }

        return $model;
    }
}
