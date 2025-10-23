<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentPaymentResponse extends Model
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

    // 成功金额，整数，单位:分
    /**
     * @var string
     */
    public $succAmt;

    // 支付成功时间，yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $succTime;

    // 平台订单号
    /**
     * @var string
     */
    public $orderId;

    // 商户订单号
    /**
     * @var string
     */
    public $transId;

    // 订单状态
    /**
     * @var string
     */
    public $orderState;

    // 分账状态
    /**
     * @var string
     */
    public $shareState;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'succAmt'    => 'succ_amt',
        'succTime'   => 'succ_time',
        'orderId'    => 'order_id',
        'transId'    => 'trans_id',
        'orderState' => 'order_state',
        'shareState' => 'share_state',
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
        if (null !== $this->succAmt) {
            $res['succ_amt'] = $this->succAmt;
        }
        if (null !== $this->succTime) {
            $res['succ_time'] = $this->succTime;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->transId) {
            $res['trans_id'] = $this->transId;
        }
        if (null !== $this->orderState) {
            $res['order_state'] = $this->orderState;
        }
        if (null !== $this->shareState) {
            $res['share_state'] = $this->shareState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentPaymentResponse
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
        if (isset($map['succ_amt'])) {
            $model->succAmt = $map['succ_amt'];
        }
        if (isset($map['succ_time'])) {
            $model->succTime = $map['succ_time'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['trans_id'])) {
            $model->transId = $map['trans_id'];
        }
        if (isset($map['order_state'])) {
            $model->orderState = $map['order_state'];
        }
        if (isset($map['share_state'])) {
            $model->shareState = $map['share_state'];
        }

        return $model;
    }
}
