<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ContentRiskData extends Model
{
    // 风险名称
    /**
     * @example 风险名称
     *
     * @var string
     */
    public $riskName;
    protected $_name = [
        'riskName' => 'risk_name',
    ];

    public function validate()
    {
        Model::validateRequired('riskName', $this->riskName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskName) {
            $res['risk_name'] = $this->riskName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_name'])) {
            $model->riskName = $map['risk_name'];
        }

        return $model;
    }
}
