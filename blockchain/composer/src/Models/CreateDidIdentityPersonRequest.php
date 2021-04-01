<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDidIdentityPersonRequest extends Model
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

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

    // 公钥
    /**
     * @var string
     */
    public $publicKey;

    // 恢复公钥
    /**
     * @var string
     */
    public $recoveryKey;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 用户名称
    /**
     * @var string
     */
    public $userName;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'extensionInfo'     => 'extension_info',
        'publicKey'         => 'public_key',
        'recoveryKey'       => 'recovery_key',
        'userId'            => 'user_id',
        'userName'          => 'user_name',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('recoveryKey', $this->recoveryKey, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->recoveryKey) {
            $res['recovery_key'] = $this->recoveryKey;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDidIdentityPersonRequest
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
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['recovery_key'])) {
            $model->recoveryKey = $map['recovery_key'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
