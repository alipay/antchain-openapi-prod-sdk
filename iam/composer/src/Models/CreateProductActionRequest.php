<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreateProductActionRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 操作点ID
    /**
     * @var string
     */
    public $actionId;

    // 操作点所属功能分类ID
    /**
     * @var string
     */
    public $categoryId;

    // 操作点描述
    /**
     * @var string
     */
    public $description;

    // 操作点名称
    /**
     * @var string
     */
    public $name;

    // 操作点所属产品
    /**
     * @var string
     */
    public $product;
    protected $_name = [
        'authToken'   => 'auth_token',
        'actionId'    => 'action_id',
        'categoryId'  => 'category_id',
        'description' => 'description',
        'name'        => 'name',
        'product'     => 'product',
    ];

    public function validate()
    {
        Model::validateRequired('actionId', $this->actionId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('product', $this->product, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->actionId) {
            $res['action_id'] = $this->actionId;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProductActionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['action_id'])) {
            $model->actionId = $map['action_id'];
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }

        return $model;
    }
}
