<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAddress extends Model
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
     * @example 数字资产
     *
     * @var string
     */
    public $bizIdName;

    // 账户或合约地址
    /**
     * @example 8d881273a516ace01646381132b921dbbdeec771f01ca210ca213efdf4117b80
     *
     * @var string
     */
    public $address;

    // 创建者租户ID
    /**
     * @example ORGSUACN
     *
     * @var string
     */
    public $creatorOrganization;

    // 创建者地址
    /**
     * @example e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
     *
     * @var string
     */
    public $creator;

    // 创建时间
    /**
     * @example 1656568400000
     *
     * @var int
     */
    public $craeteTime;

    // 创建交易ID
    /**
     * @example 450734c80f679db95a6d1d64ca0a5e1f4b71460ab520567861614f87fb9b4d75
     *
     * @var string
     */
    public $createTxId;

    // 修改时间戳
    /**
     * @example 1665647616000
     *
     * @var int
     */
    public $modifyTime;

    // 最近修改账户的交易ID
    /**
     * @example 450734c80f679db95a6d1d64ca0a5e1f4b71460ab520567861614f87fb9b4d75
     *
     * @var string
     */
    public $modifyTxId;

    // 地址类型，枚举：Account，Contract
    /**
     * @example Account
     *
     * @var string
     */
    public $type;

    // 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $status;

    // 地址余额
    /**
     * @example 0
     *
     * @var int
     */
    public $balance;

    // 认证Map
    /**
     * @example
     *
     * @var MapEntry[]
     */
    public $authMap;

    // 地址恢复公钥
    /**
     * @example 028bff6d2fc69a8547061a438c3810374e07ff5e1623df5642c95057c167da9e0029f025c5fd59cfbabb6479167fb500025ca21fba1c163c1259c4a651721536
     *
     * @var string
     */
    public $recoverKey;

    // 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
    /**
     * @example WASM
     *
     * @var string
     */
    public $contractType;

    // 资产合约相关信息
    /**
     * @example
     *
     * @var ChainInsightAssetContractInfo
     */
    public $assetContractInfo;

    // 创建时间
    /**
     * @example 1656568400000
     *
     * @var int
     */
    public $createTime;
    protected $_name = [
        'bizId'               => 'biz_id',
        'bizIdName'           => 'biz_id_name',
        'address'             => 'address',
        'creatorOrganization' => 'creator_organization',
        'creator'             => 'creator',
        'craeteTime'          => 'craete_time',
        'createTxId'          => 'create_tx_id',
        'modifyTime'          => 'modify_time',
        'modifyTxId'          => 'modify_tx_id',
        'type'                => 'type',
        'status'              => 'status',
        'balance'             => 'balance',
        'authMap'             => 'auth_map',
        'recoverKey'          => 'recover_key',
        'contractType'        => 'contract_type',
        'assetContractInfo'   => 'asset_contract_info',
        'createTime'          => 'create_time',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('craeteTime', $this->craeteTime, true);
        Model::validateRequired('createTxId', $this->createTxId, true);
        Model::validateRequired('modifyTime', $this->modifyTime, true);
        Model::validateRequired('modifyTxId', $this->modifyTxId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('authMap', $this->authMap, true);
        Model::validateRequired('recoverKey', $this->recoverKey, true);
        Model::validateRequired('createTime', $this->createTime, true);
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->creatorOrganization) {
            $res['creator_organization'] = $this->creatorOrganization;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->craeteTime) {
            $res['craete_time'] = $this->craeteTime;
        }
        if (null !== $this->createTxId) {
            $res['create_tx_id'] = $this->createTxId;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->modifyTxId) {
            $res['modify_tx_id'] = $this->modifyTxId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->authMap) {
            $res['auth_map'] = [];
            if (null !== $this->authMap && \is_array($this->authMap)) {
                $n = 0;
                foreach ($this->authMap as $item) {
                    $res['auth_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recoverKey) {
            $res['recover_key'] = $this->recoverKey;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->assetContractInfo) {
            $res['asset_contract_info'] = null !== $this->assetContractInfo ? $this->assetContractInfo->toMap() : null;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAddress
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['creator_organization'])) {
            $model->creatorOrganization = $map['creator_organization'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['craete_time'])) {
            $model->craeteTime = $map['craete_time'];
        }
        if (isset($map['create_tx_id'])) {
            $model->createTxId = $map['create_tx_id'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['modify_tx_id'])) {
            $model->modifyTxId = $map['modify_tx_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['auth_map'])) {
            if (!empty($map['auth_map'])) {
                $model->authMap = [];
                $n              = 0;
                foreach ($map['auth_map'] as $item) {
                    $model->authMap[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['recover_key'])) {
            $model->recoverKey = $map['recover_key'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['asset_contract_info'])) {
            $model->assetContractInfo = ChainInsightAssetContractInfo::fromMap($map['asset_contract_info']);
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
