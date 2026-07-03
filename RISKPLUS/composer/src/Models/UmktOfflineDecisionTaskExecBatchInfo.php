<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UmktOfflineDecisionTaskExecBatchInfo extends Model
{
    // 执行批次
    /**
     * @example 202501011930
     *
     * @var string
     */
    public $execBatch;

    // 批次下任务列表
    /**
     * @example
     *
     * @var UmktOfflineDecisionTaskDetailInfo[]
     */
    public $offlineDecisionTaskDetailInfoList;
    protected $_name = [
        'execBatch'                         => 'exec_batch',
        'offlineDecisionTaskDetailInfoList' => 'offline_decision_task_detail_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('execBatch', $this->execBatch, true);
        Model::validateRequired('offlineDecisionTaskDetailInfoList', $this->offlineDecisionTaskDetailInfoList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->execBatch) {
            $res['exec_batch'] = $this->execBatch;
        }
        if (null !== $this->offlineDecisionTaskDetailInfoList) {
            $res['offline_decision_task_detail_info_list'] = [];
            if (null !== $this->offlineDecisionTaskDetailInfoList && \is_array($this->offlineDecisionTaskDetailInfoList)) {
                $n = 0;
                foreach ($this->offlineDecisionTaskDetailInfoList as $item) {
                    $res['offline_decision_task_detail_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UmktOfflineDecisionTaskExecBatchInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['exec_batch'])) {
            $model->execBatch = $map['exec_batch'];
        }
        if (isset($map['offline_decision_task_detail_info_list'])) {
            if (!empty($map['offline_decision_task_detail_info_list'])) {
                $model->offlineDecisionTaskDetailInfoList = [];
                $n                                        = 0;
                foreach ($map['offline_decision_task_detail_info_list'] as $item) {
                    $model->offlineDecisionTaskDetailInfoList[$n++] = null !== $item ? UmktOfflineDecisionTaskDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
