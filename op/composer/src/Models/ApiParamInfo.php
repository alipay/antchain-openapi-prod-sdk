<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiParamInfo extends Model
{
    // api名字
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // api类型
    /**
     * @example STIRING
     *
     * @var string
     */
    public $type;

    // 示例
    /**
     * @example 1000
     *
     * @var string
     */
    public $example;

    // api描述
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

    // 最大数字
    /**
     * @example 1000
     *
     * @var int
     */
    public $maximum;

    // 最小数字
    /**
     * @example 1000
     *
     * @var int
     */
    public $minimum;

    // 字符串最大长度
    /**
     * @example
     *
     * @var int
     */
    public $maxLength;

    // 最小长度
    /**
     * @example true, false
     *
     * @var bool
     */
    public $minLength;

    // 是否支持传输文件
    /**
     * @example true, false
     *
     * @var bool
     */
    public $fileTransfer;

    // 是否为必填字段
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;
    protected $_name = [
        'name'         => 'name',
        'type'         => 'type',
        'example'      => 'example',
        'description'  => 'description',
        'structName'   => 'struct_name',
        'maximum'      => 'maximum',
        'minimum'      => 'minimum',
        'maxLength'    => 'max_length',
        'minLength'    => 'min_length',
        'fileTransfer' => 'file_transfer',
        'required'     => 'required',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('example', $this->example, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('structName', $this->structName, true);
        Model::validateRequired('maximum', $this->maximum, true);
        Model::validateRequired('minimum', $this->minimum, true);
        Model::validateRequired('maxLength', $this->maxLength, true);
        Model::validateRequired('minLength', $this->minLength, true);
        Model::validateRequired('fileTransfer', $this->fileTransfer, true);
        Model::validateRequired('required', $this->required, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (null !== $this->fileTransfer) {
            $res['file_transfer'] = $this->fileTransfer;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiParamInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
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
        if (isset($map['file_transfer'])) {
            $model->fileTransfer = $map['file_transfer'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }

        return $model;
    }
}
