<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmNotifystatResponse extends Model
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

    // 统计通知历史
    /**
     * @var EventStat[]
     */
    public $notifyStatList;

    // 时间分段
    /**
     * @var int[]
     */
    public $timeSlots;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'notifyStatList' => 'notify_stat_list',
        'timeSlots'      => 'time_slots',
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
        if (null !== $this->notifyStatList) {
            $res['notify_stat_list'] = [];
            if (null !== $this->notifyStatList && \is_array($this->notifyStatList)) {
                $n = 0;
                foreach ($this->notifyStatList as $item) {
                    $res['notify_stat_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->timeSlots) {
            $res['time_slots'] = $this->timeSlots;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmNotifystatResponse
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
        if (isset($map['notify_stat_list'])) {
            if (!empty($map['notify_stat_list'])) {
                $model->notifyStatList = [];
                $n                     = 0;
                foreach ($map['notify_stat_list'] as $item) {
                    $model->notifyStatList[$n++] = null !== $item ? EventStat::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['time_slots'])) {
            if (!empty($map['time_slots'])) {
                $model->timeSlots = $map['time_slots'];
            }
        }

        return $model;
    }
}
