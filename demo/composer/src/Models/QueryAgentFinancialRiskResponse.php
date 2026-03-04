<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentFinancialRiskResponse extends Model
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

    // 风险等级
    /**
     * @var string
     */
    public $riskLevel;

    // 风险建议动作
    /**
     * @var string
     */
    public $suggestedAction;

    // 风险分
    /**
     * @var int
     */
    public $riskScore;

    // 风险因子列表
    /**
     * @var RiskFactorDetail
     */
    public $riskfactors;

    // 处置建议
    /**
     * @var string
     */
    public $recommendations;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'riskLevel'       => 'risk_level',
        'suggestedAction' => 'suggested_action',
        'riskScore'       => 'risk_score',
        'riskfactors'     => 'riskfactors',
        'recommendations' => 'recommendations',
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
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->suggestedAction) {
            $res['suggested_action'] = $this->suggestedAction;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskfactors) {
            $res['riskfactors'] = null !== $this->riskfactors ? $this->riskfactors->toMap() : null;
        }
        if (null !== $this->recommendations) {
            $res['recommendations'] = $this->recommendations;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgentFinancialRiskResponse
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
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['suggested_action'])) {
            $model->suggestedAction = $map['suggested_action'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['riskfactors'])) {
            $model->riskfactors = RiskFactorDetail::fromMap($map['riskfactors']);
        }
        if (isset($map['recommendations'])) {
            $model->recommendations = $map['recommendations'];
        }

        return $model;
    }
}
