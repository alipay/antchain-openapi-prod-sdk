<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoMerchantProvisionsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'businessAction' => 'business_action',
        'optTenantId' => 'opt_tenant_id',
        'productCode' => 'product_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->businessAction) {
            $res['business_action'] = $this->businessAction;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasAntdaoMerchantProvisionsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['business_action'])){
            $model->businessAction = $map['business_action'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 行为
    /**
     * @var string
     */
    public $businessAction;

    // 要查询的租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

}
