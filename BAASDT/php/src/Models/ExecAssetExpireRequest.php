<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAssetExpireRequest extends Model {
    protected $_name = [
        'amount' => 'amount',
        'assetId' => 'asset_id',
        'chainId' => 'chain_id',
        'info' => 'info',
        'originalTxId' => 'original_tx_id',
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
        if (null !== $this->originalTxId) {
            $res['original_tx_id'] = $this->originalTxId;
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
     * @return ExecAssetExpireRequest
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
        if(isset($map['original_tx_id'])){
            $model->originalTxId = $map['original_tx_id'];
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
     * @example 1000
     * @var integer
     */
    public $amount;

    /**
     * @description 资产ID
     * @example "asset01"
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
     * @description 资产过期信息
     * @example info
     * @var string
     */
    public $info;

    /**
     * @description 过期的交易ID
     * @example 52347651376
     * @var string
     */
    public $originalTxId;

    /**
     * @description 外部交易ID，每个租户保证唯一
     * @example 23875487
     * @var string
     */
    public $outTxId;

    /**
     * @description 用户ID
     * @example "user01"
     * @var string
     */
    public $userId;

}
