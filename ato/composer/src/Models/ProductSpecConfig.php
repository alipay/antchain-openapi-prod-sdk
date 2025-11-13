<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ProductSpecConfig extends Model
{
    // 规格名称
    /**
     * @example color
     *
     * @var string
     */
    public $specKey;

    // 规格名称
    /**
     * @example 颜色
     *
     * @var string
     */
    public $displayName;

    // 允许值列表
    /**
     * @example
     *
     * @var ProductSpecValue[]
     */
    public $specValueList;
    protected $_name = [
        'specKey'       => 'spec_key',
        'displayName'   => 'display_name',
        'specValueList' => 'spec_value_list',
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
        if (null !== $this->specValueList) {
            $res['spec_value_list'] = [];
            if (null !== $this->specValueList && \is_array($this->specValueList)) {
                $n = 0;
                foreach ($this->specValueList as $item) {
                    $res['spec_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductSpecConfig
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
        if (isset($map['spec_value_list'])) {
            if (!empty($map['spec_value_list'])) {
                $model->specValueList = [];
                $n                    = 0;
                foreach ($map['spec_value_list'] as $item) {
                    $model->specValueList[$n++] = null !== $item ? ProductSpecValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
