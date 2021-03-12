<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcTransmitResult extends Model
{
    // 成功或者失败
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSuccess;

    // 失败信息
    /**
     * @example 失败信息
     *
     * @var string
     */
    public $message;

    // 验证verifier did
    /**
     * @example did:mychian:xxxxx
     *
     * @var string
     */
    public $targetVerifier;

    // 交易hash
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'isSuccess'      => 'is_success',
        'message'        => 'message',
        'targetVerifier' => 'target_verifier',
        'txHash'         => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('isSuccess', $this->isSuccess, true);
        Model::validateRequired('targetVerifier', $this->targetVerifier, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isSuccess) {
            $res['is_success'] = $this->isSuccess;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->targetVerifier) {
            $res['target_verifier'] = $this->targetVerifier;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcTransmitResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_success'])) {
            $model->isSuccess = $map['is_success'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['target_verifier'])) {
            $model->targetVerifier = $map['target_verifier'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
