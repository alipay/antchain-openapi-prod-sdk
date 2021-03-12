<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateMydidcommunWorkergroupTappRequest extends Model
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

    // TAPP部署实例ID
    /**
     * @var int
     */
    public $tappInstanceId;

    // TAPP部署公钥
    /**
     * @var string
     */
    public $publicKey;

    // TAPP部署在mytf中的版本号
    /**
     * @var int
     */
    public $tappVersion;

    // mytf部署后返回的TAPP哈希
    /**
     * @var string
     */
    public $hash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tappInstanceId'    => 'tapp_instance_id',
        'publicKey'         => 'public_key',
        'tappVersion'       => 'tapp_version',
        'hash'              => 'hash',
    ];

    public function validate()
    {
        Model::validateRequired('tappInstanceId', $this->tappInstanceId, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('tappVersion', $this->tappVersion, true);
        Model::validateRequired('hash', $this->hash, true);
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
        if (null !== $this->tappInstanceId) {
            $res['tapp_instance_id'] = $this->tappInstanceId;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->tappVersion) {
            $res['tapp_version'] = $this->tappVersion;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMydidcommunWorkergroupTappRequest
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
        if (isset($map['tapp_instance_id'])) {
            $model->tappInstanceId = $map['tapp_instance_id'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['tapp_version'])) {
            $model->tappVersion = $map['tapp_version'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }

        return $model;
    }
}
