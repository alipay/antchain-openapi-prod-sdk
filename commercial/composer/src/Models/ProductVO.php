<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ProductVO extends Model
{
    // 商品Code
    /**
     * @example software_bpaas
     *
     * @var string
     */
    public $productCode;

    // 产品名称
    /**
     * @example mpaas
     *
     * @var string
     */
    public $productName;

    // 产品oxm类型
    /**
     * @example SELF_DEV_TYPE
     *
     * @var string
     */
    public $oxmType;

    // 产品描述
    /**
     * @example 产品描述xxx
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'productCode' => 'product_code',
        'productName' => 'product_name',
        'oxmType'     => 'oxm_type',
        'desc'        => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('oxmType', $this->oxmType, true);
        Model::validateRequired('desc', $this->desc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->oxmType) {
            $res['oxm_type'] = $this->oxmType;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['oxm_type'])) {
            $model->oxmType = $map['oxm_type'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
