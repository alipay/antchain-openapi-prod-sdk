<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QueryTradeResponse extends Model
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

    // 商户订单号
    /**
     * @var string
     */
    public $merchantOrderNo;

    // 来源场景码
    /**
     * @var string
     */
    public $source;

    // 渠道场景码
    /**
     * @var string
     */
    public $channel;

    // 交易状态
    // WAIT_BUYER_PAY - 交易创建，等待买家付款
    // TRADE_CLOSED - 未付款交易超时关闭，或支付完成后全额退款
    // TRADE_SUCCESS - 交易成功
    /**
     * @var string
     */
    public $tradeStatus;

    // 币种，默认156-人民币
    /**
     * @var string
     */
    public $currencyValue;

    // 交易结算信息
    /**
     * @var TradeSettleDetail[]
     */
    public $tradeSettleInfo;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'merchantOrderNo' => 'merchant_order_no',
        'source'          => 'source',
        'channel'         => 'channel',
        'tradeStatus'     => 'trade_status',
        'currencyValue'   => 'currency_value',
        'tradeSettleInfo' => 'trade_settle_info',
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
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        if (null !== $this->tradeSettleInfo) {
            $res['trade_settle_info'] = [];
            if (null !== $this->tradeSettleInfo && \is_array($this->tradeSettleInfo)) {
                $n = 0;
                foreach ($this->tradeSettleInfo as $item) {
                    $res['trade_settle_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTradeResponse
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
        if (isset($map['merchant_order_no'])) {
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }
        if (isset($map['trade_settle_info'])) {
            if (!empty($map['trade_settle_info'])) {
                $model->tradeSettleInfo = [];
                $n                      = 0;
                foreach ($map['trade_settle_info'] as $item) {
                    $model->tradeSettleInfo[$n++] = null !== $item ? TradeSettleDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
