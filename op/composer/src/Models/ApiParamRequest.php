<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiParamRequest extends Model
{
    // api名称
    /**
     * @example test
     *
     * @var string
     */
    public $apiName;

    // api版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $apiVersion;

    // 参数名称
    /**
     * @example param
     *
     * @var string
     */
    public $name;

    // 目标名称
    /**
     * @example test
     *
     * @var string
     */
    public $targetName;

    // 参数类型
    /**
     * @example STRING
     *
     * @var string
     */
    public $type;

    // 链表信息
    /**
     * @example
     *
     * @var ListItem[]
     */
    public $listItem;

    // 参数示例
    /**
     * @example test
     *
     * @var string
     */
    public $example;

    // 参数描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 结构体名称
    /**
     * @example test
     *
     * @var string
     */
    public $structName;

    // 最大值
    /**
     * @example
     *
     * @var int
     */
    public $maximum;

    // 最小值
    /**
     * @example
     *
     * @var int
     */
    public $minimum;

    // 最大长度
    /**
     * @example
     *
     * @var int
     */
    public $maxLength;

    // 最小长度
    /**
     * @example
     *
     * @var int
     */
    public $minLength;

    // 是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 特性
    /**
     * @example NULL
     *
     * @var string
     */
    public $feature;
    protected $_name = [
        'apiName'     => 'api_name',
        'apiVersion'  => 'api_version',
        'name'        => 'name',
        'targetName'  => 'target_name',
        'type'        => 'type',
        'listItem'    => 'list_item',
        'example'     => 'example',
        'description' => 'description',
        'structName'  => 'struct_name',
        'maximum'     => 'maximum',
        'minimum'     => 'minimum',
        'maxLength'   => 'max_length',
        'minLength'   => 'min_length',
        'required'    => 'required',
        'feature'     => 'feature',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('feature', $this->feature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (null !== $this->example) {
            $res['example'] = $this->example;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->structName) {
            $res['struct_name'] = $this->structName;
        }
        if (null !== $this->maximum) {
            $res['maximum'] = $this->maximum;
        }
        if (null !== $this->minimum) {
            $res['minimum'] = $this->minimum;
        }
        if (null !== $this->maxLength) {
            $res['max_length'] = $this->maxLength;
        }
        if (null !== $this->minLength) {
            $res['min_length'] = $this->minLength;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->feature) {
            $res['feature'] = $this->feature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiParamRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
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
        if (isset($map['example'])) {
            $model->example = $map['example'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['struct_name'])) {
            $model->structName = $map['struct_name'];
        }
        if (isset($map['maximum'])) {
            $model->maximum = $map['maximum'];
        }
        if (isset($map['minimum'])) {
            $model->minimum = $map['minimum'];
        }
        if (isset($map['max_length'])) {
            $model->maxLength = $map['max_length'];
        }
        if (isset($map['min_length'])) {
            $model->minLength = $map['min_length'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['feature'])) {
            $model->feature = $map['feature'];
        }

        return $model;
    }
}
