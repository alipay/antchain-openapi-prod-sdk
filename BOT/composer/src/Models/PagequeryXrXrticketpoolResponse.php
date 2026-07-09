<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryXrXrticketpoolResponse extends Model
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

    // 通行证列表
    /**
     * @var XrTicketPoolItem[]
     */
    public $xrTicketPoolList;

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 每页数据条数
    /**
     * @var int
     */
    public $pageSize;

    // 总数量
    /**
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'xrTicketPoolList' => 'xr_ticket_pool_list',
        'success'          => 'success',
        'current'          => 'current',
        'pageSize'         => 'page_size',
        'total'            => 'total',
        'totalPage'        => 'total_page',
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
        if (null !== $this->xrTicketPoolList) {
            $res['xr_ticket_pool_list'] = [];
            if (null !== $this->xrTicketPoolList && \is_array($this->xrTicketPoolList)) {
                $n = 0;
                foreach ($this->xrTicketPoolList as $item) {
                    $res['xr_ticket_pool_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryXrXrticketpoolResponse
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
        if (isset($map['xr_ticket_pool_list'])) {
            if (!empty($map['xr_ticket_pool_list'])) {
                $model->xrTicketPoolList = [];
                $n                       = 0;
                foreach ($map['xr_ticket_pool_list'] as $item) {
                    $model->xrTicketPoolList[$n++] = null !== $item ? XrTicketPoolItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
