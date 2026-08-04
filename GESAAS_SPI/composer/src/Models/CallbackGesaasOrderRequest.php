<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class CallbackGesaasOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'msgType' => 'msg_type',
        'msgId' => 'msg_id',
        'traceId' => 'trace_id',
        'merchantId' => 'merchant_id',
        'messageBody' => 'message_body',
    ];
    public function validate() {
        Model::validateRequired('msgType', $this->msgType, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('messageBody', $this->messageBody, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->msgType) {
            $res['msg_type'] = $this->msgType;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->messageBody) {
            $res['message_body'] = $this->messageBody;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackGesaasOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['msg_type'])){
            $model->msgType = $map['msg_type'];
        }
        if(isset($map['msg_id'])){
            $model->msgId = $map['msg_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['message_body'])){
            $model->messageBody = $map['message_body'];
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

    // PAY_RESULT_MSG：支付结果通知
    // SETTLE_SPLIT_RESULT_MSG ：分账结果通知
    // REFUND_SPLIT_RESULT_MSG：退款退分账结果通知
    /**
     * @var string
     */
    public $msgType;

    // 消息唯一性判断，失败重试msgId不变
    // 即使消息重投、该字段也不会变动
    /**
     * @var string
     */
    public $msgId;

    // traceId， 每一次投递生成唯一id
    // 消息重投后、该字段会变化
    /**
     * @var string
     */
    public $traceId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 类型；JSONString字符串
    // 说明：根据不同的msgType类型，messageBody说明如下
    /**
     * @var string
     */
    public $messageBody;

}
