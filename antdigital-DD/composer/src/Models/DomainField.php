<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\FieldValueLimit;

class DomainField extends Model {
    protected $_name = [
        'code' => 'code',
        'englishName' => 'english_name',
        'chineseName' => 'chinese_name',
        'fieldType' => 'field_type',
        'formatLength' => 'format_length',
        'defaultValue' => 'default_value',
        'ifNull' => 'if_null',
        'ifIncrement' => 'if_increment',
        'unit' => 'unit',
        'remark' => 'remark',
        'column' => 'column',
        'fieldValueLimit' => 'field_value_limit',
        'aggregationType' => 'aggregation_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->englishName) {
            $res['english_name'] = $this->englishName;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->fieldType) {
            $res['field_type'] = $this->fieldType;
        }
        if (null !== $this->formatLength) {
            $res['format_length'] = $this->formatLength;
        }
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->ifNull) {
            $res['if_null'] = $this->ifNull;
        }
        if (null !== $this->ifIncrement) {
            $res['if_increment'] = $this->ifIncrement;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->column) {
            $res['column'] = $this->column;
        }
        if (null !== $this->fieldValueLimit) {
            $res['field_value_limit'] = null !== $this->fieldValueLimit ? $this->fieldValueLimit->toMap() : null;
        }
        if (null !== $this->aggregationType) {
            $res['aggregation_type'] = $this->aggregationType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DomainField
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['english_name'])){
            $model->englishName = $map['english_name'];
        }
        if(isset($map['chinese_name'])){
            $model->chineseName = $map['chinese_name'];
        }
        if(isset($map['field_type'])){
            $model->fieldType = $map['field_type'];
        }
        if(isset($map['format_length'])){
            $model->formatLength = $map['format_length'];
        }
        if(isset($map['default_value'])){
            $model->defaultValue = $map['default_value'];
        }
        if(isset($map['if_null'])){
            $model->ifNull = $map['if_null'];
        }
        if(isset($map['if_increment'])){
            $model->ifIncrement = $map['if_increment'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['column'])){
            $model->column = $map['column'];
        }
        if(isset($map['field_value_limit'])){
            $model->fieldValueLimit = FieldValueLimit::fromMap($map['field_value_limit']);
        }
        if(isset($map['aggregation_type'])){
            $model->aggregationType = $map['aggregation_type'];
        }
        return $model;
    }
    // 计量项code
    /**
     * @example request_num
     * @var string
     */
    public $code;

    // 计量项英文名
    /**
     * @example test
     * @var string
     */
    public $englishName;

    // 计量字段中文名称
    /**
     * @example 调用量
     * @var string
     */
    public $chineseName;

    // 枚举，可选
    // 配置型
    // 消耗型
    // *其他
    /**
     * @example config
     * @var string
     */
    public $fieldType;

    // 字段构成索引时的格式化长度<br>
    /**
     * @example -1
     * @var string
     */
    public $formatLength;

    // 默认值,可选
    /**
     * @example 123
     * @var string
     */
    public $defaultValue;

    // 是否必填，默认必填写
    /**
     * @example Y
     * @var string
     */
    public $ifNull;

    // 是否增量推送
    /**
     * @example N
     * @var string
     */
    public $ifIncrement;

    // 单位
    /**
     * @example 元
     * @var string
     */
    public $unit;

    // 计量项说明
    /**
     * @example 计量项说明
     * @var string
     */
    public $remark;

    // 关联字段排序
    /**
     * @example 01
     * @var string
     */
    public $column;

    // 计量项值约束
    /**
     * @example 
     * @var FieldValueLimit
     */
    public $fieldValueLimit;

    // 聚合方式
    /**
     * @example SUM
     * @var string
     */
    public $aggregationType;

}
