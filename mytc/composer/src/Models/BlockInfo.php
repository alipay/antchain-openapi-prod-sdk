<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class BlockInfo extends Model
{
    // 块高度
    /**
     * @example 123
     *
     * @var int
     */
    public $blockHeight;

    // 成块时间戳
    /**
     * @example 1654570807000
     *
     * @var int
     */
    public $timestamp;

    // 交易摘要
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'blockHeight' => 'block_height',
        'timestamp'   => 'timestamp',
        'txHash'      => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('blockHeight', $this->blockHeight, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
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
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
