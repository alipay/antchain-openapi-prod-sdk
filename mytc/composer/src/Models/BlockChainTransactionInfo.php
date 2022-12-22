<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class BlockChainTransactionInfo extends Model
{
    // 区块链上交易哈希
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $txHash;

    // 区块链标识
    /**
     * @example 1654570807000
     *
     * @var string
     */
    public $bizId;

    // 消耗gas数量
    /**
     * @example 123
     *
     * @var string
     */
    public $gasUsed;

    // 父区块哈希
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $parentHash;

    // 收据根
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $receiptRoot;

    // 状态树根
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $stateRoot;

    // 交易根
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $transactionRoot;

    // 版本
    /**
     * @example 1
     *
     * @var string
     */
    public $version;

    // 区块高度
    /**
     * @example 165457
     *
     * @var int
     */
    public $number;

    // 成块时间
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'txHash'          => 'tx_hash',
        'bizId'           => 'biz_id',
        'gasUsed'         => 'gas_used',
        'parentHash'      => 'parent_hash',
        'receiptRoot'     => 'receipt_root',
        'stateRoot'       => 'state_root',
        'transactionRoot' => 'transaction_root',
        'version'         => 'version',
        'number'          => 'number',
        'timestamp'       => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('gasUsed', $this->gasUsed, true);
        Model::validateRequired('parentHash', $this->parentHash, true);
        Model::validateRequired('receiptRoot', $this->receiptRoot, true);
        Model::validateRequired('stateRoot', $this->stateRoot, true);
        Model::validateRequired('transactionRoot', $this->transactionRoot, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('number', $this->number, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }
        if (null !== $this->parentHash) {
            $res['parent_hash'] = $this->parentHash;
        }
        if (null !== $this->receiptRoot) {
            $res['receipt_root'] = $this->receiptRoot;
        }
        if (null !== $this->stateRoot) {
            $res['state_root'] = $this->stateRoot;
        }
        if (null !== $this->transactionRoot) {
            $res['transaction_root'] = $this->transactionRoot;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockChainTransactionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['gas_used'])) {
            $model->gasUsed = $map['gas_used'];
        }
        if (isset($map['parent_hash'])) {
            $model->parentHash = $map['parent_hash'];
        }
        if (isset($map['receipt_root'])) {
            $model->receiptRoot = $map['receipt_root'];
        }
        if (isset($map['state_root'])) {
            $model->stateRoot = $map['state_root'];
        }
        if (isset($map['transaction_root'])) {
            $model->transactionRoot = $map['transaction_root'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
