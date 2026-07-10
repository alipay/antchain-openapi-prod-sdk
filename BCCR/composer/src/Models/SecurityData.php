<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SecurityData extends Model
{
    // 内容安全检查结果
    /**
     * @example safe,risky
     *
     * @var string
     */
    public $result;

    // 有风险的内容
    /**
     * @example
     *
     * @var string[]
     */
    public $riskData;
    protected $_name = [
        'result'   => 'result',
        'riskData' => 'risk_data',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->riskData) {
            $res['risk_data'] = $this->riskData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['risk_data'])) {
            if (!empty($map['risk_data'])) {
                $model->riskData = $map['risk_data'];
            }
        }

        return $model;
    }
}
