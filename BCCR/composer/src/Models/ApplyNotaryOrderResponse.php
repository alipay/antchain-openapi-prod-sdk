<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ApplyNotaryOrderResponse extends Model
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

    // 出证申请订单ID
    /**
     * @var string
     */
    public $notaryOrderId;

    // 订单状态
    /**
     * @var string
     */
    public $orderStatus;

    // 支付二维码链接
    /**
     * @var string
     */
    public $payUrl;

    // 支付二维码过期时间
    /**
     * @var int
     */
    public $payUrlExpireTime;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'notaryOrderId'    => 'notary_order_id',
        'orderStatus'      => 'order_status',
        'payUrl'           => 'pay_url',
        'payUrlExpireTime' => 'pay_url_expire_time',
    ];

    public function validate()
    {
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
        if (null !== $this->notaryOrderId) {
            $res['notary_order_id'] = $this->notaryOrderId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->payUrl) {
            $res['pay_url'] = $this->payUrl;
        }
        if (null !== $this->payUrlExpireTime) {
            $res['pay_url_expire_time'] = $this->payUrlExpireTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyNotaryOrderResponse
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
        if (isset($map['notary_order_id'])) {
            $model->notaryOrderId = $map['notary_order_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['pay_url'])) {
            $model->payUrl = $map['pay_url'];
        }
        if (isset($map['pay_url_expire_time'])) {
            $model->payUrlExpireTime = $map['pay_url_expire_time'];
        }

        return $model;
    }
}
