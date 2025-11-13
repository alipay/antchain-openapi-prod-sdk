<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ProductSpecOption extends Model
{
    // 规格key
    /**
     * @example 规格key
     *
     * @var string
     */
    public $specKey;

    // 规格名称
    /**
     * @example 规格名称
     *
     * @var string
     */
    public $displayName;

    // 规格值
    /**
     * @example 规格值
     *
     * @var string
     */
    public $specValue;
    protected $_name = [
        'specKey'     => 'spec_key',
        'displayName' => 'display_name',
        'specValue'   => 'spec_value',
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
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->specValue) {
            $res['spec_value'] = $this->specValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductSpecOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_key'])) {
            $model->specKey = $map['spec_key'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['spec_value'])) {
            $model->specValue = $map['spec_value'];
        }

        return $model;
    }
}
