<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DecisionInfo extends Model
{
    // 状态
    /**
     * @example DECISION_SUCCESS
     *
     * @var string
     */
    public $status;

    // 计划配置ID
    /**
     * @example 1
     *
     * @var int
     */
    public $offlineDecisionPlanId;

    // 总数量
    /**
     * @example 111
     *
     * @var int
     */
    public $totalNum;

    // 分层结果数
    /**
     * @example 12
     *
     * @var int
     */
    public $decisionNum;

    // 文件路径
    /**
     * @example https://test-oss.oss-cn-shang
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'status'                => 'status',
        'offlineDecisionPlanId' => 'offline_decision_plan_id',
        'totalNum'              => 'total_num',
        'decisionNum'           => 'decision_num',
        'fileUrl'               => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('offlineDecisionPlanId', $this->offlineDecisionPlanId, true);
        Model::validateRequired('totalNum', $this->totalNum, true);
        Model::validateRequired('decisionNum', $this->decisionNum, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->offlineDecisionPlanId) {
            $res['offline_decision_plan_id'] = $this->offlineDecisionPlanId;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->decisionNum) {
            $res['decision_num'] = $this->decisionNum;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DecisionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['offline_decision_plan_id'])) {
            $model->offlineDecisionPlanId = $map['offline_decision_plan_id'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['decision_num'])) {
            $model->decisionNum = $map['decision_num'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
