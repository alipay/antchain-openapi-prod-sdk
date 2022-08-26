<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class ChainInfo extends Model
{
    // 块高
    /**
     * @example 13232424234
     *
     * @var string
     */
    public $blockHeight;

    // 交易时间
    /**
     * @example 2020-07-24 03:07:50
     *
     * @var string
     */
    public $translateDate;

    // hash(64位)
    /**
     * @example 0x233242342
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'blockHeight'   => 'block_height',
        'translateDate' => 'translate_date',
        'txHash'        => 'tx_hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->translateDate) {
            $res['translate_date'] = $this->translateDate;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['translate_date'])) {
            $model->translateDate = $map['translate_date'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
