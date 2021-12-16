<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class UpdateCommercialcoreProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 产品名称
    /**
     * @var string
     */
    public $productName;

    // 产品oxm类型
    /**
     * @var string
     */
    public $oxmType;

    // 产品一级类目
    /**
     * @var int
     */
    public $l1CatalogId;

    // 产品二级类目
    /**
     * @var int
     */
    public $l2CatalogId;

    // 产品描述xxx
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'authToken'   => 'auth_token',
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
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
     * @return UpdateCommercialcoreProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
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
