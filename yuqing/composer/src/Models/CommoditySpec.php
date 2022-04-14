<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class CommoditySpec extends Model
{
    // 规格项枚举值
    /**
     * @example 规格项枚举值
     *
     * @var string
     */
    public $specKey;

    // 规格项默认值
    /**
     * @example 规格项默认值
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'specKey' => 'spec_key',
        'value'   => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specKey) {
            $res['spec_key'] = $this->specKey;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommoditySpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_key'])) {
            $model->specKey = $map['spec_key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
