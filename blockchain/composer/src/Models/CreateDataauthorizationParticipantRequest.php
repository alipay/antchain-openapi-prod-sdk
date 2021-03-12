<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDataauthorizationParticipantRequest extends Model
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

    // 账户名称
    /**
     * @var string
     */
    public $account;

    // 业务系统唯一标示
    /**
     * @var string
     */
    public $bizUid;

    // 区块链ID
    /**
     * @var string
     */
    public $blockchainId;

    // 信用编号
    /**
     * @var string
     */
    public $creditNumber;

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

    // 空间ID
    /**
     * @var string
     */
    public $spaceId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'account'             => 'account',
        'bizUid'              => 'biz_uid',
        'blockchainId'        => 'blockchain_id',
        'creditNumber'        => 'credit_number',
        'extensionInfo'       => 'extension_info',
        'name'                => 'name',
        'notificationService' => 'notification_service',
        'publicInfo'          => 'public_info',
        'role'                => 'role',
        'spaceId'             => 'space_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateMaxLength('bizUid', $this->bizUid, 64);
        Model::validateMaxLength('extensionInfo', $this->extensionInfo, 2000);
        Model::validateMaxLength('name', $this->name, 64);
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
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->blockchainId) {
            $res['blockchain_id'] = $this->blockchainId;
        }
        if (null !== $this->creditNumber) {
            $res['credit_number'] = $this->creditNumber;
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
        if (null !== $this->publicInfo) {
            $res['public_info'] = $this->publicInfo;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataauthorizationParticipantRequest
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
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['blockchain_id'])) {
            $model->blockchainId = $map['blockchain_id'];
        }
        if (isset($map['credit_number'])) {
            $model->creditNumber = $map['credit_number'];
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
        if (isset($map['public_info'])) {
            $model->publicInfo = $map['public_info'];
        }
        if (isset($map['role'])) {
            if (!empty($map['role'])) {
                $model->role = $map['role'];
            }
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }

        return $model;
    }
}
