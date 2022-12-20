<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryIotbasicDeviceorderResponse extends Model
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

    // 订单明细
    /**
     * @var IotBasicDeviceOrderItem[]
     */
    public $orderDetail;

    // 总记录数
    /**
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;

    // 当前页码
    /**
     * @var int
     */
    public $current;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'orderDetail' => 'order_detail',
        'total'       => 'total',
        'totalPage'   => 'total_page',
        'current'     => 'current',
        'pageSize'    => 'page_size',
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
        if (null !== $this->orderDetail) {
            $res['order_detail'] = [];
            if (null !== $this->orderDetail && \is_array($this->orderDetail)) {
                $n = 0;
                foreach ($this->orderDetail as $item) {
                    $res['order_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIotbasicDeviceorderResponse
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
        if (isset($map['order_detail'])) {
            if (!empty($map['order_detail'])) {
                $model->orderDetail = [];
                $n                  = 0;
                foreach ($map['order_detail'] as $item) {
                    $model->orderDetail[$n++] = null !== $item ? IotBasicDeviceOrderItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
