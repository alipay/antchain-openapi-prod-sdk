<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class ProductLine extends Model
{
    // 溯源产品
    /**
     * @example 10051
     *
     * @var string
     */
    public $code;

    // 产品线名称
    /**
     * @example 溯源产品
     *
     * @var string
     */
    public $name;

    // 业务产品线code
    /**
     * @example 10010
     *
     * @var string
     */
    public $businessLineCode;

    // l3
    /**
     * @example
     *
     * @var BusinessProduct[]
     */
    public $businessProduct;
    protected $_name = [
        'code'             => 'code',
        'name'             => 'name',
        'businessLineCode' => 'business_line_code',
        'businessProduct'  => 'business_product',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('businessLineCode', $this->businessLineCode, true);
        Model::validateRequired('businessProduct', $this->businessProduct, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->businessLineCode) {
            $res['business_line_code'] = $this->businessLineCode;
        }
        if (null !== $this->businessProduct) {
            $res['business_product'] = [];
            if (null !== $this->businessProduct && \is_array($this->businessProduct)) {
                $n = 0;
                foreach ($this->businessProduct as $item) {
                    $res['business_product'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductLine
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['business_line_code'])) {
            $model->businessLineCode = $map['business_line_code'];
        }
        if (isset($map['business_product'])) {
            if (!empty($map['business_product'])) {
                $model->businessProduct = [];
                $n                      = 0;
                foreach ($map['business_product'] as $item) {
                    $model->businessProduct[$n++] = null !== $item ? BusinessProduct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
