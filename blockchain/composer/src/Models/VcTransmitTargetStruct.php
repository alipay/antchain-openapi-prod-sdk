<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcTransmitTargetStruct extends Model
{
    // 目标did的公钥
    /**
     * @example xxxx
     *
     * @var string
     */
    public $publicKey;

    // 传输vc使用的区块链id
    /**
     * @example bizid
     *
     * @var string
     */
    public $vcChannel;

    // 验证者did
    /**
     * @example did:mychain:xxxx
     *
     * @var string
     */
    public $verifierDid;
    protected $_name = [
        'publicKey'   => 'public_key',
        'vcChannel'   => 'vc_channel',
        'verifierDid' => 'verifier_did',
    ];

    public function validate()
    {
        Model::validateMaxLength('vcChannel', $this->vcChannel, 32);
        Model::validateMinLength('vcChannel', $this->vcChannel, 8);
        Model::validateRequired('verifierDid', $this->verifierDid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->vcChannel) {
            $res['vc_channel'] = $this->vcChannel;
        }
        if (null !== $this->verifierDid) {
            $res['verifier_did'] = $this->verifierDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcTransmitTargetStruct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['vc_channel'])) {
            $model->vcChannel = $map['vc_channel'];
        }
        if (isset($map['verifier_did'])) {
            $model->verifierDid = $map['verifier_did'];
        }

        return $model;
    }
}
