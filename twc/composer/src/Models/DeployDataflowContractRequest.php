<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DeployDataflowContractRequest extends Model
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

    // 信封密钥。存证方本地自行派生一堆非对称密钥，将公钥作为信封密钥。存证方用户后续读取链上信息（如存证密钥、存证数据原文）时，为避免链上明文信息泄漏，会使用该信封密钥对所有链上数据进行加密后再返回，保障数据安全。
    /**
     * @var string
     */
    public $pubkey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pubkey'            => 'pubkey',
    ];

    public function validate()
    {
        Model::validateRequired('pubkey', $this->pubkey, true);
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
        if (null !== $this->pubkey) {
            $res['pubkey'] = $this->pubkey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeployDataflowContractRequest
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
        if (isset($map['pubkey'])) {
            $model->pubkey = $map['pubkey'];
        }

        return $model;
    }
}
