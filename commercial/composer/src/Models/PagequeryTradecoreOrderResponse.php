<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PagequeryTradecoreOrderResponse extends Model
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

    // 总页数
    /**
     * @var int
     */
    public $pages;

    // 当前页码
    /**
     * @var int
     */
    public $pageNum;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // total
    /**
     * @var int
     */
    public $total;

    // order_list
    /**
     * @var MainOrderVO[]
     */
    public $orderList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pages'      => 'pages',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'total'      => 'total',
        'orderList'  => 'order_list',
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
        if (null !== $this->pages) {
            $res['pages'] = $this->pages;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryTradecoreOrderResponse
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
        if (isset($map['pages'])) {
            $model->pages = $map['pages'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['order_list'])) {
            if (!empty($map['order_list'])) {
                $model->orderList = [];
                $n                = 0;
                foreach ($map['order_list'] as $item) {
                    $model->orderList[$n++] = null !== $item ? MainOrderVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
