<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateConsumecardGoodscategoryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 商品类别描述
    /**
     * @var string
     */
    public $categoryDescription;

    // 商品分类id（ffaaaaabbbbbbcccccc，如果存在返回失败）
    /**
     * @var string
     */
    public $categoryId;

    // 商品类别名称
    /**
     * @var string
     */
    public $categoryName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'baseRequest'         => 'base_request',
        'categoryDescription' => 'category_description',
        'categoryId'          => 'category_id',
        'categoryName'        => 'category_name',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('categoryDescription', $this->categoryDescription, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('categoryName', $this->categoryName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->categoryDescription) {
            $res['category_description'] = $this->categoryDescription;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsumecardGoodscategoryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['category_description'])) {
            $model->categoryDescription = $map['category_description'];
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }

        return $model;
    }
}
