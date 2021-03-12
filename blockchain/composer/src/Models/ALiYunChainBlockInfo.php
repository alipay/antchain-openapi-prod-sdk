<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainBlockInfo extends Model
{
    // alias
    /**
     * @example alias
     *
     * @var string
     */
    public $alias;

    // block_hash
    /**
     * @example block_hash
     *
     * @var string
     */
    public $blockHash;

    // root_tx_hash
    /**
     * @example root_tx_hash
     *
     * @var string
     */
    public $rootTxHash;

    // height
    /**
     * @example 120
     *
     * @var int
     */
    public $height;

    // previous_hash
    /**
     * @example previous_hash
     *
     * @var string
     */
    public $previousHash;

    // create_time
    /**
     * @example 12312312312
     *
     * @var int
     */
    public $createTime;

    // biz_data
    /**
     * @example biz_data
     *
     * @var string
     */
    public $bizData;

    // transaction_size
    /**
     * @example 12
     *
     * @var int
     */
    public $transactionSize;

    // version
    /**
     * @example 20
     *
     * @var int
     */
    public $version;

    // size
    /**
     * @example size
     *
     * @var int
     */
    public $size;
    protected $_name = [
        'alias'           => 'alias',
        'blockHash'       => 'block_hash',
        'rootTxHash'      => 'root_tx_hash',
        'height'          => 'height',
        'previousHash'    => 'previous_hash',
        'createTime'      => 'create_time',
        'bizData'         => 'biz_data',
        'transactionSize' => 'transaction_size',
        'version'         => 'version',
        'size'            => 'size',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->rootTxHash) {
            $res['root_tx_hash'] = $this->rootTxHash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->previousHash) {
            $res['previous_hash'] = $this->previousHash;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->transactionSize) {
            $res['transaction_size'] = $this->transactionSize;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainBlockInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['root_tx_hash'])) {
            $model->rootTxHash = $map['root_tx_hash'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['previous_hash'])) {
            $model->previousHash = $map['previous_hash'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['transaction_size'])) {
            $model->transactionSize = $map['transaction_size'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }

        return $model;
    }
}
