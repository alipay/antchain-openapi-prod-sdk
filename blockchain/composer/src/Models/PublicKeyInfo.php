<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PublicKeyInfo extends Model
{
    // 公钥id
    /**
     * @example key-1
     *
     * @var string
     */
    public $keyId;

    // 公钥内容
    /**
     * @example 7ceb38181822437c82909506a87aa456
     *
     * @var string
     */
    public $publicKey;

    // 算法类型
    /**
     * @example Secp256k1VerificationKey2018
     *
     * @var string
     */
    public $signType;

    // 过期时间戳（毫秒）
    /**
     * @example 18600000000
     *
     * @var int
     */
    public $expire;

    // 公钥状态，0:不可用 1:可用
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 创建者的did
    /**
     * @example did:xxxx:xxxxxxxx
     *
     * @var string
     */
    public $controller;
    protected $_name = [
        'keyId'      => 'key_id',
        'publicKey'  => 'public_key',
        'signType'   => 'sign_type',
        'expire'     => 'expire',
        'status'     => 'status',
        'controller' => 'controller',
    ];

    public function validate()
    {
        Model::validateRequired('keyId', $this->keyId, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('signType', $this->signType, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->controller) {
            $res['controller'] = $this->controller;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublicKeyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['controller'])) {
            $model->controller = $map['controller'];
        }

        return $model;
    }
}
