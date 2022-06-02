<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class Key extends Model
{
    // 名称（key的中文名称）
    /**
     * @example test
     *
     * @var string
     */
    public $key;

    // id
    /**
     * @example 123232423
     *
     * @var string
     */
    public $id;

    // input, // 普通输入框
    // dropdownSelect, // 下拉选择
    // cardSelect, // 平铺选择
    // password, // 密码输入框，这个类型会包含忘记密码按钮
    // smsCode, // 手机验证码
    // qrcodeLogin, // 二维码登录
    // hiddenField,// 隐藏字段，页面上不显示，但是值会提交给后端
    /**
     * @example cardSelect
     *
     * @var string
     */
    public $type;

    // 字段名称 例如：密码
    /**
     * @example dd
     *
     * @var string
     */
    public $label;

    // 输入框的值类型，字符串还是数字，默认 string/number/paassword
    /**
     * @example number
     *
     * @var string
     */
    public $inputType;

    // 字段的初始值，类型要和前端提交的类型保持一致，且是可被 JSON 序列化的
    /**
     * @example ddd
     *
     * @var string
     */
    public $initialValue;

    // 占位符，比如”请输入密码“
    /**
     * @example 请输入密码
     *
     * @var string
     */
    public $placeholder;

    // 是否为禁用状态，true 表示禁用，默认 false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $disabled;

    // 表示输入框是否为只读状态（只读和禁用都不能输入，但是样式不一样，所以要注意区分，不要同时声明 disabled 和 readOnly，否则以 disabled 优先）
    /**
     * @example true
     *
     * @var string
     */
    public $readOnly;

    // 这个字段的提示说明文案
    /**
     * @example 这个字段的提示说明文案，点击字段名称右侧的 icon 时显示
     *
     * @var string
     */
    public $tooltip;

    // 校验规则
    /**
     * @example 校验规则
     *
     * @var Rule[]
     */
    public $rules;

    // 逻辑列表
    /**
     * @example
     *
     * @var Logic[]
     */
    public $logics;

    // 选择列表的可选值，只有 type 是 dropdownSelect、cardSelect 时才需要
    /**
     * @example
     *
     * @var SelectOption[]
     */
    public $selectOptions;

    // 忘记密码元素
    /**
     * @example
     *
     * @var ForgetMeta
     */
    public $forgetMeta;
    protected $_name = [
        'key'           => 'key',
        'id'            => 'id',
        'type'          => 'type',
        'label'         => 'label',
        'inputType'     => 'input_type',
        'initialValue'  => 'initial_value',
        'placeholder'   => 'placeholder',
        'disabled'      => 'disabled',
        'readOnly'      => 'read_only',
        'tooltip'       => 'tooltip',
        'rules'         => 'rules',
        'logics'        => 'logics',
        'selectOptions' => 'select_options',
        'forgetMeta'    => 'forget_meta',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('label', $this->label, true);
        Model::validateRequired('inputType', $this->inputType, true);
        Model::validateRequired('initialValue', $this->initialValue, true);
        Model::validateRequired('placeholder', $this->placeholder, true);
        Model::validateRequired('disabled', $this->disabled, true);
        Model::validateRequired('readOnly', $this->readOnly, true);
        Model::validateRequired('tooltip', $this->tooltip, true);
        Model::validateRequired('rules', $this->rules, true);
        Model::validateRequired('logics', $this->logics, true);
        Model::validateRequired('selectOptions', $this->selectOptions, true);
        Model::validateRequired('forgetMeta', $this->forgetMeta, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->inputType) {
            $res['input_type'] = $this->inputType;
        }
        if (null !== $this->initialValue) {
            $res['initial_value'] = $this->initialValue;
        }
        if (null !== $this->placeholder) {
            $res['placeholder'] = $this->placeholder;
        }
        if (null !== $this->disabled) {
            $res['disabled'] = $this->disabled;
        }
        if (null !== $this->readOnly) {
            $res['read_only'] = $this->readOnly;
        }
        if (null !== $this->tooltip) {
            $res['tooltip'] = $this->tooltip;
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->logics) {
            $res['logics'] = [];
            if (null !== $this->logics && \is_array($this->logics)) {
                $n = 0;
                foreach ($this->logics as $item) {
                    $res['logics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->selectOptions) {
            $res['select_options'] = [];
            if (null !== $this->selectOptions && \is_array($this->selectOptions)) {
                $n = 0;
                foreach ($this->selectOptions as $item) {
                    $res['select_options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->forgetMeta) {
            $res['forget_meta'] = null !== $this->forgetMeta ? $this->forgetMeta->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Key
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['input_type'])) {
            $model->inputType = $map['input_type'];
        }
        if (isset($map['initial_value'])) {
            $model->initialValue = $map['initial_value'];
        }
        if (isset($map['placeholder'])) {
            $model->placeholder = $map['placeholder'];
        }
        if (isset($map['disabled'])) {
            $model->disabled = $map['disabled'];
        }
        if (isset($map['read_only'])) {
            $model->readOnly = $map['read_only'];
        }
        if (isset($map['tooltip'])) {
            $model->tooltip = $map['tooltip'];
        }
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? Rule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['logics'])) {
            if (!empty($map['logics'])) {
                $model->logics = [];
                $n             = 0;
                foreach ($map['logics'] as $item) {
                    $model->logics[$n++] = null !== $item ? Logic::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['select_options'])) {
            if (!empty($map['select_options'])) {
                $model->selectOptions = [];
                $n                    = 0;
                foreach ($map['select_options'] as $item) {
                    $model->selectOptions[$n++] = null !== $item ? SelectOption::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['forget_meta'])) {
            $model->forgetMeta = ForgetMeta::fromMap($map['forget_meta']);
        }

        return $model;
    }
}
