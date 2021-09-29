<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseSupplierproductRequest extends Model
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

    // 系统来源
    /**
     * @var string
     */
    public $origin;

    // 采购商品信息
    /**
     * @var SupplierProductItem
     */
    public $productInfo;

    // 本阶段额外信息
    /**
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'origin'            => 'origin',
        'productInfo'       => 'product_info',
        'extraInfo'         => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('origin', $this->origin, true);
        Model::validateRequired('productInfo', $this->productInfo, true);
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
        if (null !== $this->origin) {
            $res['origin'] = $this->origin;
        }
        if (null !== $this->productInfo) {
            $res['product_info'] = null !== $this->productInfo ? $this->productInfo->toMap() : null;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseSupplierproductRequest
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
        if (isset($map['origin'])) {
            $model->origin = $map['origin'];
        }
        if (isset($map['product_info'])) {
            $model->productInfo = SupplierProductItem::fromMap($map['product_info']);
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
