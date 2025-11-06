<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AuthProduct extends Model
{
    // 产品code
    /**
     * @example SOCIAL_INSURANCE
     *
     * @var string
     */
    public $productCode;

    // 产品简称
    /**
     * @example 社保
     *
     * @var string
     */
    public $productAbbr;
    protected $_name = [
        'productCode' => 'product_code',
        'productAbbr' => 'product_abbr',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productAbbr', $this->productAbbr, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productAbbr) {
            $res['product_abbr'] = $this->productAbbr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthProduct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_abbr'])) {
            $model->productAbbr = $map['product_abbr'];
        }

        return $model;
    }
}
