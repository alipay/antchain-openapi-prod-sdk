<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RiskData extends Model
{
    // 模型/标签编号
    /**
     * @example ·
     *
     * @var string
     */
    public $resultKey;

    // 模型分/标签值
    /**
     * @example ·
     *
     * @var string
     */
    public $resultValue;
    protected $_name = [
        'resultKey'   => 'result_key',
        'resultValue' => 'result_value',
    ];

    public function validate()
    {
        Model::validateRequired('resultKey', $this->resultKey, true);
        Model::validateRequired('resultValue', $this->resultValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resultKey) {
            $res['result_key'] = $this->resultKey;
        }
        if (null !== $this->resultValue) {
            $res['result_value'] = $this->resultValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result_key'])) {
            $model->resultKey = $map['result_key'];
        }
        if (isset($map['result_value'])) {
            $model->resultValue = $map['result_value'];
        }

        return $model;
    }
}
