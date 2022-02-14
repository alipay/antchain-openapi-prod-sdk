<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryRefinanceProductRequest extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $packageId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 商品版本号
    /**
     * @var string
     */
    public $productVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'packageId'         => 'package_id',
        'orderId'           => 'order_id',
        'applicationId'     => 'application_id',
        'productId'         => 'product_id',
        'productVersion'    => 'product_version',
    ];

    public function validate()
    {
        Model::validateRequired('packageId', $this->packageId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productVersion', $this->productVersion, true);
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
        if (null !== $this->packageId) {
            $res['package_id'] = $this->packageId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRefinanceProductRequest
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
        if (isset($map['package_id'])) {
            $model->packageId = $map['package_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }

        return $model;
    }
}
