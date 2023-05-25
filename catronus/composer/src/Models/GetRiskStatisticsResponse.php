<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class GetRiskStatisticsResponse extends Model
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

    // 风险总数
    /**
     * @var int
     */
    public $totalRiskTasksCount;

    // 未修复风险数
    /**
     * @var int
     */
    public $unfixedRiskTasksCount;

    // 未响应风险数
    /**
     * @var int
     */
    public $unconfirmedRisksTasksCount;

    // 镜像漏洞风险数
    /**
     * @var int
     */
    public $imageRiskTasksCount;

    // 基线风险数
    /**
     * @var int
     */
    public $benchmarkRiskTasksCount;

    // 运行时风险数
    /**
     * @var int
     */
    public $runtimeRiskTasksCount;
    protected $_name = [
        'reqMsgId'                   => 'req_msg_id',
        'resultCode'                 => 'result_code',
        'resultMsg'                  => 'result_msg',
        'totalRiskTasksCount'        => 'total_risk_tasks_count',
        'unfixedRiskTasksCount'      => 'unfixed_risk_tasks_count',
        'unconfirmedRisksTasksCount' => 'unconfirmed_risks_tasks_count',
        'imageRiskTasksCount'        => 'image_risk_tasks_count',
        'benchmarkRiskTasksCount'    => 'benchmark_risk_tasks_count',
        'runtimeRiskTasksCount'      => 'runtime_risk_tasks_count',
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
        if (null !== $this->totalRiskTasksCount) {
            $res['total_risk_tasks_count'] = $this->totalRiskTasksCount;
        }
        if (null !== $this->unfixedRiskTasksCount) {
            $res['unfixed_risk_tasks_count'] = $this->unfixedRiskTasksCount;
        }
        if (null !== $this->unconfirmedRisksTasksCount) {
            $res['unconfirmed_risks_tasks_count'] = $this->unconfirmedRisksTasksCount;
        }
        if (null !== $this->imageRiskTasksCount) {
            $res['image_risk_tasks_count'] = $this->imageRiskTasksCount;
        }
        if (null !== $this->benchmarkRiskTasksCount) {
            $res['benchmark_risk_tasks_count'] = $this->benchmarkRiskTasksCount;
        }
        if (null !== $this->runtimeRiskTasksCount) {
            $res['runtime_risk_tasks_count'] = $this->runtimeRiskTasksCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRiskStatisticsResponse
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
        if (isset($map['total_risk_tasks_count'])) {
            $model->totalRiskTasksCount = $map['total_risk_tasks_count'];
        }
        if (isset($map['unfixed_risk_tasks_count'])) {
            $model->unfixedRiskTasksCount = $map['unfixed_risk_tasks_count'];
        }
        if (isset($map['unconfirmed_risks_tasks_count'])) {
            $model->unconfirmedRisksTasksCount = $map['unconfirmed_risks_tasks_count'];
        }
        if (isset($map['image_risk_tasks_count'])) {
            $model->imageRiskTasksCount = $map['image_risk_tasks_count'];
        }
        if (isset($map['benchmark_risk_tasks_count'])) {
            $model->benchmarkRiskTasksCount = $map['benchmark_risk_tasks_count'];
        }
        if (isset($map['runtime_risk_tasks_count'])) {
            $model->runtimeRiskTasksCount = $map['runtime_risk_tasks_count'];
        }

        return $model;
    }
}
