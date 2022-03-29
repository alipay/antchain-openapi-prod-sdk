<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UIControlModel extends Model
{
    // 展示给用户查看的描述。
    /**
     * @example topic名称
     *
     * @var string
     */
    public $display;

    // 提示信息，参照Tooltip
    /**
     * @example cron表达式形如 * * * * * * ？
     *
     * @var string
     */
    public $hint;

    // 控件名称，也是控件绑定的数据 key
    /**
     * @example tableName
     *
     * @var string
     */
    public $name;

    // 如果本控件是 select 或者 radio 选择框类型，本数组是 所有 选项的具体信息。
    /**
     * @example
     *
     * @var UIOptionModel[]
     */
    public $options;

    // input控件独有字段，代表输入框的place holder
    /**
     * @example 请输入
     *
     * @var string
     */
    public $placeHolder;

    // 该控件的value是否是必须的
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 本控件的值必须满足的规则，例如input，那么可能输入的文本必须满足全英文等；以正则表达式的形式。
    /**
     * @example ^[A-Za-z0-9]+$
     *
     * @var string
     */
    public $rule;

    // 当 用户输入的 值与 rule不符合时，提醒用户出错的备注。
    /**
     * @example 填写的数据必须是英文和数字
     *
     * @var string
     */
    public $ruleRemark;

    // 控件的类型；支持 Select、Radio、Input、DatePicking
    /**
     * @example select
     *
     * @var string
     */
    public $type;

    // 本控件是否未联动控件，联动控件是否展示 与 union_control和union_value 相关，当联动的父控件union_control的值为union_value时，本控件才可见。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $union;

    // 联动的控件名称，即name
    /**
     * @example topicConfig
     *
     * @var string
     */
    public $unionControl;

    // 当联动空间union_control的值是本字段的值时，本联动控件可以展示。
    /**
     * @example customized
     *
     * @var string
     */
    public $unionValue;

    // 本控件对应的值；如果是input，那么就是输入的值；如果是select/radio，那就是选项的值；如果是option，那么就是自己本身的枚举值。
    /**
     * @example TP_DEFAULT
     *
     * @var string
     */
    public $value;

    // 该控件的值是否可以修改
    /**
     * @example true, false
     *
     * @var bool
     */
    public $immutable;
    protected $_name = [
        'display'      => 'display',
        'hint'         => 'hint',
        'name'         => 'name',
        'options'      => 'options',
        'placeHolder'  => 'place_holder',
        'required'     => 'required',
        'rule'         => 'rule',
        'ruleRemark'   => 'rule_remark',
        'type'         => 'type',
        'union'        => 'union',
        'unionControl' => 'union_control',
        'unionValue'   => 'union_value',
        'value'        => 'value',
        'immutable'    => 'immutable',
    ];

    public function validate()
    {
        Model::validateRequired('display', $this->display, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('union', $this->union, true);
        Model::validateRequired('immutable', $this->immutable, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->display) {
            $res['display'] = $this->display;
        }
        if (null !== $this->hint) {
            $res['hint'] = $this->hint;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->options) {
            $res['options'] = [];
            if (null !== $this->options && \is_array($this->options)) {
                $n = 0;
                foreach ($this->options as $item) {
                    $res['options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->placeHolder) {
            $res['place_holder'] = $this->placeHolder;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->rule) {
            $res['rule'] = $this->rule;
        }
        if (null !== $this->ruleRemark) {
            $res['rule_remark'] = $this->ruleRemark;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->union) {
            $res['union'] = $this->union;
        }
        if (null !== $this->unionControl) {
            $res['union_control'] = $this->unionControl;
        }
        if (null !== $this->unionValue) {
            $res['union_value'] = $this->unionValue;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->immutable) {
            $res['immutable'] = $this->immutable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UIControlModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display'])) {
            $model->display = $map['display'];
        }
        if (isset($map['hint'])) {
            $model->hint = $map['hint'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['options'])) {
            if (!empty($map['options'])) {
                $model->options = [];
                $n              = 0;
                foreach ($map['options'] as $item) {
                    $model->options[$n++] = null !== $item ? UIOptionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['place_holder'])) {
            $model->placeHolder = $map['place_holder'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['rule'])) {
            $model->rule = $map['rule'];
        }
        if (isset($map['rule_remark'])) {
            $model->ruleRemark = $map['rule_remark'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['union'])) {
            $model->union = $map['union'];
        }
        if (isset($map['union_control'])) {
            $model->unionControl = $map['union_control'];
        }
        if (isset($map['union_value'])) {
            $model->unionValue = $map['union_value'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['immutable'])) {
            $model->immutable = $map['immutable'];
        }

        return $model;
    }
}
