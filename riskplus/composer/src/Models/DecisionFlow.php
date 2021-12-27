<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class DecisionFlow extends Model
{
    // 输出参数
    /**
     * @example
     *
     * @var OutParams
     */
    public $decisionFlow;

    // 决策结果
    /**
     * @example reject
     *
     * @var string
     */
    public $decision;

    // infocodes
    /**
     * @example infocodes
     *
     * @var InfoCodes
     */
    public $infoCodes;
    protected $_name = [
        'decisionFlow' => 'decision_flow',
        'decision'     => 'decision',
        'infoCodes'    => 'info_codes',
    ];

    public function validate()
    {
        Model::validateRequired('decision', $this->decision, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->decisionFlow) {
            $res['decision_flow'] = null !== $this->decisionFlow ? $this->decisionFlow->toMap() : null;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->infoCodes) {
            $res['info_codes'] = null !== $this->infoCodes ? $this->infoCodes->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DecisionFlow
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['decision_flow'])) {
            $model->decisionFlow = OutParams::fromMap($map['decision_flow']);
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['info_codes'])) {
            $model->infoCodes = InfoCodes::fromMap($map['info_codes']);
        }

        return $model;
    }
}
