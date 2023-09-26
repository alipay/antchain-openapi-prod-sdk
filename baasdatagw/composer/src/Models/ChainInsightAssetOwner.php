<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAssetOwner extends Model
{
    // 持有者地址
    /**
     * @example 99c4ad0dda55b8d555992dd03d64f31092eaf9ec436a0e8d1a77217989391e10
     *
     * @var string
     */
    public $owner;

    // 合约地址
    /**
     * @example 91257bebd7bd337fb418e665c27a7dcf5a3bf06c492028d8ff046ee8f4da873d
     *
     * @var string
     */
    public $contractAddr;

    // 资产ID
    /**
     * @example 2688168816881688
     *
     * @var string
     */
    public $assetId;

    // 数字权证链1155合约特有的分片ID
    /**
     * @example 35e1da54-44f2-4685-a6b2-2bc2e38e08b2
     *
     * @var string
     */
    public $shardId;

    // 资产类型：ERC721 / ERC1155
    /**
     * @example ERC721
     *
     * @var string
     */
    public $ercType;

    // 数字资产余额
    /**
     * @example 10
     *
     * @var int
     */
    public $balance;

    // 该账户对该资产最近一次转让交易的哈希
    /**
     * @example ef93df323a95b4859893d4077dd7b0200079ba0e120a79bd4bc32a9a672fd102
     *
     * @var string
     */
    public $updateTxHash;

    // 该账户对该资产最近一次转让交易所在区块高度
    /**
     * @example 100
     *
     * @var int
     */
    public $updateBlockHeight;

    // 该账户对该资产最近一次转让交易所在区块的创建时间，单位：毫秒
    /**
     * @example 1694758618111
     *
     * @var int
     */
    public $updateBlockTime;
    protected $_name = [
        'owner'             => 'owner',
        'contractAddr'      => 'contract_addr',
        'assetId'           => 'asset_id',
        'shardId'           => 'shard_id',
        'ercType'           => 'erc_type',
        'balance'           => 'balance',
        'updateTxHash'      => 'update_tx_hash',
        'updateBlockHeight' => 'update_block_height',
        'updateBlockTime'   => 'update_block_time',
    ];

    public function validate()
    {
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('contractAddr', $this->contractAddr, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('ercType', $this->ercType, true);
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('updateTxHash', $this->updateTxHash, true);
        Model::validateRequired('updateBlockHeight', $this->updateBlockHeight, true);
        Model::validateRequired('updateBlockTime', $this->updateBlockTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->contractAddr) {
            $res['contract_addr'] = $this->contractAddr;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->shardId) {
            $res['shard_id'] = $this->shardId;
        }
        if (null !== $this->ercType) {
            $res['erc_type'] = $this->ercType;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->updateTxHash) {
            $res['update_tx_hash'] = $this->updateTxHash;
        }
        if (null !== $this->updateBlockHeight) {
            $res['update_block_height'] = $this->updateBlockHeight;
        }
        if (null !== $this->updateBlockTime) {
            $res['update_block_time'] = $this->updateBlockTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAssetOwner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['contract_addr'])) {
            $model->contractAddr = $map['contract_addr'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['shard_id'])) {
            $model->shardId = $map['shard_id'];
        }
        if (isset($map['erc_type'])) {
            $model->ercType = $map['erc_type'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['update_tx_hash'])) {
            $model->updateTxHash = $map['update_tx_hash'];
        }
        if (isset($map['update_block_height'])) {
            $model->updateBlockHeight = $map['update_block_height'];
        }
        if (isset($map['update_block_time'])) {
            $model->updateBlockTime = $map['update_block_time'];
        }

        return $model;
    }
}
