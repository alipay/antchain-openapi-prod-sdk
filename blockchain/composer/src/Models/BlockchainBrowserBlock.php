<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserBlock extends Model
{
    // bizid
    /**
     * @example 27ce375122ef483691488395808e009e
     *
     * @var string
     */
    public $bizid;

    // blockchain_name
    /**
     * @example BAASQATEST
     *
     * @var string
     */
    public $blockchainName;

    // blockchain_status
    /**
     * @example true
     *
     * @var bool
     */
    public $blockchainStatus;

    // block_hash
    /**
     * @example 4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694
     *
     * @var string
     */
    public $blockHash;

    // create_time
    /**
     * @example 1604565300002
     *
     * @var int
     */
    public $createTime;

    // hash_status
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hashStatus;

    // height
    /**
     * @example 6814087
     *
     * @var int
     */
    public $height;

    // previous_hash
    /**
     * @example e70b3768125ac3543ba0c823fa56500eb4516c165cb7fd1489961fac961ee5f1
     *
     * @var string
     */
    public $previousHash;

    // root_tx_hash
    /**
     * @example 711f000e6604bf49bc4434b8ecd57ac98c0519e817d8f75bf6eef3caea7a0d79
     *
     * @var string
     */
    public $rootTxHash;

    // transaction_list
    /**
     * @example transaction_list
     *
     * @var BlockchainBrowserTransaction[]
     */
    public $transactionList;

    // transaction_size
    /**
     * @example 11
     *
     * @var int
     */
    public $transactionSize;
    protected $_name = [
        'bizid'            => 'bizid',
        'blockchainName'   => 'blockchain_name',
        'blockchainStatus' => 'blockchain_status',
        'blockHash'        => 'block_hash',
        'createTime'       => 'create_time',
        'hashStatus'       => 'hash_status',
        'height'           => 'height',
        'previousHash'     => 'previous_hash',
        'rootTxHash'       => 'root_tx_hash',
        'transactionList'  => 'transaction_list',
        'transactionSize'  => 'transaction_size',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('blockchainName', $this->blockchainName, true);
        Model::validateRequired('blockchainStatus', $this->blockchainStatus, true);
        Model::validateRequired('blockHash', $this->blockHash, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('hashStatus', $this->hashStatus, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('previousHash', $this->previousHash, true);
        Model::validateRequired('rootTxHash', $this->rootTxHash, true);
        Model::validateRequired('transactionList', $this->transactionList, true);
        Model::validateRequired('transactionSize', $this->transactionSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->blockchainStatus) {
            $res['blockchain_status'] = $this->blockchainStatus;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->hashStatus) {
            $res['hash_status'] = $this->hashStatus;
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
        if (null !== $this->transactionList) {
            $res['transaction_list'] = [];
            if (null !== $this->transactionList && \is_array($this->transactionList)) {
                $n = 0;
                foreach ($this->transactionList as $item) {
                    $res['transaction_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->transactionSize) {
            $res['transaction_size'] = $this->transactionSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserBlock
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['blockchain_status'])) {
            $model->blockchainStatus = $map['blockchain_status'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['hash_status'])) {
            $model->hashStatus = $map['hash_status'];
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
        if (isset($map['transaction_list'])) {
            if (!empty($map['transaction_list'])) {
                $model->transactionList = [];
                $n                      = 0;
                foreach ($map['transaction_list'] as $item) {
                    $model->transactionList[$n++] = null !== $item ? BlockchainBrowserTransaction::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['transaction_size'])) {
            $model->transactionSize = $map['transaction_size'];
        }

        return $model;
    }
}
