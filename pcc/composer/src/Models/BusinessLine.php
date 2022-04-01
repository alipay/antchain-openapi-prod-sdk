<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class BusinessLine extends Model
{
    // 产品线code
    /**
     * @example 10031
     *
     * @var string
     */
    public $code;

    // 1级产品线name
    /**
     * @example 可信产业
     *
     * @var string
     */
    public $name;

    // L2
    /**
     * @example
     *
     * @var ProductLine[]
     */
    public $productLine;
    protected $_name = [
        'code'        => 'code',
        'name'        => 'name',
        'productLine' => 'product_line',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('productLine', $this->productLine, true);
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
        if (null !== $this->productLine) {
            $res['product_line'] = [];
            if (null !== $this->productLine && \is_array($this->productLine)) {
                $n = 0;
                foreach ($this->productLine as $item) {
                    $res['product_line'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessLine
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
        if (isset($map['product_line'])) {
            if (!empty($map['product_line'])) {
                $model->productLine = [];
                $n                  = 0;
                foreach ($map['product_line'] as $item) {
                    $model->productLine[$n++] = null !== $item ? ProductLine::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
