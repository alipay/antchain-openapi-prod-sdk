<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class Participant extends Model
{
    // 业务系统唯一标示
    /**
     * @example 76a0e716164848168dc726460042ee25
     *
     * @var string
     */
    public $bizUid;

    // 区块链ID
    /**
     * @example cfd98b44fb3246dbbae07dae4bae59fe
     *
     * @var string
     */
    public $blockchainId;

    // 创建时间
    /**
     * @example 1595574776000
     *
     * @var int
     */
    public $createTime;

    // 信用代码
    /**
     * @example 30405123
     *
     * @var string
     */
    public $creditNumber;

    // 扩展信息，标准JSON格式
    /**
     * @example {"organization":"test","company":"test"}
     *
     * @var string
     */
    public $extensionInfo;

    // 参与方名字
    /**
     * @example Bob
     *
     * @var string
     */
    public $name;

    // 回调通知服务地址
    /**
     * @example http://127.0.0.1
     *
     * @var string
     */
    public $notificationService;

    // 参与方ID
    /**
     * @example did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
     *
     * @var string
     */
    public $participantId;

    // DID  doc中的公开信息
    /**
     * @example information
     *
     * @var string
     */
    public $publicInfo;

    // 参与方角色列表
    /**
     * @example
     *
     * @var string[]
     */
    public $role;

    // 空间ID
    /**
     * @example space1
     *
     * @var string
     */
    public $spaceId;

    // 参与方状态
    /**
     * @example ACTIVE,DELETED...
     *
     * @var string
     */
    public $status;

    // 更新时间
    /**
     * @example 1595574776000
     *
     * @var int
     */
    public $updateTime;

    // 账户名称
    /**
     * @example account1
     *
     * @var string
     */
    public $account;
    protected $_name = [
        'bizUid'              => 'biz_uid',
        'blockchainId'        => 'blockchain_id',
        'createTime'          => 'create_time',
        'creditNumber'        => 'credit_number',
        'extensionInfo'       => 'extension_info',
        'name'                => 'name',
        'notificationService' => 'notification_service',
        'participantId'       => 'participant_id',
        'publicInfo'          => 'public_info',
        'role'                => 'role',
        'spaceId'             => 'space_id',
        'status'              => 'status',
        'updateTime'          => 'update_time',
        'account'             => 'account',
    ];

    public function validate()
    {
        Model::validateMaxLength('bizUid', $this->bizUid, 64);
        Model::validateMaxLength('name', $this->name, 64);
        Model::validateMaxLength('participantId', $this->participantId, 100);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('participantId', $this->participantId, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->blockchainId) {
            $res['blockchain_id'] = $this->blockchainId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
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
        if (null !== $this->participantId) {
            $res['participant_id'] = $this->participantId;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Participant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['blockchain_id'])) {
            $model->blockchainId = $map['blockchain_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
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
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }

        return $model;
    }
}
