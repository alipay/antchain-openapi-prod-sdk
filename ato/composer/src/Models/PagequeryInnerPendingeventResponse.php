<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerPendingeventResponse extends Model
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

    // 总量
    /**
     * @var int
     */
    public $total;

    // 待办列表信息
    /**
     * @var PendingEventInfo[]
     */
    public $pendingEventInfoList;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'total'                => 'total',
        'pendingEventInfoList' => 'pending_event_info_list',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pendingEventInfoList) {
            $res['pending_event_info_list'] = [];
            if (null !== $this->pendingEventInfoList && \is_array($this->pendingEventInfoList)) {
                $n = 0;
                foreach ($this->pendingEventInfoList as $item) {
                    $res['pending_event_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerPendingeventResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['pending_event_info_list'])) {
            if (!empty($map['pending_event_info_list'])) {
                $model->pendingEventInfoList = [];
                $n                           = 0;
                foreach ($map['pending_event_info_list'] as $item) {
                    $model->pendingEventInfoList[$n++] = null !== $item ? PendingEventInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
