<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryStackAlarmruleResponse extends Model
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

    // 告警套餐配置数组
    /**
     * @var StackAlarmRule[]
     */
    public $alarmRules;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'alarmRules' => 'alarm_rules',
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
        if (null !== $this->alarmRules) {
            $res['alarm_rules'] = [];
            if (null !== $this->alarmRules && \is_array($this->alarmRules)) {
                $n = 0;
                foreach ($this->alarmRules as $item) {
                    $res['alarm_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStackAlarmruleResponse
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
        if (isset($map['alarm_rules'])) {
            if (!empty($map['alarm_rules'])) {
                $model->alarmRules = [];
                $n                 = 0;
                foreach ($map['alarm_rules'] as $item) {
                    $model->alarmRules[$n++] = null !== $item ? StackAlarmRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
