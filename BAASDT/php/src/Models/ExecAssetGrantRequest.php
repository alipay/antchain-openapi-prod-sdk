<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAssetGrantRequest extends Model {
    protected $_name = [
        'amount' => 'amount',
        'assetId' => 'asset_id',
        'chainId' => 'chain_id',
        'info' => 'info',
        'merchantId' => 'merchant_id',
        'outTxId' => 'out_tx_id',
        'userId' => 'user_id',
        'validityTime' => 'validity_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->validityTime) {
            $res['validity_time'] = $this->validityTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAssetGrantRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['validity_time'])){
            $model->validityTime = $map['validity_time'];
        }
        return $model;
    }
    /**
     * @description 数量
     * @example 100
     * @var string
     */
    public $amount;

    /**
     * @description 资产ID
     * @example Asset001
     * @var string
     */
    public $assetId;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 资产发放信息
     * @example info
     * @var string
     */
    public $info;

    /**
     * @description 商户ID
     * @example 288ca9e665e93dc47fb424412eb4614695ab139b8866f32b45242363a1a16fb4
     * @var string
     */
    public $merchantId;

    /**
     * @description 外部交易ID
     * @example 623874623897
     * @var string
     */
    public $outTxId;

    /**
     * @description 用户ID
     * @example user001
     * @var string
     */
    public $userId;

    /**
     * @description 有效时间
     * @example 1256354635
     * @var string
     */
    public $validityTime;

}
