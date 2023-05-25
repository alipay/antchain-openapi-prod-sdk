<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskAuditsResponse extends Model
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

    // 风险任务审计
    /**
     * @var RiskTaskAudit[]
     */
    public $riskTaskAudits;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'riskTaskAudits' => 'risk_task_audits',
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
        if (null !== $this->riskTaskAudits) {
            $res['risk_task_audits'] = [];
            if (null !== $this->riskTaskAudits && \is_array($this->riskTaskAudits)) {
                $n = 0;
                foreach ($this->riskTaskAudits as $item) {
                    $res['risk_task_audits'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskAuditsResponse
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
        if (isset($map['risk_task_audits'])) {
            if (!empty($map['risk_task_audits'])) {
                $model->riskTaskAudits = [];
                $n                     = 0;
                foreach ($map['risk_task_audits'] as $item) {
                    $model->riskTaskAudits[$n++] = null !== $item ? RiskTaskAudit::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
