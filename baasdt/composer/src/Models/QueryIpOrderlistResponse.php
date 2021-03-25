<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpOrderlistResponse extends Model
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

    // 页码
    /**
     * @var int
     */
    public $pageNumber;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

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

    // 订单列表
    /**
     * @var IPOrder[]
     */
    public $orderList;

    // 筛选条件下订单总数
    /**
     * @var int
     */
    public $selectOrderCount;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'pageNumber'         => 'page_number',
        'pageSize'           => 'page_size',
        'totalOrderCount'    => 'total_order_count',
        'totalPaymentAmount' => 'total_payment_amount',
        'totalBuyerCount'    => 'total_buyer_count',
        'orderList'          => 'order_list',
        'selectOrderCount'   => 'select_order_count',
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
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
        if (null !== $this->orderList) {
            $res['order_list'] = [];
            if (null !== $this->orderList && \is_array($this->orderList)) {
                $n = 0;
                foreach ($this->orderList as $item) {
                    $res['order_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->selectOrderCount) {
            $res['select_order_count'] = $this->selectOrderCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpOrderlistResponse
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
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
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
        if (isset($map['order_list'])) {
            if (!empty($map['order_list'])) {
                $model->orderList = [];
                $n                = 0;
                foreach ($map['order_list'] as $item) {
                    $model->orderList[$n++] = null !== $item ? IPOrder::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['select_order_count'])) {
            $model->selectOrderCount = $map['select_order_count'];
        }

        return $model;
    }
}
