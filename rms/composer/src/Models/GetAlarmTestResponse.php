<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetAlarmTestResponse extends Model
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

    // 数据结果
    /**
     * @var string
     */
    public $result;

    // 测试
    /**
     * @var AlarmTest[]
     */
    public $alarmContext;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'result'       => 'result',
        'alarmContext' => 'alarm_context',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->alarmContext) {
            $res['alarm_context'] = [];
            if (null !== $this->alarmContext && \is_array($this->alarmContext)) {
                $n = 0;
                foreach ($this->alarmContext as $item) {
                    $res['alarm_context'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAlarmTestResponse
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['alarm_context'])) {
            if (!empty($map['alarm_context'])) {
                $model->alarmContext = [];
                $n                   = 0;
                foreach ($map['alarm_context'] as $item) {
                    $model->alarmContext[$n++] = null !== $item ? AlarmTest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
