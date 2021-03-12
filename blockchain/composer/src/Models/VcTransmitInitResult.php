<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcTransmitInitResult extends Model
{
    // 初始化成功与否
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSuccess;

    // 失败时返回的额外信息
    /**
     * @example 附属消息
     *
     * @var string
     */
    public $message;

    // 接受者did
    /**
     * @example did:mychain:xxxx
     *
     * @var string
     */
    public $targetVerifier;

    // 待签名的交易hash
    /**
     * @example 123123
     *
     * @var string
     */
    public $needSignatureTxHash;
    protected $_name = [
        'isSuccess'           => 'is_success',
        'message'             => 'message',
        'targetVerifier'      => 'target_verifier',
        'needSignatureTxHash' => 'need_signature_tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('isSuccess', $this->isSuccess, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('targetVerifier', $this->targetVerifier, true);
        Model::validateRequired('needSignatureTxHash', $this->needSignatureTxHash, true);
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
        if (null !== $this->needSignatureTxHash) {
            $res['need_signature_tx_hash'] = $this->needSignatureTxHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcTransmitInitResult
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
        if (isset($map['need_signature_tx_hash'])) {
            $model->needSignatureTxHash = $map['need_signature_tx_hash'];
        }

        return $model;
    }
}
