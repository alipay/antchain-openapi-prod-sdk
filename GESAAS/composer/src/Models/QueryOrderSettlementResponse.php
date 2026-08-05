<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\OrderPayInfo;
use AntChain\GESAAS\Models\OrderSplitInfo;

class QueryOrderSettlementResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'outProductId' => 'out_product_id',
        'totalAmount' => 'total_amount',
        'orderCreateTime' => 'order_create_time',
        'paySubject' => 'pay_subject',
        'tradeNo' => 'trade_no',
        'orderPayInfo' => 'order_pay_info',
        'orderSplitInfo' => 'order_split_info',
        'payChannelUserId' => 'pay_channel_user_id',
        'payChannel' => 'pay_channel',
        'payProduct' => 'pay_product',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->outProductId) {
            $res['out_product_id'] = $this->outProductId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->paySubject) {
            $res['pay_subject'] = $this->paySubject;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->orderPayInfo) {
            $res['order_pay_info'] = null !== $this->orderPayInfo ? $this->orderPayInfo->toMap() : null;
        }
        if (null !== $this->orderSplitInfo) {
            $res['order_split_info'] = null !== $this->orderSplitInfo ? $this->orderSplitInfo->toMap() : null;
        }
        if (null !== $this->payChannelUserId) {
            $res['pay_channel_user_id'] = $this->payChannelUserId;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->payProduct) {
            $res['pay_product'] = $this->payProduct;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOrderSettlementResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['out_product_id'])){
            $model->outProductId = $map['out_product_id'];
        }
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['order_create_time'])){
            $model->orderCreateTime = $map['order_create_time'];
        }
        if(isset($map['pay_subject'])){
            $model->paySubject = $map['pay_subject'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['order_pay_info'])){
            $model->orderPayInfo = OrderPayInfo::fromMap($map['order_pay_info']);
        }
        if(isset($map['order_split_info'])){
            $model->orderSplitInfo = OrderSplitInfo::fromMap($map['order_split_info']);
        }
        if(isset($map['pay_channel_user_id'])){
            $model->payChannelUserId = $map['pay_channel_user_id'];
        }
        if(isset($map['pay_channel'])){
            $model->payChannel = $map['pay_channel'];
        }
        if(isset($map['pay_product'])){
            $model->payProduct = $map['pay_product'];
        }
        return $model;
    }
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

    // 商家产品唯一编码，64个字符以内
    /**
     * @var string
     */
    public $outProductId;

    // 订单金额，单位：分（如 990 表示 9.90元）
    /**
     * @var int
     */
    public $totalAmount;

    // 订单创建时间，格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $orderCreateTime;

    // 订单支付标题， 150个字符以内
    /**
     * @var string
     */
    public $paySubject;

    // 支付宝支付订单号，用于拉起主动支付页面
    /**
     * @var string
     */
    public $tradeNo;

    // 支付详情
    /**
     * @var OrderPayInfo
     */
    public $orderPayInfo;

    // 分账详情
    /**
     * @var OrderSplitInfo
     */
    public $orderSplitInfo;

    // 支付渠道是ALIPAY场景下-支付宝用户2088xxxx
    /**
     * @var string
     */
    public $payChannelUserId;

    // 支付渠道，默认：ALIPAY
    /**
     * @var string
     */
    public $payChannel;

    // 支付产品，默认：JSAPI
    /**
     * @var string
     */
    public $payProduct;

}
