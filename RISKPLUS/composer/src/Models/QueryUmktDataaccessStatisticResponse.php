<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktDataaccessStatisticResponse extends Model
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

    // 回执统计结果
    /**
     * @var StatisticResult
     */
    public $statisticResult;

    // 任务状态
    /**
     * @var string
     */
    public $taskStatus;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'statisticResult' => 'statistic_result',
        'taskStatus'      => 'task_status',
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
        if (null !== $this->statisticResult) {
            $res['statistic_result'] = null !== $this->statisticResult ? $this->statisticResult->toMap() : null;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktDataaccessStatisticResponse
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
        if (isset($map['statistic_result'])) {
            $model->statisticResult = StatisticResult::fromMap($map['statistic_result']);
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }

        return $model;
    }
}
