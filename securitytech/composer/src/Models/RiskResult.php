<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RiskResult extends Model
{
    // 数据列表
    /**
     * @example
     *
     * @var RiskData[]
     */
    public $riskData;

    // 解决方案编码
    /**
     * @example ·
     *
     * @var string
     */
    public $solutionCode;
    protected $_name = [
        'riskData'     => 'risk_data',
        'solutionCode' => 'solution_code',
    ];

    public function validate()
    {
        Model::validateRequired('riskData', $this->riskData, true);
        Model::validateRequired('solutionCode', $this->solutionCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskData) {
            $res['risk_data'] = [];
            if (null !== $this->riskData && \is_array($this->riskData)) {
                $n = 0;
                foreach ($this->riskData as $item) {
                    $res['risk_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->solutionCode) {
            $res['solution_code'] = $this->solutionCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_data'])) {
            if (!empty($map['risk_data'])) {
                $model->riskData = [];
                $n               = 0;
                foreach ($map['risk_data'] as $item) {
                    $model->riskData[$n++] = null !== $item ? RiskData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['solution_code'])) {
            $model->solutionCode = $map['solution_code'];
        }

        return $model;
    }
}
