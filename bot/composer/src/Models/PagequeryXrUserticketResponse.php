<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryXrUserticketResponse extends Model
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

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 用户通行证列表
    /**
     * @var XrUserTicketPageInfo[]
     */
    public $xrUserTicketList;

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

    // 总数量
    /**
     * @var int
     */
    public $total;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'success'          => 'success',
        'xrUserTicketList' => 'xr_user_ticket_list',
        'current'          => 'current',
        'pageSize'         => 'page_size',
        'total'            => 'total',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->xrUserTicketList) {
            $res['xr_user_ticket_list'] = [];
            if (null !== $this->xrUserTicketList && \is_array($this->xrUserTicketList)) {
                $n = 0;
                foreach ($this->xrUserTicketList as $item) {
                    $res['xr_user_ticket_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryXrUserticketResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['xr_user_ticket_list'])) {
            if (!empty($map['xr_user_ticket_list'])) {
                $model->xrUserTicketList = [];
                $n                       = 0;
                foreach ($map['xr_user_ticket_list'] as $item) {
                    $model->xrUserTicketList[$n++] = null !== $item ? XrUserTicketPageInfo::fromMap($item) : $item;
                }
            }
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

        return $model;
    }
}
