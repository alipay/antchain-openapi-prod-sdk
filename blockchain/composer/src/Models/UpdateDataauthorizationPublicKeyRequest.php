<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDataauthorizationPublicKeyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 公钥列表
    /**
     * @var PublicKey[]
     */
    public $publicKeys;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'publicKeys'        => 'public_keys',
    ];

    public function validate()
    {
        Model::validateRequired('publicKeys', $this->publicKeys, true);
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
        if (null !== $this->publicKeys) {
            $res['public_keys'] = [];
            if (null !== $this->publicKeys && \is_array($this->publicKeys)) {
                $n = 0;
                foreach ($this->publicKeys as $item) {
                    $res['public_keys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDataauthorizationPublicKeyRequest
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
        if (isset($map['public_keys'])) {
            if (!empty($map['public_keys'])) {
                $model->publicKeys = [];
                $n                 = 0;
                foreach ($map['public_keys'] as $item) {
                    $model->publicKeys[$n++] = null !== $item ? PublicKey::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
