<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetAasAntdaoMerchantFundmanagerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chainId' => 'chain_id',
        'fundManagerTenantId' => 'fund_manager_tenant_id',
        'optTenantId' => 'opt_tenant_id',
        'outTxId' => 'out_tx_id',
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->fundManagerTenantId) {
            $res['fund_manager_tenant_id'] = $this->fundManagerTenantId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetAasAntdaoMerchantFundmanagerRequest
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
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['fund_manager_tenant_id'])){
            $model->fundManagerTenantId = $map['fund_manager_tenant_id'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 资金管理员所属的租户ID
    /**
     * @var string
     */
    public $fundManagerTenantId;

    // 要进行资金管理员设置的租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

}
