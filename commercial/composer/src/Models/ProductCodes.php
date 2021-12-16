<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ProductCodes extends Model
{
    // 产品code列表
    /**
     * @example ["code1","code2"]
     *
     * @var string[]
     */
    public $productCodes;
    protected $_name = [
        'productCodes' => 'product_codes',
    ];

    public function validate()
    {
        Model::validateRequired('productCodes', $this->productCodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductCodes
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_codes'])) {
            if (!empty($map['product_codes'])) {
                $model->productCodes = $map['product_codes'];
            }
        }

        return $model;
    }
}
