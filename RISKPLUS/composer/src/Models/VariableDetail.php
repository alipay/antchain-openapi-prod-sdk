<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class VariableDetail extends Model {
    protected $_name = [
        'productCode' => 'product_code',
        'variableName' => 'variable_name',
        'variableValue' => 'variable_value',
        'variableType' => 'variable_type',
    ];
    public function validate() {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('variableName', $this->variableName, true);
        Model::validateRequired('variableValue', $this->variableValue, true);
        Model::validateRequired('variableType', $this->variableType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
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
     * @return VariableDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['variable_name'])){
            $model->variableName = $map['variable_name'];
        }
        if(isset($map['variable_value'])){
            $model->variableValue = $map['variable_value'];
        }
        if(isset($map['variable_type'])){
            $model->variableType = $map['variable_type'];
        }
        return $model;
    }
    // 产品码
    /**
     * @example test
     * @var string
     */
    public $productCode;

    // 变量名称
    /**
     * @example test
     * @var string
     */
    public $variableName;

    // 变量值
    /**
     * @example test
     * @var string
     */
    public $variableValue;

    // 变量类型
    /**
     * @example hello
     * @var string
     */
    public $variableType;

}
