<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7365e031a87c467bbe817bec28a2a1dc\Models;

use AlibabaCloud\Tea\Model;

class BlockInfo extends Model
{
    // 业务数据
    /**
     * @example
     *
     * @var string
     */
    public $bizData;

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

    // 块高
    /**
     * @example 100
     *
     * @var int
     */
    public $height;

    // 上一个区块的hash
    /**
     * @example e01fe4f5ad4c7cdeec11c95036d8505600c941a2a10cf432438a2873342b4693
     *
     * @var string
     */
    public $parentHash;

    // size
    /**
     * @example
     *
     * @var int
     */
    public $size;

    // 出块时间
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;

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
    protected $_name = [
        'bizData'         => 'biz_data',
        'bizId'           => 'biz_id',
        'blockHash'       => 'block_hash',
        'height'          => 'height',
        'parentHash'      => 'parent_hash',
        'size'            => 'size',
        'timestamp'       => 'timestamp',
        'transactionSize' => 'transaction_size',
        'version'         => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('bizData', $this->bizData, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('blockHash', $this->blockHash, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('parentHash', $this->parentHash, true);
        Model::validateRequired('size', $this->size, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('transactionSize', $this->transactionSize, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizData) {
            $res['biz_data'] = $this->bizData;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->parentHash) {
            $res['parent_hash'] = $this->parentHash;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
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
     * @return BlockInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_data'])) {
            $model->bizData = $map['biz_data'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['parent_hash'])) {
            $model->parentHash = $map['parent_hash'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
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
