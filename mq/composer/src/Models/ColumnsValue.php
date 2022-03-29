<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ColumnsValue extends Model
{
    // 一行的值
    /**
     * @example
     *
     * @var ColumnValue[]
     */
    public $value;
    protected $_name = [
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->value) {
            $res['value'] = [];
            if (null !== $this->value && \is_array($this->value)) {
                $n = 0;
                foreach ($this->value as $item) {
                    $res['value'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ColumnsValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['value'])) {
            if (!empty($map['value'])) {
                $model->value = [];
                $n            = 0;
                foreach ($map['value'] as $item) {
                    $model->value[$n++] = null !== $item ? ColumnValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
