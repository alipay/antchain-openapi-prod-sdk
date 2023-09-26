<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAssetOperation extends Model
{
    // 合约地址
    /**
     * @example 91257bebd7bd337fb418e665c27a7dcf5a3bf06c492028d8ff046ee8f4da873d
     *
     * @var string
     */
    public $contractAddr;

    // 流转交易哈希
    /**
     * @example ef93df323a95b4859893d4077dd7b0200079ba0e120a79bd4bc32a9a672fd102
     *
     * @var string
     */
    public $txId;

    // 转让执行者地址，ERC1155资产会有
    /**
     * @example 99c4ad0dda55b8d555992dd03d64f31092eaf9ec436a0e8d1a77217989391e10
     *
     * @var string
     */
    public $operator;

    // 资产转出地址
    /**
     * @example 99c4ad0dda55b8d555992dd03d64f31092eaf9ec436a0e8d1a77217989391e10
     *
     * @var string
     */
    public $from;

    // 资产转入地址
    /**
     * @example 99c4ad0dda55b8d555992dd03d64f31092eaf9ec436a0e8d1a77217989391e10
     *
     * @var string
     */
    public $to;

    // 资产ID
    /**
     * @example 2688168816881688
     *
     * @var string
     */
    public $assetId;

    // 数字权证链的1155资产的分片ID
    /**
     * @example 35e1da54-44f2-4685-a6b2-2bc2e38e08b2
     *
     * @var string
     */
    public $shardId;

    // 资产转让数量
    /**
     * @example 10
     *
     * @var int
     */
    public $assetValue;

    // 资产流转交易所在区块的创建时间，单位：毫秒
    /**
     * @example 1694758618111
     *
     * @var int
     */
    public $timestamp;

    // 流转交易所在块高
    /**
     * @example 100
     *
     * @var int
     */
    public $blockHeight;
    protected $_name = [
        'contractAddr' => 'contract_addr',
        'txId'         => 'tx_id',
        'operator'     => 'operator',
        'from'         => 'from',
        'to'           => 'to',
        'assetId'      => 'asset_id',
        'shardId'      => 'shard_id',
        'assetValue'   => 'asset_value',
        'timestamp'    => 'timestamp',
        'blockHeight'  => 'block_height',
    ];

    public function validate()
    {
        Model::validateRequired('contractAddr', $this->contractAddr, true);
        Model::validateRequired('txId', $this->txId, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('assetValue', $this->assetValue, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('blockHeight', $this->blockHeight, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractAddr) {
            $res['contract_addr'] = $this->contractAddr;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->shardId) {
            $res['shard_id'] = $this->shardId;
        }
        if (null !== $this->assetValue) {
            $res['asset_value'] = $this->assetValue;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAssetOperation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_addr'])) {
            $model->contractAddr = $map['contract_addr'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['shard_id'])) {
            $model->shardId = $map['shard_id'];
        }
        if (isset($map['asset_value'])) {
            $model->assetValue = $map['asset_value'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }

        return $model;
    }
}
