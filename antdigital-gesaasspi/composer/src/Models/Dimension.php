<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class Dimension extends Model
{
    // 维度
    /**
     * @example voucher_template_id
     *
     * @var string
     */
    public $dimension;

    // 维度值
    /**
     * @example 2025122400073001038200J7964H
     *
     * @var string
     */
    public $dimensionValue;
    protected $_name = [
        'dimension'      => 'dimension',
        'dimensionValue' => 'dimension_value',
    ];

    public function validate()
    {
        Model::validateRequired('dimension', $this->dimension, true);
        Model::validateRequired('dimensionValue', $this->dimensionValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dimension) {
            $res['dimension'] = $this->dimension;
        }
        if (null !== $this->dimensionValue) {
            $res['dimension_value'] = $this->dimensionValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Dimension
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dimension'])) {
            $model->dimension = $map['dimension'];
        }
        if (isset($map['dimension_value'])) {
            $model->dimensionValue = $map['dimension_value'];
        }

        return $model;
    }
}
