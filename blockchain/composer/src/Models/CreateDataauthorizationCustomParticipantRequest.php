<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDataauthorizationCustomParticipantRequest extends Model
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

    // 区块链ID
    /**
     * @var string
     */
    public $blockchainId;

    // 扩展参数
    /**
     * @var string
     */
    public $extensionInfo;

    // 参与方名字
    /**
     * @var string
     */
    public $name;

    // 服务地址
    /**
     * @var string
     */
    public $notificationService;

    // 参与方ID，全局唯一
    /**
     * @var string
     */
    public $participantId;

    // 公钥
    /**
     * @var string
     */
    public $publicKey;

    // 恢复公钥
    /**
     * @var string
     */
    public $recoverKey;

    // 参与方角色列表
    /**
     * @var string[]
     */
    public $role;

    // 信用代码，证件号等
    /**
     * @var string
     */
    public $creditNumber;

    // 空间ID
    /**
     * @var string
     */
    public $spaceId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'blockchainId'        => 'blockchain_id',
        'extensionInfo'       => 'extension_info',
        'name'                => 'name',
        'notificationService' => 'notification_service',
        'participantId'       => 'participant_id',
        'publicKey'           => 'public_key',
        'recoverKey'          => 'recover_key',
        'role'                => 'role',
        'creditNumber'        => 'credit_number',
        'spaceId'             => 'space_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('participantId', $this->participantId, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('recoverKey', $this->recoverKey, true);
        Model::validateRequired('role', $this->role, true);
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
        if (null !== $this->blockchainId) {
            $res['blockchain_id'] = $this->blockchainId;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->notificationService) {
            $res['notification_service'] = $this->notificationService;
        }
        if (null !== $this->participantId) {
            $res['participant_id'] = $this->participantId;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->recoverKey) {
            $res['recover_key'] = $this->recoverKey;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->creditNumber) {
            $res['credit_number'] = $this->creditNumber;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataauthorizationCustomParticipantRequest
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
        if (isset($map['blockchain_id'])) {
            $model->blockchainId = $map['blockchain_id'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['notification_service'])) {
            $model->notificationService = $map['notification_service'];
        }
        if (isset($map['participant_id'])) {
            $model->participantId = $map['participant_id'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['recover_key'])) {
            $model->recoverKey = $map['recover_key'];
        }
        if (isset($map['role'])) {
            if (!empty($map['role'])) {
                $model->role = $map['role'];
            }
        }
        if (isset($map['credit_number'])) {
            $model->creditNumber = $map['credit_number'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }

        return $model;
    }
}
