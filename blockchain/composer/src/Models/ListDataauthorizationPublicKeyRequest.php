<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationPublicKeyRequest extends Model
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

    // 生成公钥时的关联关系
    /**
     * @var PublicKeyRelation[]
     */
    public $publicKeyRelations;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'publicKeyRelations' => 'public_key_relations',
    ];

    public function validate()
    {
        Model::validateRequired('publicKeyRelations', $this->publicKeyRelations, true);
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
        if (null !== $this->publicKeyRelations) {
            $res['public_key_relations'] = [];
            if (null !== $this->publicKeyRelations && \is_array($this->publicKeyRelations)) {
                $n = 0;
                foreach ($this->publicKeyRelations as $item) {
                    $res['public_key_relations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationPublicKeyRequest
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
        if (isset($map['public_key_relations'])) {
            if (!empty($map['public_key_relations'])) {
                $model->publicKeyRelations = [];
                $n                         = 0;
                foreach ($map['public_key_relations'] as $item) {
                    $model->publicKeyRelations[$n++] = null !== $item ? PublicKeyRelation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
