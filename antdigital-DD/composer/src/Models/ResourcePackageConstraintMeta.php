<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ResourcePackageConstraintMeta extends Model {
    protected $_name = [
        'templateName' => 'template_name',
        'constraintCode' => 'constraint_code',
        'constraintName' => 'constraint_name',
        'constraintExpression' => 'constraint_expression',
        'constraintType' => 'constraint_type',
    ];
    public function validate() {
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateRequired('constraintCode', $this->constraintCode, true);
        Model::validateRequired('constraintName', $this->constraintName, true);
        Model::validateRequired('constraintExpression', $this->constraintExpression, true);
        Model::validateRequired('constraintType', $this->constraintType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->constraintCode) {
            $res['constraint_code'] = $this->constraintCode;
        }
        if (null !== $this->constraintName) {
            $res['constraint_name'] = $this->constraintName;
        }
        if (null !== $this->constraintExpression) {
            $res['constraint_expression'] = $this->constraintExpression;
        }
        if (null !== $this->constraintType) {
            $res['constraint_type'] = $this->constraintType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResourcePackageConstraintMeta
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['constraint_code'])){
            $model->constraintCode = $map['constraint_code'];
        }
        if(isset($map['constraint_name'])){
            $model->constraintName = $map['constraint_name'];
        }
        if(isset($map['constraint_expression'])){
            $model->constraintExpression = $map['constraint_expression'];
        }
        if(isset($map['constraint_type'])){
            $model->constraintType = $map['constraint_type'];
        }
        return $model;
    }
    // 模板code
    /**
     * @example test_deadline
     * @var string
     */
    public $templateName;

    // 约束码
    /**
     * @example productCode
     * @var string
     */
    public $constraintCode;

    // 约束名称
    /**
     * @example 抵扣约束
     * @var string
     */
    public $constraintName;

    // 约束表达式
    /**
     * @example ql表达式
     * @var string
     */
    public $constraintExpression;

    // 约束类型
    /**
     * @example DEDUCT
     * @var string
     */
    public $constraintType;

}
