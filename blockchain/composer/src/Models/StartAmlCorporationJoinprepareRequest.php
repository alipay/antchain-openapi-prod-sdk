<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAmlCorporationJoinprepareRequest extends Model
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

    // 企业加入BaaS创建的反洗钱联盟时使用的邮箱地址
    /**
     * @var string
     */
    public $email;

    // 扩展信息字段
    /**
     * @var string
     */
    public $extension;

    // 目前支持ECDSA K1公私密钥对
    /**
     * @var string
     */
    public $publicKey;

    // 数字身份恢复密钥，支持ECDSA K1曲线的公私密钥对
    /**
     * @var string
     */
    public $recoveryKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'email'             => 'email',
        'extension'         => 'extension',
        'publicKey'         => 'public_key',
        'recoveryKey'       => 'recovery_key',
    ];

    public function validate()
    {
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
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
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->recoveryKey) {
            $res['recovery_key'] = $this->recoveryKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAmlCorporationJoinprepareRequest
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
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['recovery_key'])) {
            $model->recoveryKey = $map['recovery_key'];
        }

        return $model;
    }
}
