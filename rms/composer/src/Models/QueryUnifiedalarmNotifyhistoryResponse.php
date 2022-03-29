<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmNotifyhistoryResponse extends Model
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

    // 总记录数
    /**
     * @var int
     */
    public $totalCount;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面尺寸
    /**
     * @var int
     */
    public $pageSize;

    // 响应结果
    /**
     * @var UnifiedAlarmNotifyHistoryVO[]
     */
    public $alarmNotifyHistories;

    // 告警通知历史中对应的通知对象
    /**
     * @var UnifiedAlarmSubDTO[]
     */
    public $alarmNotifySubs;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'totalCount'           => 'total_count',
        'currentPage'          => 'current_page',
        'pageSize'             => 'page_size',
        'alarmNotifyHistories' => 'alarm_notify_histories',
        'alarmNotifySubs'      => 'alarm_notify_subs',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->alarmNotifyHistories) {
            $res['alarm_notify_histories'] = [];
            if (null !== $this->alarmNotifyHistories && \is_array($this->alarmNotifyHistories)) {
                $n = 0;
                foreach ($this->alarmNotifyHistories as $item) {
                    $res['alarm_notify_histories'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alarmNotifySubs) {
            $res['alarm_notify_subs'] = [];
            if (null !== $this->alarmNotifySubs && \is_array($this->alarmNotifySubs)) {
                $n = 0;
                foreach ($this->alarmNotifySubs as $item) {
                    $res['alarm_notify_subs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmNotifyhistoryResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['alarm_notify_histories'])) {
            if (!empty($map['alarm_notify_histories'])) {
                $model->alarmNotifyHistories = [];
                $n                           = 0;
                foreach ($map['alarm_notify_histories'] as $item) {
                    $model->alarmNotifyHistories[$n++] = null !== $item ? UnifiedAlarmNotifyHistoryVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alarm_notify_subs'])) {
            if (!empty($map['alarm_notify_subs'])) {
                $model->alarmNotifySubs = [];
                $n                      = 0;
                foreach ($map['alarm_notify_subs'] as $item) {
                    $model->alarmNotifySubs[$n++] = null !== $item ? UnifiedAlarmSubDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
