<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserLatestBlock extends Model
{
    // bizid
    /**
     * @example bizid
     *
     * @var string
     */
    public $bizid;

    // block_hash
    /**
     * @example block_hash
     *
     * @var string
     */
    public $blockHash;

    // create_time
    /**
     * @example 1604564398000
     *
     * @var int
     */
    public $createTime;

    // height
    /**
     * @example 6812497
     *
     * @var int
     */
    public $height;

    // previous_hash
    /**
     * @example f6d51d362abc1b31e42dbd88d5ce0660cb96b8d0c0a4293cd29ffa042f61c784
     *
     * @var string
     */
    public $previousHash;

    // root_tx_hash
    /**
     * @example da9a42027ab141c8396b7fc78d74c94264da71f6361ac468385bed3fbc5408b4
     *
     * @var string
     */
    public $rootTxHash;

    // size
    /**
     * @example 1024
     *
     * @var int
     */
    public $size;

    // transaction_size
    /**
     * @example 1
     *
     * @var int
     */
    public $transactionSize;

    // version
    /**
     * @example 258
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'bizid'           => 'bizid',
        'blockHash'       => 'block_hash',
        'createTime'      => 'create_time',
        'height'          => 'height',
        'previousHash'    => 'previous_hash',
        'rootTxHash'      => 'root_tx_hash',
        'size'            => 'size',
        'transactionSize' => 'transaction_size',
        'version'         => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('blockHash', $this->blockHash, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('previousHash', $this->previousHash, true);
        Model::validateRequired('rootTxHash', $this->rootTxHash, true);
        Model::validateRequired('size', $this->size, true);
        Model::validateRequired('transactionSize', $this->transactionSize, true);
        Model::validateRequired('version', $this->version, true);
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
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->previousHash) {
            $res['previous_hash'] = $this->previousHash;
        }
        if (null !== $this->rootTxHash) {
            $res['root_tx_hash'] = $this->rootTxHash;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->transactionSize) {
            $res['transaction_size'] = $this->transactionSize;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserLatestBlock
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
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['previous_hash'])) {
            $model->previousHash = $map['previous_hash'];
        }
        if (isset($map['root_tx_hash'])) {
            $model->rootTxHash = $map['root_tx_hash'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['transaction_size'])) {
            $model->transactionSize = $map['transaction_size'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
