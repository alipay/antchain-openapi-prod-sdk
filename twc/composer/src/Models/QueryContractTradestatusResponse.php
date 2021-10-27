<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractTradestatusResponse extends Model
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

    // 代扣计划的外部订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 最近一次扣款触发时间戳（单位：ms）
    /**
     * @var string
     */
    public $deductTime;

    // 创建代扣计划时设置的扣款时间戳（单位：ms）
    /**
     * @var string
     */
    public $payDate;

    // 计划扣款金额（单位：分）
    /**
     * @var int
     */
    public $payMoney;

    // 扣款状态
    // PAY_TOBE_TRIGGER 初始未扣款
    // TRADE_IN_PROGRESS 扣款中
    // TRADE_REFUNDED 已发生退款
    // TRADE_END 交易终止（未成功）
    // TRADE_SUCCESS 扣款成功
    // TRADE_FAIL 扣款失败
    // TRADE_FINISHED 交易终止（扣款成功，并且距离首次扣款超过180天）
    // TRADE_CANCEL 代扣取消
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'outTradeNo' => 'out_trade_no',
        'deductTime' => 'deduct_time',
        'payDate'    => 'pay_date',
        'payMoney'   => 'pay_money',
        'status'     => 'status',
    ];

    public function validate()
    {
        Model::validatePattern('deductTime', $this->deductTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('payDate', $this->payDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->deductTime) {
            $res['deduct_time'] = $this->deductTime;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractTradestatusResponse
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
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['deduct_time'])) {
            $model->deductTime = $map['deduct_time'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
