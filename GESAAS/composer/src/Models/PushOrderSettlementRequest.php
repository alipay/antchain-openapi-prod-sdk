<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class PushOrderSettlementRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outProductId' => 'out_product_id',
        'outOrderNo' => 'out_order_no',
        'totalAmount' => 'total_amount',
        'payProduct' => 'pay_product',
        'extInfo' => 'ext_info',
        'orderCreateTime' => 'order_create_time',
        'paySubject' => 'pay_subject',
        'payChannel' => 'pay_channel',
        'payChannelUserId' => 'pay_channel_user_id',
    ];
    public function validate() {
        Model::validateRequired('outProductId', $this->outProductId, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('paySubject', $this->paySubject, true);
        Model::validateRequired('payChannelUserId', $this->payChannelUserId, true);
    }
    public function toMap() {
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
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->payProduct) {
            $res['pay_product'] = $this->payProduct;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->paySubject) {
            $res['pay_subject'] = $this->paySubject;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->payChannelUserId) {
            $res['pay_channel_user_id'] = $this->payChannelUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushOrderSettlementRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['out_product_id'])){
            $model->outProductId = $map['out_product_id'];
        }
        if(isset($map['out_order_no'])){
            $model->outOrderNo = $map['out_order_no'];
        }
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['pay_product'])){
            $model->payProduct = $map['pay_product'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        if(isset($map['order_create_time'])){
            $model->orderCreateTime = $map['order_create_time'];
        }
        if(isset($map['pay_subject'])){
            $model->paySubject = $map['pay_subject'];
        }
        if(isset($map['pay_channel'])){
            $model->payChannel = $map['pay_channel'];
        }
        if(isset($map['pay_channel_user_id'])){
            $model->payChannelUserId = $map['pay_channel_user_id'];
        }
        return $model;
    }
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

    // 外部订单号(同一个outProductId保证唯一性)，需保证在商家端不重复，64个字符以内
    /**
     * @var string
     */
    public $outOrderNo;

    // 订单支付金额(同分账金额)，单位：分（如 990 表示 9.90元）
    /**
     * @var int
     */
    public $totalAmount;

    // 支付产品，默认：JSAPI
    /**
     * @var string
     */
    public $payProduct;

    // 扩展参数，JSONString格式
    /**
     * @var string
     */
    public $extInfo;

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

    // 支付渠道，默认：ALIPAY
    /**
     * @var string
     */
    public $payChannel;

    // 支付渠道是ALIPAY场景下传入支付宝用户2088xxxx
    /**
     * @var string
     */
    public $payChannelUserId;

}
