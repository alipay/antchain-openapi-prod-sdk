<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseProductinfoRequest extends Model
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

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 供应商本版号
    /**
     * @var int
     */
    public $supplierVersion;

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 租赁方id
    /**
     * @var string
     */
    public $leaseId;

    // 资方id
    /**
     * @var string
     */
    public $creditId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productId'         => 'product_id',
        'supplierVersion'   => 'supplier_version',
        'applicationId'     => 'application_id',
        'leaseId'           => 'lease_id',
        'creditId'          => 'credit_id',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('supplierVersion', $this->supplierVersion, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('creditId', $this->creditId, true);
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->supplierVersion) {
            $res['supplier_version'] = $this->supplierVersion;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->creditId) {
            $res['credit_id'] = $this->creditId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseProductinfoRequest
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
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['supplier_version'])) {
            $model->supplierVersion = $map['supplier_version'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['credit_id'])) {
            $model->creditId = $map['credit_id'];
        }

        return $model;
    }
}
