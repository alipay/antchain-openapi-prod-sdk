<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAssetGrantrefundRequest extends Model {
    protected $_name = [
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
     * @return ExecAssetGrantrefundRequest
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
     * @description 数量
     * @example 100
     * @var integer
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
     * @description 备注信息
     * @example info
     * @var string
     */
    public $info;

    /**
     * @description 要回退的交易ID
     * @example 5238645821763
     * @var string
     */
    public $originTxId;

    /**
     * @description 外部交易ID
     * @example 80798665464
     * @var string
     */
    public $outTxId;

    /**
     * @description 用户ID
     * @example user001
     * @var string
     */
    public $userId;

}
