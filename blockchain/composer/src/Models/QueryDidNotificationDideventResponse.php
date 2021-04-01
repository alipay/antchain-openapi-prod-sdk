<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidNotificationDideventResponse extends Model
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

    // 相关事件列表
    /**
     * @var DidEvent[]
     */
    public $events;

    // 是否还有待同步事件
    /**
     * @var bool
     */
    public $hasMore;

    // 下次事件拉取开始的offset
    /**
     * @var int
     */
    public $nextOffset;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'events'     => 'events',
        'hasMore'    => 'has_more',
        'nextOffset' => 'next_offset',
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
        if (null !== $this->events) {
            $res['events'] = [];
            if (null !== $this->events && \is_array($this->events)) {
                $n = 0;
                foreach ($this->events as $item) {
                    $res['events'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->hasMore) {
            $res['has_more'] = $this->hasMore;
        }
        if (null !== $this->nextOffset) {
            $res['next_offset'] = $this->nextOffset;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDidNotificationDideventResponse
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
        if (isset($map['events'])) {
            if (!empty($map['events'])) {
                $model->events = [];
                $n             = 0;
                foreach ($map['events'] as $item) {
                    $model->events[$n++] = null !== $item ? DidEvent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['has_more'])) {
            $model->hasMore = $map['has_more'];
        }
        if (isset($map['next_offset'])) {
            $model->nextOffset = $map['next_offset'];
        }

        return $model;
    }
}
