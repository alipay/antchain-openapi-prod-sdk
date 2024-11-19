<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class TemplateComponent extends Model
{
    // 模板编码
    /**
     * @example T20240805190830044214
     *
     * @var string
     */
    public $templateCode;

    // 组件（文本域）id
    /**
     * @example CP20240521161730006569
     *
     * @var string
     */
    public $id;

    // 组件（文本域）名称
    /**
     * @example companyName
     *
     * @var string
     */
    public $name;

    // 组件（文本域）的唯一标识
    /**
     * @example
     *
     * @var string
     */
    public $uk;

    // 占位符，组件（文本域）的展示样式值
    /**
     * @example 【companyName】
     *
     * @var string
     */
    public $placeholder;

    // 组件（文本域）是否可以编辑。取值：Y/N
    /**
     * @example Y
     *
     * @var string
     */
    public $enableEdit;

    // 是否必填，取值：Y/N
    /**
     * @example N
     *
     * @var string
     */
    public $required;

    // 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
    /**
     * @example INPUT
     *
     * @var string
     */
    public $type;

    // 组件（文本域）值
    /**
     * @example xx公司
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'templateCode' => 'template_code',
        'id'           => 'id',
        'name'         => 'name',
        'uk'           => 'uk',
        'placeholder'  => 'placeholder',
        'enableEdit'   => 'enable_edit',
        'required'     => 'required',
        'type'         => 'type',
        'value'        => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->uk) {
            $res['uk'] = $this->uk;
        }
        if (null !== $this->placeholder) {
            $res['placeholder'] = $this->placeholder;
        }
        if (null !== $this->enableEdit) {
            $res['enable_edit'] = $this->enableEdit;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateComponent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['uk'])) {
            $model->uk = $map['uk'];
        }
        if (isset($map['placeholder'])) {
            $model->placeholder = $map['placeholder'];
        }
        if (isset($map['enable_edit'])) {
            $model->enableEdit = $map['enable_edit'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
