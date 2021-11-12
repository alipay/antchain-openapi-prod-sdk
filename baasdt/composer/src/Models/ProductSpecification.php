<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ProductSpecification extends Model
{
    // 规格名称
    /**
     * @example 尺寸
     *
     * @var string
     */
    public $specificationName;

    // 规格值
    /**
     * @example 400x400
     *
     * @var string
     */
    public $specificationValue;
    protected $_name = [
        'specificationName'  => 'specification_name',
        'specificationValue' => 'specification_value',
    ];

    public function validate()
    {
        Model::validateRequired('specificationName', $this->specificationName, true);
        Model::validateRequired('specificationValue', $this->specificationValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specificationName) {
            $res['specification_name'] = $this->specificationName;
        }
        if (null !== $this->specificationValue) {
            $res['specification_value'] = $this->specificationValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductSpecification
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['specification_name'])) {
            $model->specificationName = $map['specification_name'];
        }
        if (isset($map['specification_value'])) {
            $model->specificationValue = $map['specification_value'];
        }

        return $model;
    }
}
