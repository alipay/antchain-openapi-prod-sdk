<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class BatchcancelOrderResponse extends Model
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

    // 是否取消成功
    //
    /**
     * @var bool
     */
    public $result;

    // 取消订单结果
    /**
     * @var CreateTradeOrderResult[]
     */
    public $createTradeOrderResult;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'result'                 => 'result',
        'createTradeOrderResult' => 'create_trade_order_result',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->createTradeOrderResult) {
            $res['create_trade_order_result'] = [];
            if (null !== $this->createTradeOrderResult && \is_array($this->createTradeOrderResult)) {
                $n = 0;
                foreach ($this->createTradeOrderResult as $item) {
                    $res['create_trade_order_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcancelOrderResponse
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['create_trade_order_result'])) {
            if (!empty($map['create_trade_order_result'])) {
                $model->createTradeOrderResult = [];
                $n                             = 0;
                foreach ($map['create_trade_order_result'] as $item) {
                    $model->createTradeOrderResult[$n++] = null !== $item ? CreateTradeOrderResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
