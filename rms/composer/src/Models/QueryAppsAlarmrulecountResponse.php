<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppsAlarmrulecountResponse extends Model
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

    // 应用告警规则数清单
    /**
     * @var AppAlarmRuleCount[]
     */
    public $appAlarmRuleCounts;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'appAlarmRuleCounts' => 'app_alarm_rule_counts',
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
        if (null !== $this->appAlarmRuleCounts) {
            $res['app_alarm_rule_counts'] = [];
            if (null !== $this->appAlarmRuleCounts && \is_array($this->appAlarmRuleCounts)) {
                $n = 0;
                foreach ($this->appAlarmRuleCounts as $item) {
                    $res['app_alarm_rule_counts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppsAlarmrulecountResponse
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
        if (isset($map['app_alarm_rule_counts'])) {
            if (!empty($map['app_alarm_rule_counts'])) {
                $model->appAlarmRuleCounts = [];
                $n                         = 0;
                foreach ($map['app_alarm_rule_counts'] as $item) {
                    $model->appAlarmRuleCounts[$n++] = null !== $item ? AppAlarmRuleCount::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
