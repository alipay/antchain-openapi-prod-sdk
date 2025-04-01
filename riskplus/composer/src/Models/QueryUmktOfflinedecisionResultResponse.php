<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktOfflinedecisionResultResponse extends Model
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

    // 已完成的计划策略集合
    /**
     * @var int[]
     */
    public $decisionPlanIdList;

    // 批次维度圈客任务结果
    /**
     * @var UmktOfflineDecisionTaskDetailInfo[]
     */
    public $taskExecBatchInfo;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'decisionPlanIdList' => 'decision_plan_id_list',
        'taskExecBatchInfo'  => 'task_exec_batch_info',
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
        if (null !== $this->decisionPlanIdList) {
            $res['decision_plan_id_list'] = $this->decisionPlanIdList;
        }
        if (null !== $this->taskExecBatchInfo) {
            $res['task_exec_batch_info'] = [];
            if (null !== $this->taskExecBatchInfo && \is_array($this->taskExecBatchInfo)) {
                $n = 0;
                foreach ($this->taskExecBatchInfo as $item) {
                    $res['task_exec_batch_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktOfflinedecisionResultResponse
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
        if (isset($map['decision_plan_id_list'])) {
            if (!empty($map['decision_plan_id_list'])) {
                $model->decisionPlanIdList = $map['decision_plan_id_list'];
            }
        }
        if (isset($map['task_exec_batch_info'])) {
            if (!empty($map['task_exec_batch_info'])) {
                $model->taskExecBatchInfo = [];
                $n                        = 0;
                foreach ($map['task_exec_batch_info'] as $item) {
                    $model->taskExecBatchInfo[$n++] = null !== $item ? UmktOfflineDecisionTaskDetailInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
