<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskSolutionsResponse extends Model
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

    // 风险解决方案列表
    /**
     * @var RiskSolution[]
     */
    public $riskSolutions;

    // 总数
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'riskSolutions' => 'risk_solutions',
        'totalCount'    => 'total_count',
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
        if (null !== $this->riskSolutions) {
            $res['risk_solutions'] = [];
            if (null !== $this->riskSolutions && \is_array($this->riskSolutions)) {
                $n = 0;
                foreach ($this->riskSolutions as $item) {
                    $res['risk_solutions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskSolutionsResponse
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
        if (isset($map['risk_solutions'])) {
            if (!empty($map['risk_solutions'])) {
                $model->riskSolutions = [];
                $n                    = 0;
                foreach ($map['risk_solutions'] as $item) {
                    $model->riskSolutions[$n++] = null !== $item ? RiskSolution::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
