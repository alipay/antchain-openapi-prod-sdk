<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDataauthorizationParticipantRequest extends Model
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

    // 扩展参数，标准JSON格式
    /**
     * @var string
     */
    public $extensionInfo;

    // 用户名称
    /**
     * @var string
     */
    public $name;

    // 回调通知服务地址
    /**
     * @var string
     */
    public $notificationService;

    // 参与方ID
    /**
     * @var string
     */
    public $participantId;

    // did doc中的公开信息
    /**
     * @var string
     */
    public $publicInfo;

    // 用户角色列表
    /**
     * @var string[]
     */
    public $role;

    // 账户名称
    /**
     * @var string
     */
    public $account;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'extensionInfo'       => 'extension_info',
        'name'                => 'name',
        'notificationService' => 'notification_service',
        'participantId'       => 'participant_id',
        'publicInfo'          => 'public_info',
        'role'                => 'role',
        'account'             => 'account',
    ];

    public function validate()
    {
        Model::validateMaxLength('extensionInfo', $this->extensionInfo, 2000);
        Model::validateMaxLength('name', $this->name, 64);
        Model::validateMaxLength('participantId', $this->participantId, 100);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('participantId', $this->participantId, true);
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
        if (null !== $this->publicInfo) {
            $res['public_info'] = $this->publicInfo;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDataauthorizationParticipantRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['notification_service'])) {
            $model->notificationService = $map['notification_service'];
        }
        if (isset($map['participant_id'])) {
            $model->participantId = $map['participant_id'];
        }
        if (isset($map['public_info'])) {
            $model->publicInfo = $map['public_info'];
        }
        if (isset($map['role'])) {
            if (!empty($map['role'])) {
                $model->role = $map['role'];
            }
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }

        return $model;
    }
}
