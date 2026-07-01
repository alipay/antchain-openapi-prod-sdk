<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SetContractTenantkeyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 被通信秘钥加密后的解密密钥字符串。
    /**
     * @var string
     */
    public $fileDecryptKey;

    // 使用base64编码后的RSA公钥；用于解密decryptKey以及加密入参
    /**
     * @var string
     */
    public $signalPubKeyEncoded;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'fileDecryptKey'      => 'file_decrypt_key',
        'signalPubKeyEncoded' => 'signal_pub_key_encoded',
    ];

    public function validate()
    {
        Model::validateRequired('fileDecryptKey', $this->fileDecryptKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileDecryptKey) {
            $res['file_decrypt_key'] = $this->fileDecryptKey;
        }
        if (null !== $this->signalPubKeyEncoded) {
            $res['signal_pub_key_encoded'] = $this->signalPubKeyEncoded;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetContractTenantkeyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['file_decrypt_key'])) {
            $model->fileDecryptKey = $map['file_decrypt_key'];
        }
        if (isset($map['signal_pub_key_encoded'])) {
            $model->signalPubKeyEncoded = $map['signal_pub_key_encoded'];
        }

        return $model;
    }
}
