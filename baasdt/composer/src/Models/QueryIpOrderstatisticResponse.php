<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpOrderstatisticResponse extends Model
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

    // 订单总数
    /**
     * @var int
     */
    public $totalOrderCount;

    // 总金额
    /**
     * @var string
     */
    public $totalPaymentAmount;

    // 总客户数
    /**
     * @var int
     */
    public $totalBuyerCount;

    // 统计数据
    /**
     * @var ChannelCounter[]
     */
    public $orderStaList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'totalOrderCount'    => 'total_order_count',
        'totalPaymentAmount' => 'total_payment_amount',
        'totalBuyerCount'    => 'total_buyer_count',
        'orderStaList'       => 'order_sta_list',
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
        if (null !== $this->totalOrderCount) {
            $res['total_order_count'] = $this->totalOrderCount;
        }
        if (null !== $this->totalPaymentAmount) {
            $res['total_payment_amount'] = $this->totalPaymentAmount;
        }
        if (null !== $this->totalBuyerCount) {
            $res['total_buyer_count'] = $this->totalBuyerCount;
        }
        if (null !== $this->orderStaList) {
            $res['order_sta_list'] = [];
            if (null !== $this->orderStaList && \is_array($this->orderStaList)) {
                $n = 0;
                foreach ($this->orderStaList as $item) {
                    $res['order_sta_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpOrderstatisticResponse
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
        if (isset($map['total_order_count'])) {
            $model->totalOrderCount = $map['total_order_count'];
        }
        if (isset($map['total_payment_amount'])) {
            $model->totalPaymentAmount = $map['total_payment_amount'];
        }
        if (isset($map['total_buyer_count'])) {
            $model->totalBuyerCount = $map['total_buyer_count'];
        }
        if (isset($map['order_sta_list'])) {
            if (!empty($map['order_sta_list'])) {
                $model->orderStaList = [];
                $n                   = 0;
                foreach ($map['order_sta_list'] as $item) {
                    $model->orderStaList[$n++] = null !== $item ? ChannelCounter::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
