<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserTransaction extends Model
{
    // bizid
    /**
     * @example 27ce375122ef483691488395808e009e
     *
     * @var string
     */
    public $bizid;

    // block_hash
    /**
     * @example 4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694
     *
     * @var string
     */
    public $blockHash;

    // category
    /**
     * @example -1
     *
     * @var int
     */
    public $category;

    // create_time
    /**
     * @example 1604565299516
     *
     * @var int
     */
    public $createTime;

    // from
    /**
     * @example eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
     *
     * @var string
     */
    public $from;

    // gas_used
    /**
     * @example 0
     *
     * @var int
     */
    public $gasUsed;

    // hash
    /**
     * @example 65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c
     *
     * @var string
     */
    public $hash;

    // height
    /**
     * @example 6814087
     *
     * @var int
     */
    public $height;

    // reference_count
    /**
     * @example 0
     *
     * @var int
     */
    public $referenceCount;

    // to
    /**
     * @example eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
     *
     * @var string
     */
    public $to;

    // transaction_type
    /**
     * @example TX_DEPOSIT_DATA
     *
     * @var string
     */
    public $transactionType;

    // block_version
    /**
     * @example 10
     *
     * @var int
     */
    public $blockVersion;

    // blockchain_name
    /**
     * @example BAASQATEST
     *
     * @var string
     */
    public $blockchainName;

    // blockchain_status
    /**
     * @example true, false
     *
     * @var bool
     */
    public $blockchainStatus;

    // content
    /**
     * @example eyJ0cmFuc2FjdGlvbl9pZCI6ImRjM2YyZTYz
     *
     * @var string
     */
    public $content;

    // hash_status
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hashStatus;

    // type
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // transaction_contract
    /**
     * @example transaction_contract
     *
     * @var BlockchainBrowserTransactionContract
     */
    public $transactionContract;
    protected $_name = [
        'bizid'               => 'bizid',
        'blockHash'           => 'block_hash',
        'category'            => 'category',
        'createTime'          => 'create_time',
        'from'                => 'from',
        'gasUsed'             => 'gas_used',
        'hash'                => 'hash',
        'height'              => 'height',
        'referenceCount'      => 'reference_count',
        'to'                  => 'to',
        'transactionType'     => 'transaction_type',
        'blockVersion'        => 'block_version',
        'blockchainName'      => 'blockchain_name',
        'blockchainStatus'    => 'blockchain_status',
        'content'             => 'content',
        'hashStatus'          => 'hash_status',
        'type'                => 'type',
        'transactionContract' => 'transaction_contract',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('blockHash', $this->blockHash, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('gasUsed', $this->gasUsed, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('referenceCount', $this->referenceCount, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('transactionType', $this->transactionType, true);
        Model::validateRequired('blockVersion', $this->blockVersion, true);
        Model::validateRequired('blockchainName', $this->blockchainName, true);
        Model::validateRequired('blockchainStatus', $this->blockchainStatus, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('hashStatus', $this->hashStatus, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('transactionContract', $this->transactionContract, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->referenceCount) {
            $res['reference_count'] = $this->referenceCount;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->transactionType) {
            $res['transaction_type'] = $this->transactionType;
        }
        if (null !== $this->blockVersion) {
            $res['block_version'] = $this->blockVersion;
        }
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->blockchainStatus) {
            $res['blockchain_status'] = $this->blockchainStatus;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->hashStatus) {
            $res['hash_status'] = $this->hashStatus;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->transactionContract) {
            $res['transaction_contract'] = null !== $this->transactionContract ? $this->transactionContract->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['gas_used'])) {
            $model->gasUsed = $map['gas_used'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['reference_count'])) {
            $model->referenceCount = $map['reference_count'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['transaction_type'])) {
            $model->transactionType = $map['transaction_type'];
        }
        if (isset($map['block_version'])) {
            $model->blockVersion = $map['block_version'];
        }
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['blockchain_status'])) {
            $model->blockchainStatus = $map['blockchain_status'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['hash_status'])) {
            $model->hashStatus = $map['hash_status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['transaction_contract'])) {
            $model->transactionContract = BlockchainBrowserTransactionContract::fromMap($map['transaction_contract']);
        }

        return $model;
    }
}
