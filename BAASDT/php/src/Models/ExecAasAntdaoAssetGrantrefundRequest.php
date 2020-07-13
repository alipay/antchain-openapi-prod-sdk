<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAasAntdaoAssetGrantrefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'amount' => 'amount',
        'assetId' => 'asset_id',
        'chainId' => 'chain_id',
        'info' => 'info',
        'originTxId' => 'origin_tx_id',
        'outTxId' => 'out_tx_id',
        'userId' => 'user_id',
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
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->originTxId) {
            $res['origin_tx_id'] = $this->originTxId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAasAntdaoAssetGrantrefundRequest
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
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['info'])){
            $model->info = $map['info'];
        }
        if(isset($map['origin_tx_id'])){
            $model->originTxId = $map['origin_tx_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
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

    // 数量
    /**
     * @var integer
     */
    public $amount;

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 备注信息
    /**
     * @var string
     */
    public $info;

    // 要回退的交易ID
    /**
     * @var string
     */
    public $originTxId;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

}
