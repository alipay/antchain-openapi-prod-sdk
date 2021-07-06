<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class BlockInfo extends Model
{
    // 区块链唯一性标识
    /**
     * @example 83c6e3ed
     *
     * @var string
     */
    public $bizId;

    // 区块哈希
    /**
     * @example e01fe4f5ad4c7cdeec11c95036d8505600c941a2a10cf432438a2873342b4693
     *
     * @var string
     */
    public $blockHash;

    // 上一个区块的hash
    /**
     * @example e01fe4f5ad4c7cdeec11c95036d8505600c941a2a10cf432438a2873342b4693
     *
     * @var string
     */
    public $parentHash;

    // 块高
    /**
     * @example 100
     *
     * @var int
     */
    public $height;

    // 出块时间
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;

    // 业务数据
    /**
     * @example
     *
     * @var string
     */
    public $bizData;

    // 包含交易数
    /**
     * @example 5
     *
     * @var int
     */
    public $transactionSize;

    // 版本
    /**
     * @example 1
     *
     * @var string
     */
    public $version;

    // size
    /**
     * @example
     *
     * @var int
     */
    public $size;
    protected $_name = [
        'bizId'           => 'biz_id',
        'blockHash'       => 'block_hash',
        'parentHash'      => 'parent_hash',
        'height'          => 'height',
        'timestamp'       => 'timestamp',
        'bizData'         => 'biz_data',
        'transactionSize' => 'transaction_size',
        'version'         => 'version',
        'size'            => 'size',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('blockHash', $this->blockHash, true);
        Model::validateRequired('parentHash', $this->parentHash, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('bizData', $this->bizData, true);
        Model::validateRequired('transactionSize', $this->transactionSize, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('size', $this->size, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->parentHash) {
            $res['parent_hash'] = $this->parentHash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
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
     * @return BlockInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['parent_hash'])) {
            $model->parentHash = $map['parent_hash'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
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
