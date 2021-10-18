<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_IOT\Models;

use AlibabaCloud\Tea\Model;

class SendCollectorResult extends Model
{
    // 数据内容content的上链交易哈希
    /**
     * @example 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'txHash' => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendCollectorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
