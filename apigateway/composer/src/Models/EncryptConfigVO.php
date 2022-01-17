<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class EncryptConfigVO extends Model
{
    // app_id
    /**
     * @example app1
     *
     * @var string
     */
    public $appId;

    // 加密状态
    /**
     * @example OPENED/CLOSED
     *
     * @var string
     */
    public $encryptionStatus;

    // 加密类型
    /**
     * @example ECC/RSA/SM
     *
     * @var string
     */
    public $encryptType;

    // key_pair
    /**
     * @example keypair1
     *
     * @var string
     */
    public $keyPair;

    // private_key
    /**
     * @example key1
     *
     * @var string
     */
    public $privateKey;

    // pub_key
    /**
     * @example key1
     *
     * @var string
     */
    public $pubKey;

    // workspace_id
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'appId'            => 'app_id',
        'encryptionStatus' => 'encryption_status',
        'encryptType'      => 'encrypt_type',
        'keyPair'          => 'key_pair',
        'privateKey'       => 'private_key',
        'pubKey'           => 'pub_key',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->encryptionStatus) {
            $res['encryption_status'] = $this->encryptionStatus;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->keyPair) {
            $res['key_pair'] = $this->keyPair;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EncryptConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['encryption_status'])) {
            $model->encryptionStatus = $map['encryption_status'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['key_pair'])) {
            $model->keyPair = $map['key_pair'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
