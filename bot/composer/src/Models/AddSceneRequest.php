<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddSceneRequest extends Model
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

    // 场景名称
    /**
     * @var string
     */
    public $sceneName;

    // 是否托管,取值范围为：NON_ESCROWED、ESCROWED
    /**
     * @var string
     */
    public $escrowed;

    // 私钥密码
    /**
     * @var string
     */
    public $privateKeyPassword;

    // 租户
    /**
     * @var string
     */
    public $tenantName;

    // 场景类型
    /**
     * @var string
     */
    public $sceneType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'sceneName'          => 'scene_name',
        'escrowed'           => 'escrowed',
        'privateKeyPassword' => 'private_key_password',
        'tenantName'         => 'tenant_name',
        'sceneType'          => 'scene_type',
    ];

    public function validate()
    {
        Model::validateRequired('sceneName', $this->sceneName, true);
        Model::validateRequired('escrowed', $this->escrowed, true);
        Model::validateRequired('privateKeyPassword', $this->privateKeyPassword, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('sceneType', $this->sceneType, true);
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
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->escrowed) {
            $res['escrowed'] = $this->escrowed;
        }
        if (null !== $this->privateKeyPassword) {
            $res['private_key_password'] = $this->privateKeyPassword;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->sceneType) {
            $res['scene_type'] = $this->sceneType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSceneRequest
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
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['escrowed'])) {
            $model->escrowed = $map['escrowed'];
        }
        if (isset($map['private_key_password'])) {
            $model->privateKeyPassword = $map['private_key_password'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['scene_type'])) {
            $model->sceneType = $map['scene_type'];
        }

        return $model;
    }
}
