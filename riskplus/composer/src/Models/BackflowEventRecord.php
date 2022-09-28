<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BackflowEventRecord extends Model
{
    // 回流事件记录分组，ACTION-触达属性组/SERVICE-业务属性组/CONVERSION-转化属性组
    /**
     * @example BUSINESS
     *
     * @var string
     */
    public $groupCode;

    // 回流事件部分分组后的记录list
    /**
     * @example
     *
     * @var BackflowEventRecordProperty[]
     */
    public $properties;
    protected $_name = [
        'groupCode'  => 'group_code',
        'properties' => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('groupCode', $this->groupCode, true);
        Model::validateRequired('properties', $this->properties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupCode) {
            $res['group_code'] = $this->groupCode;
        }
        if (null !== $this->properties) {
            $res['properties'] = [];
            if (null !== $this->properties && \is_array($this->properties)) {
                $n = 0;
                foreach ($this->properties as $item) {
                    $res['properties'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BackflowEventRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group_code'])) {
            $model->groupCode = $map['group_code'];
        }
        if (isset($map['properties'])) {
            if (!empty($map['properties'])) {
                $model->properties = [];
                $n                 = 0;
                foreach ($map['properties'] as $item) {
                    $model->properties[$n++] = null !== $item ? BackflowEventRecordProperty::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
