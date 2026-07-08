<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class CertProductAuthDO extends Model
{
    // 三方平台产品ID
    /**
     * @example 产品ID
     *
     * @var string
     */
    public $productId;

    // 三方平台产品名称
    /**
     * @example 产品名称
     *
     * @var string
     */
    public $productName;
    protected $_name = [
        'productId'   => 'product_id',
        'productName' => 'product_name',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productName', $this->productName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertProductAuthDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }

        return $model;
    }
}
