<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDidAuthPayload extends Model
{
    // 新公钥的实际控制者
    /**
     * @example did:mychain:xxxx
     *
     * @var string
     */
    public $controller;

    // 旧Auth Key的过期时间
    /**
     * @example 1567890
     *
     * @var string
     */
    public $previousAuthKeyExpire;

    // 更新Did doc的版本
    /**
     * @example 1
     *
     * @var int
     */
    public $previousVersion;

    // 新DID Auth key的public key id
    /**
     * @example key#3
     *
     * @var string
     */
    public $publicKeyId;

    // 密钥对生成算法
    /**
     * @example RsaVerificationKey2018
     *
     * @var string
     */
    public $publicKeyType;

    // 公钥的实际值
    /**
     * @example xxxxxx
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'controller'            => 'controller',
        'previousAuthKeyExpire' => 'previous_auth_key_expire',
        'previousVersion'       => 'previous_version',
        'publicKeyId'           => 'public_key_id',
        'publicKeyType'         => 'public_key_type',
        'value'                 => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('controller', $this->controller, true);
        Model::validateRequired('previousAuthKeyExpire', $this->previousAuthKeyExpire, true);
        Model::validateRequired('previousVersion', $this->previousVersion, true);
        Model::validateRequired('publicKeyId', $this->publicKeyId, true);
        Model::validateRequired('publicKeyType', $this->publicKeyType, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->controller) {
            $res['controller'] = $this->controller;
        }
        if (null !== $this->previousAuthKeyExpire) {
            $res['previous_auth_key_expire'] = $this->previousAuthKeyExpire;
        }
        if (null !== $this->previousVersion) {
            $res['previous_version'] = $this->previousVersion;
        }
        if (null !== $this->publicKeyId) {
            $res['public_key_id'] = $this->publicKeyId;
        }
        if (null !== $this->publicKeyType) {
            $res['public_key_type'] = $this->publicKeyType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDidAuthPayload
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['controller'])) {
            $model->controller = $map['controller'];
        }
        if (isset($map['previous_auth_key_expire'])) {
            $model->previousAuthKeyExpire = $map['previous_auth_key_expire'];
        }
        if (isset($map['previous_version'])) {
            $model->previousVersion = $map['previous_version'];
        }
        if (isset($map['public_key_id'])) {
            $model->publicKeyId = $map['public_key_id'];
        }
        if (isset($map['public_key_type'])) {
            $model->publicKeyType = $map['public_key_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
