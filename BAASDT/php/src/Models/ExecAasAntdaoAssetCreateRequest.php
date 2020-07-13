<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAasAntdaoAssetCreateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'assetId' => 'asset_id',
        'assetName' => 'asset_name',
        'chainId' => 'chain_id',
        'currency' => 'currency',
        'optTenantId' => 'opt_tenant_id',
        'outTxId' => 'out_tx_id',
        'rate' => 'rate',
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetName) {
            $res['asset_name'] = $this->assetName;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAasAntdaoAssetCreateRequest
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
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['asset_name'])){
            $model->assetName = $map['asset_name'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['rate'])){
            $model->rate = $map['rate'];
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

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 资产名称
    /**
     * @var string
     */
    public $assetName;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 资产绑定币种
    /**
     * @var string
     */
    public $currency;

    // 为该租户创建新资产
    /**
     * @var string
     */
    public $optTenantId;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 资产汇率(等值一元钱的数量)
    /**
     * @var string
     */
    public $rate;

}
