<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryCategoryIndustryscenelistRequest extends Model
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

    // 品类类型
    // 标准品类：standard
    // 自定义品类：custom
    /**
     * @var string
     */
    public $categoryType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryType'      => 'category_type',
    ];

    public function validate()
    {
        Model::validateRequired('categoryType', $this->categoryType, true);
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
        if (null !== $this->categoryType) {
            $res['category_type'] = $this->categoryType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCategoryIndustryscenelistRequest
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
        if (isset($map['category_type'])) {
            $model->categoryType = $map['category_type'];
        }

        return $model;
    }
}
