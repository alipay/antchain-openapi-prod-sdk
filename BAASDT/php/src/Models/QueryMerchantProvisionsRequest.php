<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantProvisionsRequest extends Model {
    protected $_name = [
        'businessAction' => 'business_action',
        'optTenantId' => 'opt_tenant_id',
        'productCode' => 'product_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return QueryMerchantProvisionsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 行为
     * @example loadAssetAccount
     * @var string
     */
    public $businessAction;

    /**
     * @description 要查询的租户ID
     * @example opt_tenant_id
     * @var string
     */
    public $optTenantId;

    /**
     * @description 产品编码
     * @example BLOCKCHAIN
     * @var string
     */
    public $productCode;

}
