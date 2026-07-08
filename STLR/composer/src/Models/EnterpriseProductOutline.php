<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseProductOutline extends Model
{
    // 产品自定义编码
    //
    /**
     * @example 23123121
     *
     * @var string
     */
    public $enterpriseCustomCode;

    // 产品名称
    //
    /**
     * @example 石墨
     *
     * @var string
     */
    public $productName;

    // 规格型号
    /**
     * @example DDD-1212
     *
     * @var string
     */
    public $specification;

    // 产品描述
    /**
     * @example 产品描述
     *
     * @var string
     */
    public $productDescription;

    // 产品分类名称
    /**
     * @example 产品分类名
     *
     * @var string
     */
    public $productCategoryName;

    // 品牌信息
    /**
     * @example Adidas
     *
     * @var string
     */
    public $brandInformation;
    protected $_name = [
        'enterpriseCustomCode' => 'enterprise_custom_code',
        'productName'          => 'product_name',
        'specification'        => 'specification',
        'productDescription'   => 'product_description',
        'productCategoryName'  => 'product_category_name',
        'brandInformation'     => 'brand_information',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseCustomCode', $this->enterpriseCustomCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('specification', $this->specification, true);
        Model::validateRequired('productCategoryName', $this->productCategoryName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enterpriseCustomCode) {
            $res['enterprise_custom_code'] = $this->enterpriseCustomCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->productDescription) {
            $res['product_description'] = $this->productDescription;
        }
        if (null !== $this->productCategoryName) {
            $res['product_category_name'] = $this->productCategoryName;
        }
        if (null !== $this->brandInformation) {
            $res['brand_information'] = $this->brandInformation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseProductOutline
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enterprise_custom_code'])) {
            $model->enterpriseCustomCode = $map['enterprise_custom_code'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['specification'])) {
            $model->specification = $map['specification'];
        }
        if (isset($map['product_description'])) {
            $model->productDescription = $map['product_description'];
        }
        if (isset($map['product_category_name'])) {
            $model->productCategoryName = $map['product_category_name'];
        }
        if (isset($map['brand_information'])) {
            $model->brandInformation = $map['brand_information'];
        }

        return $model;
    }
}
