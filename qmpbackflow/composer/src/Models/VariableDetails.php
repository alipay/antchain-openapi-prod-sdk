<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class VariableDetails extends Model
{
    // 输出变量名称
    /**
     * @example yidun_aft_v3
     *
     * @var string
     */
    public $variableName;

    // 输出变量值
    /**
     * @example 66.6
     *
     * @var string
     */
    public $variableValue;

    // 输出变量值类型
    /**
     * @example Double
     *
     * @var string
     */
    public $variableType;
    protected $_name = [
        'variableName'  => 'variable_name',
        'variableValue' => 'variable_value',
        'variableType'  => 'variable_type',
    ];

    public function validate()
    {
        Model::validateRequired('variableName', $this->variableName, true);
        Model::validateRequired('variableValue', $this->variableValue, true);
        Model::validateRequired('variableType', $this->variableType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->variableName) {
            $res['variable_name'] = $this->variableName;
        }
        if (null !== $this->variableValue) {
            $res['variable_value'] = $this->variableValue;
        }
        if (null !== $this->variableType) {
            $res['variable_type'] = $this->variableType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VariableDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['variable_name'])) {
            $model->variableName = $map['variable_name'];
        }
        if (isset($map['variable_value'])) {
            $model->variableValue = $map['variable_value'];
        }
        if (isset($map['variable_type'])) {
            $model->variableType = $map['variable_type'];
        }

        return $model;
    }
}
