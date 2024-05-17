<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TxInfo extends Model
{
    // 上链结果
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $txReceiptResult;

    // 区块链id
    /**
     * @example c4b83bb3080a4a19957af5b0b4430542
     *
     * @var string
     */
    public $bizId;

    // 交易hash
    /**
     * @example aeedaaf3abb4a1ce86de538ec42759626689ea59fdfba4a10a0ef1550aa10d3d
     *
     * @var string
     */
    public $txHash;

    // 交易类型
    /**
     * @example TX_DEPOSIT_DATA
     *
     * @var string
     */
    public $txType;

    // 时间戳
    /**
     * @example 1638796927336
     *
     * @var int
     */
    public $timestamp;

    // 区块高度
    /**
     * @example 68772416
     *
     * @var string
     */
    public $blockNumber;

    // 交易随机数Nonce
    /**
     * @example 505563366098488426
     *
     * @var string
     */
    public $nonce;

    // 发起地址
    /**
     * @example 070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304
     *
     * @var string
     */
    public $from;

    // 目标地址
    /**
     * @example 070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304
     *
     * @var string
     */
    public $to;

    // 签名
    /**
     * @example 9357e09984d9ba31f0f6070a8276b0d39ffeb8c40aaa7a6873cc69a04ea4babf7295d642aeb945b5eca6624751e11e41885d918deae554abd8d732f95e31d44f00
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'txReceiptResult' => 'tx_receipt_result',
        'bizId'           => 'biz_id',
        'txHash'          => 'tx_hash',
        'txType'          => 'tx_type',
        'timestamp'       => 'timestamp',
        'blockNumber'     => 'block_number',
        'nonce'           => 'nonce',
        'from'            => 'from',
        'to'              => 'to',
        'signature'       => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('txReceiptResult', $this->txReceiptResult, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txType', $this->txType, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('blockNumber', $this->blockNumber, true);
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('signature', $this->signature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txReceiptResult) {
            $res['tx_receipt_result'] = $this->txReceiptResult;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txType) {
            $res['tx_type'] = $this->txType;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TxInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_receipt_result'])) {
            $model->txReceiptResult = $map['tx_receipt_result'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_type'])) {
            $model->txType = $map['tx_type'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
