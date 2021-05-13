<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class AuthChannelUserRequest extends Model
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

    // 联盟ID
    /**
     * @var int
     */
    public $unionId;

    // Channel名称
    /**
     * @var string
     */
    public $channelName;

    // 发起授权操作的账户
    /**
     * @var string
     */
    public $userDid;

    // 要授权的账户
    /**
     * @var string
     */
    public $targetUserDid;

    // 要给用户分配读或写权限
    // READ,
    // WRITE;
    /**
     * @var string
     */
    public $operateType;

    // 授权有效期，为空时表示永久有效
    /**
     * @var string
     */
    public $validTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
        'userDid'           => 'user_did',
        'targetUserDid'     => 'target_user_did',
        'operateType'       => 'operate_type',
        'validTime'         => 'valid_time',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('targetUserDid', $this->targetUserDid, true);
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->targetUserDid) {
            $res['target_user_did'] = $this->targetUserDid;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthChannelUserRequest
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
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['target_user_did'])) {
            $model->targetUserDid = $map['target_user_did'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }

        return $model;
    }
}
