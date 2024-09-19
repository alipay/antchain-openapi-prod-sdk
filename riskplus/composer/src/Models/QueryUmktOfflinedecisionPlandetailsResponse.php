<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktOfflinedecisionPlandetailsResponse extends Model
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

    // 离线圈客关联计划的个数
    /**
     * @var int
     */
    public $offlineDecisionPlanCount;

    // 离线圈客计划详细
    /**
     * @var OfflineDecisionPlanDetail[]
     */
    public $planDetailList;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'offlineDecisionPlanCount' => 'offline_decision_plan_count',
        'planDetailList'           => 'plan_detail_list',
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
        if (null !== $this->offlineDecisionPlanCount) {
            $res['offline_decision_plan_count'] = $this->offlineDecisionPlanCount;
        }
        if (null !== $this->planDetailList) {
            $res['plan_detail_list'] = [];
            if (null !== $this->planDetailList && \is_array($this->planDetailList)) {
                $n = 0;
                foreach ($this->planDetailList as $item) {
                    $res['plan_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktOfflinedecisionPlandetailsResponse
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
        if (isset($map['offline_decision_plan_count'])) {
            $model->offlineDecisionPlanCount = $map['offline_decision_plan_count'];
        }
        if (isset($map['plan_detail_list'])) {
            if (!empty($map['plan_detail_list'])) {
                $model->planDetailList = [];
                $n                     = 0;
                foreach ($map['plan_detail_list'] as $item) {
                    $model->planDetailList[$n++] = null !== $item ? OfflineDecisionPlanDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
