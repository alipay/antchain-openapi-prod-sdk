<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class AirDomainInfos extends Model
{
    // 决策域信息
    /**
     * @example air_domain
     *
     * @var string
     */
    public $domainCode;

    // 决策域信息
    /**
     * @example review
     *
     * @var string
     */
    public $domainDecision;

    // 决策流输出
    /**
     * @example [{"decision":"review","name":"租赁测试策略"}]
     *
     * @var AirDecisionFlows[]
     */
    public $decisionFlows;
    protected $_name = [
        'domainCode'     => 'domain_code',
        'domainDecision' => 'domain_decision',
        'decisionFlows'  => 'decision_flows',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domainCode) {
            $res['domain_code'] = $this->domainCode;
        }
        if (null !== $this->domainDecision) {
            $res['domain_decision'] = $this->domainDecision;
        }
        if (null !== $this->decisionFlows) {
            $res['decision_flows'] = [];
            if (null !== $this->decisionFlows && \is_array($this->decisionFlows)) {
                $n = 0;
                foreach ($this->decisionFlows as $item) {
                    $res['decision_flows'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AirDomainInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domain_code'])) {
            $model->domainCode = $map['domain_code'];
        }
        if (isset($map['domain_decision'])) {
            $model->domainDecision = $map['domain_decision'];
        }
        if (isset($map['decision_flows'])) {
            if (!empty($map['decision_flows'])) {
                $model->decisionFlows = [];
                $n                    = 0;
                foreach ($map['decision_flows'] as $item) {
                    $model->decisionFlows[$n++] = null !== $item ? AirDecisionFlows::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
