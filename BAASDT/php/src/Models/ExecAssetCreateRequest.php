<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAssetCreateRequest extends Model {
    protected $_name = [
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
     * @return ExecAssetCreateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 资产ID
     * @example AssetID
     * @var string
     */
    public $assetId;

    /**
     * @description 资产名称
     * @example AssetName
     * @var string
     */
    public $assetName;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 资产绑定币种
     * @example CNY
     * @var string
     */
    public $currency;

    /**
     * @description 为该租户创建新资产
     * @example ABCDEFGH
     * @var string
     */
    public $optTenantId;

    /**
     * @description 外部交易ID
     * @example out_tx_id
     * @var string
     */
    public $outTxId;

    /**
     * @description 资产汇率(等值一元钱的数量)
     * @example 100
     * @var string
     */
    public $rate;

}
