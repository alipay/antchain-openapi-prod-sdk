<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerOverdueRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customerAccount' => 'customer_account',
        'productType' => 'product_type',
    ];
    public function validate() {
        Model::validateRequired('customerAccount', $this->customerAccount, true);
        Model::validateRequired('productType', $this->productType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->customerAccount) {
            $res['customer_account'] = $this->customerAccount;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCustomerOverdueRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['customer_account'])){
            $model->customerAccount = $map['customer_account'];
        }
        if(isset($map['product_type'])){
            $model->productType = $map['product_type'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 客户号
    /**
     * @var string
     */
    public $customerAccount;

    // 产品类型
    /**
     * @var string
     */
    public $productType;

}
