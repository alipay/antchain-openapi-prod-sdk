<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ParamModal extends Model
{
    // api meta数据id
    /**
     * @example 0000000049
     *
     * @var string
     */
    public $apiMetaId;

    // api版本id
    /**
     * @example 0000000573
     *
     * @var string
     */
    public $apiVersionId;

    // 数组参数
    /**
     * @example
     *
     * @var ListItem[]
     */
    public $listItem;

    // 结构体id
    /**
     * @example NULL
     *
     * @var string
     */
    public $fieldStructId;

    // 结构体名称
    /**
     * @example NULL
     *
     * @var string
     */
    public $fieldStructName;

    // 参数示例
    /**
     * @example ABC
     *
     * @var string
     */
    public $example;

    // 是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 最大整数长度
    /**
     * @example
     *
     * @var int
     */
    public $maximum;

    // 是否包括最大值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $exclusiveMaximum;

    // 整数的最小值
    /**
     * @example
     *
     * @var int
     */
    public $minimum;

    // 是否排除最小值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $exclusiveMinimum;

    // 字符串的最大长度
    /**
     * @example
     *
     * @var int
     */
    public $maxLength;

    // 字符串的最小长度
    /**
     * @example
     *
     * @var int
     */
    public $minLength;

    // 模式
    /**
     * @example NULL
     *
     * @var string
     */
    public $pattern;

    // 最大元素数目
    /**
     * @example
     *
     * @var int
     */
    public $maxItems;

    // 最小元素数目
    /**
     * @example
     *
     * @var int
     */
    public $minItems;

    // 枚举值
    /**
     * @example FEEDBACK,ISGOOD,NOGOOD
     *
     * @var string
     */
    public $enumValues;

    // 参数名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 参数类型
    /**
     * @example STRING
     *
     * @var string
     */
    public $type;

    // 参数描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 参数特性
    /**
     * @example file_transfer
     *
     * @var string
     */
    public $feature;
    protected $_name = [
        'apiMetaId'        => 'api_meta_id',
        'apiVersionId'     => 'api_version_id',
        'listItem'         => 'list_item',
        'fieldStructId'    => 'field_struct_id',
        'fieldStructName'  => 'field_struct_name',
        'example'          => 'example',
        'required'         => 'required',
        'maximum'          => 'maximum',
        'exclusiveMaximum' => 'exclusive_maximum',
        'minimum'          => 'minimum',
        'exclusiveMinimum' => 'exclusive_minimum',
        'maxLength'        => 'max_length',
        'minLength'        => 'min_length',
        'pattern'          => 'pattern',
        'maxItems'         => 'max_items',
        'minItems'         => 'min_items',
        'enumValues'       => 'enum_values',
        'name'             => 'name',
        'type'             => 'type',
        'description'      => 'description',
        'feature'          => 'feature',
    ];

    public function validate()
    {
        Model::validateRequired('apiMetaId', $this->apiMetaId, true);
        Model::validateRequired('apiVersionId', $this->apiVersionId, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('feature', $this->feature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiMetaId) {
            $res['api_meta_id'] = $this->apiMetaId;
        }
        if (null !== $this->apiVersionId) {
            $res['api_version_id'] = $this->apiVersionId;
        }
        if (null !== $this->listItem) {
            $res['list_item'] = [];
            if (null !== $this->listItem && \is_array($this->listItem)) {
                $n = 0;
                foreach ($this->listItem as $item) {
                    $res['list_item'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fieldStructId) {
            $res['field_struct_id'] = $this->fieldStructId;
        }
        if (null !== $this->fieldStructName) {
            $res['field_struct_name'] = $this->fieldStructName;
        }
        if (null !== $this->example) {
            $res['example'] = $this->example;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->maximum) {
            $res['maximum'] = $this->maximum;
        }
        if (null !== $this->exclusiveMaximum) {
            $res['exclusive_maximum'] = $this->exclusiveMaximum;
        }
        if (null !== $this->minimum) {
            $res['minimum'] = $this->minimum;
        }
        if (null !== $this->exclusiveMinimum) {
            $res['exclusive_minimum'] = $this->exclusiveMinimum;
        }
        if (null !== $this->maxLength) {
            $res['max_length'] = $this->maxLength;
        }
        if (null !== $this->minLength) {
            $res['min_length'] = $this->minLength;
        }
        if (null !== $this->pattern) {
            $res['pattern'] = $this->pattern;
        }
        if (null !== $this->maxItems) {
            $res['max_items'] = $this->maxItems;
        }
        if (null !== $this->minItems) {
            $res['min_items'] = $this->minItems;
        }
        if (null !== $this->enumValues) {
            $res['enum_values'] = $this->enumValues;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->feature) {
            $res['feature'] = $this->feature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParamModal
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_meta_id'])) {
            $model->apiMetaId = $map['api_meta_id'];
        }
        if (isset($map['api_version_id'])) {
            $model->apiVersionId = $map['api_version_id'];
        }
        if (isset($map['list_item'])) {
            if (!empty($map['list_item'])) {
                $model->listItem = [];
                $n               = 0;
                foreach ($map['list_item'] as $item) {
                    $model->listItem[$n++] = null !== $item ? ListItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['field_struct_id'])) {
            $model->fieldStructId = $map['field_struct_id'];
        }
        if (isset($map['field_struct_name'])) {
            $model->fieldStructName = $map['field_struct_name'];
        }
        if (isset($map['example'])) {
            $model->example = $map['example'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['maximum'])) {
            $model->maximum = $map['maximum'];
        }
        if (isset($map['exclusive_maximum'])) {
            $model->exclusiveMaximum = $map['exclusive_maximum'];
        }
        if (isset($map['minimum'])) {
            $model->minimum = $map['minimum'];
        }
        if (isset($map['exclusive_minimum'])) {
            $model->exclusiveMinimum = $map['exclusive_minimum'];
        }
        if (isset($map['max_length'])) {
            $model->maxLength = $map['max_length'];
        }
        if (isset($map['min_length'])) {
            $model->minLength = $map['min_length'];
        }
        if (isset($map['pattern'])) {
            $model->pattern = $map['pattern'];
        }
        if (isset($map['max_items'])) {
            $model->maxItems = $map['max_items'];
        }
        if (isset($map['min_items'])) {
            $model->minItems = $map['min_items'];
        }
        if (isset($map['enum_values'])) {
            $model->enumValues = $map['enum_values'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['feature'])) {
            $model->feature = $map['feature'];
        }

        return $model;
    }
}
