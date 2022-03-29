<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmEventdetailResponse extends Model
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

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 总记录数
    /**
     * @var int
     */
    public $totalCount;

    // 页面尺寸
    /**
     * @var int
     */
    public $pageSize;

    // 告警消息列表
    /**
     * @var UnifiedAlarmHistoryVO[]
     */
    public $alarmHistoryList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'currentPage'      => 'current_page',
        'totalCount'       => 'total_count',
        'pageSize'         => 'page_size',
        'alarmHistoryList' => 'alarm_history_list',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->alarmHistoryList) {
            $res['alarm_history_list'] = [];
            if (null !== $this->alarmHistoryList && \is_array($this->alarmHistoryList)) {
                $n = 0;
                foreach ($this->alarmHistoryList as $item) {
                    $res['alarm_history_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmEventdetailResponse
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
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['alarm_history_list'])) {
            if (!empty($map['alarm_history_list'])) {
                $model->alarmHistoryList = [];
                $n                       = 0;
                foreach ($map['alarm_history_list'] as $item) {
                    $model->alarmHistoryList[$n++] = null !== $item ? UnifiedAlarmHistoryVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
