<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class TemplateTextAreaComponent extends Model
{
    // 模板编码
    /**
     * @example T20240505151148001384
     *
     * @var string
     */
    public $templateCode;

    // 模版版本号
    /**
     * @example 1
     *
     * @var string
     */
    public $templateVersion;

    // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
    /**
     * @example INPUT
     *
     * @var string
     */
    public $componentType;

    // 组件名称（占位符）
    /**
     * @example 公司名称
     *
     * @var string
     */
    public $componentName;

    // 是否必填
    /**
     * @example true
     *
     * @var bool
     */
    public $required;

    // 预估文本行数
    /**
     * @example 1
     *
     * @var int
     */
    public $line;

    // 多行文本域名称
    /**
     * @example 公司地址
     *
     * @var string
     */
    public $multiName;

    // 前端传入的文本域映射字段
    /**
     * @example CP20250721172015013576
     *
     * @var string
     */
    public $preElementCode;
    protected $_name = [
        'templateCode'    => 'template_code',
        'templateVersion' => 'template_version',
        'componentType'   => 'component_type',
        'componentName'   => 'component_name',
        'required'        => 'required',
        'line'            => 'line',
        'multiName'       => 'multi_name',
        'preElementCode'  => 'pre_element_code',
    ];

    public function validate()
    {
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateVersion', $this->templateVersion, true);
        Model::validateRequired('componentType', $this->componentType, true);
        Model::validateRequired('componentName', $this->componentName, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('multiName', $this->multiName, true);
        Model::validateRequired('preElementCode', $this->preElementCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->componentType) {
            $res['component_type'] = $this->componentType;
        }
        if (null !== $this->componentName) {
            $res['component_name'] = $this->componentName;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->line) {
            $res['line'] = $this->line;
        }
        if (null !== $this->multiName) {
            $res['multi_name'] = $this->multiName;
        }
        if (null !== $this->preElementCode) {
            $res['pre_element_code'] = $this->preElementCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateTextAreaComponent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['component_type'])) {
            $model->componentType = $map['component_type'];
        }
        if (isset($map['component_name'])) {
            $model->componentName = $map['component_name'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['line'])) {
            $model->line = $map['line'];
        }
        if (isset($map['multi_name'])) {
            $model->multiName = $map['multi_name'];
        }
        if (isset($map['pre_element_code'])) {
            $model->preElementCode = $map['pre_element_code'];
        }

        return $model;
    }
}
