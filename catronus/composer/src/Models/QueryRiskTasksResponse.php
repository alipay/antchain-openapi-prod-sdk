<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskTasksResponse extends Model
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

    // 风险任务列表
    /**
     * @var RiskTask[]
     */
    public $riskTasks;

    // 总条目数
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'riskTasks'  => 'risk_tasks',
        'totalSize'  => 'total_size',
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
        if (null !== $this->riskTasks) {
            $res['risk_tasks'] = [];
            if (null !== $this->riskTasks && \is_array($this->riskTasks)) {
                $n = 0;
                foreach ($this->riskTasks as $item) {
                    $res['risk_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskTasksResponse
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
        if (isset($map['risk_tasks'])) {
            if (!empty($map['risk_tasks'])) {
                $model->riskTasks = [];
                $n                = 0;
                foreach ($map['risk_tasks'] as $item) {
                    $model->riskTasks[$n++] = null !== $item ? RiskTask::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}
