<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ProductDTO extends Model
{
    // 产品信息
    /**
     * @example software_bpaas
     *
     * @var string
     */
    public $productCode;

    // 产品名称
    /**
     * @example bpaas
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

    // 产品一级类目
    /**
     * @example
     *
     * @var int
     */
    public $l1CatalogId;

    // 产品二级类目
    /**
     * @example
     *
     * @var int
     */
    public $l2CatalogId;

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
        'l1CatalogId' => 'l1_catalog_id',
        'l2CatalogId' => 'l2_catalog_id',
        'desc'        => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('oxmType', $this->oxmType, true);
        Model::validateRequired('l1CatalogId', $this->l1CatalogId, true);
        Model::validateRequired('l2CatalogId', $this->l2CatalogId, true);
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
        if (null !== $this->l1CatalogId) {
            $res['l1_catalog_id'] = $this->l1CatalogId;
        }
        if (null !== $this->l2CatalogId) {
            $res['l2_catalog_id'] = $this->l2CatalogId;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductDTO
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
        if (isset($map['l1_catalog_id'])) {
            $model->l1CatalogId = $map['l1_catalog_id'];
        }
        if (isset($map['l2_catalog_id'])) {
            $model->l2CatalogId = $map['l2_catalog_id'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
