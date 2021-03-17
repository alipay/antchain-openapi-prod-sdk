<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryWithholdPayresultResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 支付完成日期
    /**
     * @var string
     */
    public $payDate;

    // 支付宝支付单据号
    /**
     * @var string
     */
    public $payOrderId;

    // INIT：受理成功，扣款中
    // FINISHED：扣款成功
    // CLOSED：商户已关单
    /**
     * @var string
     */
    public $status;

    // 扣款金额
    /**
     * @var string
     */
    public $transAmount;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'payDate'     => 'pay_date',
        'payOrderId'  => 'pay_order_id',
        'status'      => 'status',
        'transAmount' => 'trans_amount',
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
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->payOrderId) {
            $res['pay_order_id'] = $this->payOrderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->transAmount) {
            $res['trans_amount'] = $this->transAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWithholdPayresultResponse
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
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['pay_order_id'])) {
            $model->payOrderId = $map['pay_order_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['trans_amount'])) {
            $model->transAmount = $map['trans_amount'];
        }

        return $model;
    }
}
