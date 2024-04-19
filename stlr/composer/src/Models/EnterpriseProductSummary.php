<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseProductSummary extends Model
{
    // 产品自定义编码
    /**
     * @example 12312121
     *
     * @var string
     */
    public $enterpriseCustomCode;

    // 产品名称
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
     * @example 这是一个石墨产品
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

    // 工艺流程文件路径，上传文件后由上传文件接口提供，最多支持上传3个工艺流程文件
    /**
     * @example
     *
     * @var EnterpriseDocumentFile[]
     */
    public $processFlowFileList;

    // 产品图片文件路径，上传文件后由上传文件接口提供，最多支持上传8个产品图片文件
    /**
     * @example
     *
     * @var EnterpriseDocumentFile[]
     */
    public $productPictureFileList;
    protected $_name = [
        'enterpriseCustomCode'   => 'enterprise_custom_code',
        'productName'            => 'product_name',
        'specification'          => 'specification',
        'productDescription'     => 'product_description',
        'productCategoryName'    => 'product_category_name',
        'brandInformation'       => 'brand_information',
        'processFlowFileList'    => 'process_flow_file_list',
        'productPictureFileList' => 'product_picture_file_list',
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
        if (null !== $this->processFlowFileList) {
            $res['process_flow_file_list'] = [];
            if (null !== $this->processFlowFileList && \is_array($this->processFlowFileList)) {
                $n = 0;
                foreach ($this->processFlowFileList as $item) {
                    $res['process_flow_file_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->productPictureFileList) {
            $res['product_picture_file_list'] = [];
            if (null !== $this->productPictureFileList && \is_array($this->productPictureFileList)) {
                $n = 0;
                foreach ($this->productPictureFileList as $item) {
                    $res['product_picture_file_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseProductSummary
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
        if (isset($map['process_flow_file_list'])) {
            if (!empty($map['process_flow_file_list'])) {
                $model->processFlowFileList = [];
                $n                          = 0;
                foreach ($map['process_flow_file_list'] as $item) {
                    $model->processFlowFileList[$n++] = null !== $item ? EnterpriseDocumentFile::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['product_picture_file_list'])) {
            if (!empty($map['product_picture_file_list'])) {
                $model->productPictureFileList = [];
                $n                             = 0;
                foreach ($map['product_picture_file_list'] as $item) {
                    $model->productPictureFileList[$n++] = null !== $item ? EnterpriseDocumentFile::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
