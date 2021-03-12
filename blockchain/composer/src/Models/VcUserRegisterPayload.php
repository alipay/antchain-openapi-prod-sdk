<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VcUserRegisterPayload extends Model
{
    // 用户did对应的授权公钥
    /**
     * @example 用户did对应的授权公钥
     *
     * @var string
     */
    public $publicKey;

    // 业务区块连的bizid
    /**
     * @example 业务区块连的bizid
     *
     * @var string
     */
    public $vcChannel;
    protected $_name = [
        'publicKey' => 'public_key',
        'vcChannel' => 'vc_channel',
    ];

    public function validate()
    {
        Model::validateMaxLength('vcChannel', $this->vcChannel, 32);
        Model::validateMinLength('vcChannel', $this->vcChannel, 8);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VcUserRegisterPayload
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

        return $model;
    }
}
