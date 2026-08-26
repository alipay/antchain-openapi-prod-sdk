<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class PayAntcloudTradeComboOrderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'payUrl' => 'pay_url',
        'payOrderId' => 'pay_order_id',
        'payStatus' => 'pay_status',
        'timeoutMinutes' => 'timeout_minutes',
        'expireTime' => 'expire_time',
    ];
    public function validate() {
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
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
        if (null !== $this->payUrl) {
            $res['pay_url'] = $this->payUrl;
        }
        if (null !== $this->payOrderId) {
            $res['pay_order_id'] = $this->payOrderId;
        }
        if (null !== $this->payStatus) {
            $res['pay_status'] = $this->payStatus;
        }
        if (null !== $this->timeoutMinutes) {
            $res['timeout_minutes'] = $this->timeoutMinutes;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PayAntcloudTradeComboOrderResponse
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
        if(isset($map['pay_url'])){
            $model->payUrl = $map['pay_url'];
        }
        if(isset($map['pay_order_id'])){
            $model->payOrderId = $map['pay_order_id'];
        }
        if(isset($map['pay_status'])){
            $model->payStatus = $map['pay_status'];
        }
        if(isset($map['timeout_minutes'])){
            $model->timeoutMinutes = $map['timeout_minutes'];
        }
        if(isset($map['expire_time'])){
            $model->expireTime = $map['expire_time'];
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

    // 页面支付地址
    /**
     * @var string
     */
    public $payUrl;

    // 支付订单号
    /**
     * @var string
     */
    public $payOrderId;

    // 支付状态，
    // SUCCESS：已支付;
    // INIT：未支付;
    // PROCESS：支付中;
    // CANCEL：取消支付;
    /**
     * @var string
     */
    public $payStatus;

    // 支付链接超时时间 单位：分钟
    /**
     * @var int
     */
    public $timeoutMinutes;

    // 支付链接过期时间
    /**
     * @var string
     */
    public $expireTime;

}
