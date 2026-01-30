<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateOrderResponse extends Model
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

    // 支付状态
    /**
     * @var string
     */
    public $payStatus;

    // 批量下单列表返回
    /**
     * @var CreateTradeOrderResult[]
     */
    public $createTradeOrderResults;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'payStatus'               => 'pay_status',
        'createTradeOrderResults' => 'create_trade_order_results',
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
        if (null !== $this->payStatus) {
            $res['pay_status'] = $this->payStatus;
        }
        if (null !== $this->createTradeOrderResults) {
            $res['create_trade_order_results'] = [];
            if (null !== $this->createTradeOrderResults && \is_array($this->createTradeOrderResults)) {
                $n = 0;
                foreach ($this->createTradeOrderResults as $item) {
                    $res['create_trade_order_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateOrderResponse
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
        if (isset($map['pay_status'])) {
            $model->payStatus = $map['pay_status'];
        }
        if (isset($map['create_trade_order_results'])) {
            if (!empty($map['create_trade_order_results'])) {
                $model->createTradeOrderResults = [];
                $n                              = 0;
                foreach ($map['create_trade_order_results'] as $item) {
                    $model->createTradeOrderResults[$n++] = null !== $item ? CreateTradeOrderResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
