<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConnectorConfigs extends Model
{
    // 前端控件类型
    /**
     * @example input、select、radio
     *
     * @var string
     */
    public $control;

    // 控件描述：中文、展示给用户
    /**
     * @example 表名称
     *
     * @var string
     */
    public $description;

    // 配置项名称
    /**
     * @example table
     *
     * @var string
     */
    public $name;

    // 选项控件的所有选项
    /**
     * @example A、B、C
     *
     * @var string[]
     */
    public $selectOptions;

    // radio控件的所有选项
    /**
     * @example LDC路由，当前zone路由
     *
     * @var string[]
     */
    public $radioOptions;

    // 描述本配置的子配置名称，如果本配置是 选项类型，那么如果本选项被选中后，子控件才可见。
    /**
     * @example table
     *
     * @var string
     */
    public $child;

    // 本配置是否可见，也即控件是否被用户可见
    /**
     * @example true, false
     *
     * @var bool
     */
    public $visible;

    // 代表 本配置 的 父配置名称，便于做 控件间联动
    /**
     * @example routeStagety
     *
     * @var string
     */
    public $parent;
    protected $_name = [
        'control'       => 'control',
        'description'   => 'description',
        'name'          => 'name',
        'selectOptions' => 'select_options',
        'radioOptions'  => 'radio_options',
        'child'         => 'child',
        'visible'       => 'visible',
        'parent'        => 'parent',
    ];

    public function validate()
    {
        Model::validateRequired('control', $this->control, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('visible', $this->visible, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->control) {
            $res['control'] = $this->control;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->selectOptions) {
            $res['select_options'] = $this->selectOptions;
        }
        if (null !== $this->radioOptions) {
            $res['radio_options'] = $this->radioOptions;
        }
        if (null !== $this->child) {
            $res['child'] = $this->child;
        }
        if (null !== $this->visible) {
            $res['visible'] = $this->visible;
        }
        if (null !== $this->parent) {
            $res['parent'] = $this->parent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectorConfigs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['control'])) {
            $model->control = $map['control'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['select_options'])) {
            if (!empty($map['select_options'])) {
                $model->selectOptions = $map['select_options'];
            }
        }
        if (isset($map['radio_options'])) {
            if (!empty($map['radio_options'])) {
                $model->radioOptions = $map['radio_options'];
            }
        }
        if (isset($map['child'])) {
            $model->child = $map['child'];
        }
        if (isset($map['visible'])) {
            $model->visible = $map['visible'];
        }
        if (isset($map['parent'])) {
            $model->parent = $map['parent'];
        }

        return $model;
    }
}
