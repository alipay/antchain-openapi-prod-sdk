<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UnionControlModel extends Model
{
    // 具体的联动 控件模型
    /**
     * @example
     *
     * @var UIControlModel
     */
    public $control;

    // 本联动控件对应的父控件的名称，例如本联动控件是input，父控件是select，想要做到select选择某个特定选项后展示input控件，那么本字段就是 select控件的name。
    /**
     * @example topicConfig
     *
     * @var string
     */
    public $unionControl;

    // 对应父控件的value为本字段的值时，本联动控件会展示出来。例如：当topicConfig这个select控件的值是 customized时，本联动控件input就能展示了。
    /**
     * @example customized
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'control'      => 'control',
        'unionControl' => 'union_control',
        'value'        => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('control', $this->control, true);
        Model::validateRequired('unionControl', $this->unionControl, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->control) {
            $res['control'] = null !== $this->control ? $this->control->toMap() : null;
        }
        if (null !== $this->unionControl) {
            $res['union_control'] = $this->unionControl;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnionControlModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['control'])) {
            $model->control = UIControlModel::fromMap($map['control']);
        }
        if (isset($map['union_control'])) {
            $model->unionControl = $map['union_control'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
