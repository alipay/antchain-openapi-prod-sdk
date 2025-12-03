<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryQmpOfflinehostplanDecisionresultsResponse extends Model
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

    // 托管计划编码
    /**
     * @var string
     */
    public $planCode;

    // 分层结果信息
    /**
     * @var DecisionInfo[]
     */
    public $decisionInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'planCode'     => 'plan_code',
        'decisionInfo' => 'decision_info',
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
        if (null !== $this->planCode) {
            $res['plan_code'] = $this->planCode;
        }
        if (null !== $this->decisionInfo) {
            $res['decision_info'] = [];
            if (null !== $this->decisionInfo && \is_array($this->decisionInfo)) {
                $n = 0;
                foreach ($this->decisionInfo as $item) {
                    $res['decision_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQmpOfflinehostplanDecisionresultsResponse
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
        if (isset($map['plan_code'])) {
            $model->planCode = $map['plan_code'];
        }
        if (isset($map['decision_info'])) {
            if (!empty($map['decision_info'])) {
                $model->decisionInfo = [];
                $n                   = 0;
                foreach ($map['decision_info'] as $item) {
                    $model->decisionInfo[$n++] = null !== $item ? DecisionInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
