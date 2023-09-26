<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAsset extends Model
{
    // 链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 链名称
    /**
     * @example 测试链
     *
     * @var string
     */
    public $bizIdName;

    // 资产合约地址
    /**
     * @example 4563613a8a52189eb5180e2999ef2d7fcc274b08fd0ec1a6554f775166b14b22
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

    // 数字权证链上的1155资产分片ID
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

    // 创建时间，取值为创建时交易所在区块创建的时间，单位：毫秒
    /**
     * @example 1694758618111
     *
     * @var int
     */
    public $createTime;

    // 持有者数量
    /**
     * @example 100
     *
     * @var int
     */
    public $ownerCount;

    // 资产元信息
    /**
     * @example {"description":"Friendly OpenSea Creature that enjoys long swims in the ocean.","external_url":"https://openseacreatures.io/3","image":"https://storage.googleapis.com/puffs/3.png","name":"Dave","attributes":[{"trait_type":"Base","value":"Starfish"}]}
     *
     * @var string
     */
    public $metaData;

    // 资产元信息链接
    /**
     * @example https://openseacreatures.io/metadata.json
     *
     * @var string
     */
    public $uri;

    // 账户名下该资产的余额 / 合约下该资产的总供应量
    /**
     * @example 100
     *
     * @var int
     */
    public $balance;

    // 该资产最近一笔交易的哈希
    /**
     * @example ef93df323a95b4859893d4077dd7b0200079ba0e120a79bd4bc32a9a672fd102
     *
     * @var string
     */
    public $latestTxHash;

    // 该资产最近一笔交易所在区块的创建时间
    /**
     * @example 1694758618111
     *
     * @var int
     */
    public $latestTxTime;
    protected $_name = [
        'bizId'        => 'biz_id',
        'bizIdName'    => 'biz_id_name',
        'contractAddr' => 'contract_addr',
        'assetId'      => 'asset_id',
        'shardId'      => 'shard_id',
        'ercType'      => 'erc_type',
        'createTime'   => 'create_time',
        'ownerCount'   => 'owner_count',
        'metaData'     => 'meta_data',
        'uri'          => 'uri',
        'balance'      => 'balance',
        'latestTxHash' => 'latest_tx_hash',
        'latestTxTime' => 'latest_tx_time',
    ];

    public function validate()
    {
        Model::validateRequired('contractAddr', $this->contractAddr, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('ercType', $this->ercType, true);
        Model::validateRequired('latestTxHash', $this->latestTxHash, true);
        Model::validateRequired('latestTxTime', $this->latestTxTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizIdName) {
            $res['biz_id_name'] = $this->bizIdName;
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
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->ownerCount) {
            $res['owner_count'] = $this->ownerCount;
        }
        if (null !== $this->metaData) {
            $res['meta_data'] = $this->metaData;
        }
        if (null !== $this->uri) {
            $res['uri'] = $this->uri;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->latestTxHash) {
            $res['latest_tx_hash'] = $this->latestTxHash;
        }
        if (null !== $this->latestTxTime) {
            $res['latest_tx_time'] = $this->latestTxTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAsset
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_id_name'])) {
            $model->bizIdName = $map['biz_id_name'];
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
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['owner_count'])) {
            $model->ownerCount = $map['owner_count'];
        }
        if (isset($map['meta_data'])) {
            $model->metaData = $map['meta_data'];
        }
        if (isset($map['uri'])) {
            $model->uri = $map['uri'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['latest_tx_hash'])) {
            $model->latestTxHash = $map['latest_tx_hash'];
        }
        if (isset($map['latest_tx_time'])) {
            $model->latestTxTime = $map['latest_tx_time'];
        }

        return $model;
    }
}
