<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class AcceptanceDetail extends Model
{
    // 客户名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 客户价格
    /**
     * @example test
     *
     * @var string
     */
    public $price;
    protected $_name = [
        'name'  => 'name',
        'price' => 'price',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AcceptanceDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }

        return $model;
    }
}
