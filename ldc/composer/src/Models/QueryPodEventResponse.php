<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryPodEventResponse extends Model
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

    // 事件列表
    /**
     * @var RpReleaseEvent[]
     */
    public $eventList;

    // 发布单对应的service_id
    /**
     * @var string
     */
    public $serviceId;

    // POD对应的uid
    /**
     * @var string
     */
    public $uId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'eventList'  => 'event_list',
        'serviceId'  => 'service_id',
        'uId'        => 'u_id',
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
        if (null !== $this->eventList) {
            $res['event_list'] = [];
            if (null !== $this->eventList && \is_array($this->eventList)) {
                $n = 0;
                foreach ($this->eventList as $item) {
                    $res['event_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->uId) {
            $res['u_id'] = $this->uId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPodEventResponse
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
        if (isset($map['event_list'])) {
            if (!empty($map['event_list'])) {
                $model->eventList = [];
                $n                = 0;
                foreach ($map['event_list'] as $item) {
                    $model->eventList[$n++] = null !== $item ? RpReleaseEvent::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['u_id'])) {
            $model->uId = $map['u_id'];
        }

        return $model;
    }
}
