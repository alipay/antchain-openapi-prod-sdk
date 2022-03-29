<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DelayInfo extends Model
{
    // 延迟时间
    /**
     * @example delayTime
     *
     * @var string
     */
    public $name;

    // 值
    /**
     * @example 1631000629
     *
     * @var string
     */
    public $value;

    // 值类型
    /**
     * @example TIMESTAMP
     *
     * @var string
     */
    public $valueType;
    protected $_name = [
        'name'      => 'name',
        'value'     => 'value',
        'valueType' => 'value_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('valueType', $this->valueType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DelayInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }

        return $model;
    }
}
