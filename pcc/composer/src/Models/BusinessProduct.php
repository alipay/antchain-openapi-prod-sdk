<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class BusinessProduct extends Model
{
    // 业务产品code
    /**
     * @example BAASPLUS
     *
     * @var string
     */
    public $code;

    // 产品线名称
    /**
     * @example BaaS增值服务
     *
     * @var string
     */
    public $name;

    // 归属业务线
    /**
     * @example 10010
     *
     * @var string
     */
    public $businessLine;

    // 归属产品线
    /**
     * @example 10010
     *
     * @var string
     */
    public $productLine;

    // spu列表
    /**
     * @example
     *
     * @var ProductSpu[]
     */
    public $productSpu;
    protected $_name = [
        'code'         => 'code',
        'name'         => 'name',
        'businessLine' => 'business_line',
        'productLine'  => 'product_line',
        'productSpu'   => 'product_spu',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('businessLine', $this->businessLine, true);
        Model::validateRequired('productLine', $this->productLine, true);
        Model::validateRequired('productSpu', $this->productSpu, true);
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
        if (null !== $this->businessLine) {
            $res['business_line'] = $this->businessLine;
        }
        if (null !== $this->productLine) {
            $res['product_line'] = $this->productLine;
        }
        if (null !== $this->productSpu) {
            $res['product_spu'] = [];
            if (null !== $this->productSpu && \is_array($this->productSpu)) {
                $n = 0;
                foreach ($this->productSpu as $item) {
                    $res['product_spu'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessProduct
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
        if (isset($map['business_line'])) {
            $model->businessLine = $map['business_line'];
        }
        if (isset($map['product_line'])) {
            $model->productLine = $map['product_line'];
        }
        if (isset($map['product_spu'])) {
            if (!empty($map['product_spu'])) {
                $model->productSpu = [];
                $n                 = 0;
                foreach ($map['product_spu'] as $item) {
                    $model->productSpu[$n++] = null !== $item ? ProductSpu::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
