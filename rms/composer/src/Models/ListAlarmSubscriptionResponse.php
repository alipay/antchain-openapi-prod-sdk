<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ListAlarmSubscriptionResponse extends Model
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

    // 告警订阅列表
    /**
     * @var AlarmSub[]
     */
    public $alarmSubs;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'alarmSubs'  => 'alarm_subs',
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
        if (null !== $this->alarmSubs) {
            $res['alarm_subs'] = [];
            if (null !== $this->alarmSubs && \is_array($this->alarmSubs)) {
                $n = 0;
                foreach ($this->alarmSubs as $item) {
                    $res['alarm_subs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAlarmSubscriptionResponse
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
        if (isset($map['alarm_subs'])) {
            if (!empty($map['alarm_subs'])) {
                $model->alarmSubs = [];
                $n                = 0;
                foreach ($map['alarm_subs'] as $item) {
                    $model->alarmSubs[$n++] = null !== $item ? AlarmSub::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
