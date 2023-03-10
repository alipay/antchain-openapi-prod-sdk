<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIIDENTIFY\Models;

use AlibabaCloud\Tea\Model;

class QueryIdentifypointRequest extends Model
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

    // 品类名称
    /**
     * @var string
     */
    public $categoryName;

    // 品牌名称
    /**
     * @var string
     */
    public $brandName;

    // 款式名称
    /**
     * @var string
     */
    public $styleName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryName'      => 'category_name',
        'brandName'         => 'brand_name',
        'styleName'         => 'style_name',
    ];

    public function validate()
    {
        Model::validateRequired('categoryName', $this->categoryName, true);
        Model::validateRequired('brandName', $this->brandName, true);
        Model::validateRequired('styleName', $this->styleName, true);
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
        if (null !== $this->categoryName) {
            $res['category_name'] = $this->categoryName;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->styleName) {
            $res['style_name'] = $this->styleName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIdentifypointRequest
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
        if (isset($map['category_name'])) {
            $model->categoryName = $map['category_name'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['style_name'])) {
            $model->styleName = $map['style_name'];
        }

        return $model;
    }
}
