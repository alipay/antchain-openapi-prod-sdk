<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SaasTest16\Models;

use AlibabaCloud\Tea\Model;

class QueryMap extends Model
{
    // 键值
    /**
     * @example BUSINESS_CODE
     *
     * @var string
     */
    public $name;

    // 额外用户信息
    /**
     * @example
     *
     * @var NameValuePair[]
     */
    public $value;
    protected $_name = [
        'name'  => 'name',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
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
     * @return QueryMap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['value'])) {
            if (!empty($map['value'])) {
                $model->value = [];
                $n            = 0;
                foreach ($map['value'] as $item) {
                    $model->value[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
