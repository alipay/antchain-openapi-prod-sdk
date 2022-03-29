<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppsUnifiedalarmstatsResponse extends Model
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

    // 正在告警的所有应用状态
    /**
     * @var AppAlarmStats[]
     */
    public $appAlarmStatus;

    // 总应用数
    /**
     * @var int
     */
    public $totalAppCount;

    // 正在告警的应用数
    /**
     * @var int
     */
    public $alarmAppCount;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'appAlarmStatus' => 'app_alarm_status',
        'totalAppCount'  => 'total_app_count',
        'alarmAppCount'  => 'alarm_app_count',
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
        if (null !== $this->appAlarmStatus) {
            $res['app_alarm_status'] = [];
            if (null !== $this->appAlarmStatus && \is_array($this->appAlarmStatus)) {
                $n = 0;
                foreach ($this->appAlarmStatus as $item) {
                    $res['app_alarm_status'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalAppCount) {
            $res['total_app_count'] = $this->totalAppCount;
        }
        if (null !== $this->alarmAppCount) {
            $res['alarm_app_count'] = $this->alarmAppCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppsUnifiedalarmstatsResponse
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
        if (isset($map['app_alarm_status'])) {
            if (!empty($map['app_alarm_status'])) {
                $model->appAlarmStatus = [];
                $n                     = 0;
                foreach ($map['app_alarm_status'] as $item) {
                    $model->appAlarmStatus[$n++] = null !== $item ? AppAlarmStats::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_app_count'])) {
            $model->totalAppCount = $map['total_app_count'];
        }
        if (isset($map['alarm_app_count'])) {
            $model->alarmAppCount = $map['alarm_app_count'];
        }

        return $model;
    }
}
