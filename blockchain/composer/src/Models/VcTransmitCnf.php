<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcTransmitCnf extends Model
{
    // 针对tx_hash的签名
    /**
     * @example 123123123
     *
     * @var string
     */
    public $signature;

    // 交易hash
    /**
     * @example 1232123
     *
     * @var string
     */
    public $txHash;

    // vc传输目标did
    /**
     * @example 验证者id
     *
     * @var string
     */
    public $verifierId;
    protected $_name = [
        'signature'  => 'signature',
        'txHash'     => 'tx_hash',
        'verifierId' => 'verifier_id',
    ];

    public function validate()
    {
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('verifierId', $this->verifierId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->verifierId) {
            $res['verifier_id'] = $this->verifierId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcTransmitCnf
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['verifier_id'])) {
            $model->verifierId = $map['verifier_id'];
        }

        return $model;
    }
}
