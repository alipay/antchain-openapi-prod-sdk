<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class EventResource extends Model
{
    // 资源类型
    /**
     * @example INSTANCE_ID
     *
     * @var string
     */
    public $type;

    // 实例ID
    /**
     * @example ACSJKLHERJHKHSDS
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'type'  => 'type',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
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
     * @return EventResource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
