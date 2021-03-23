<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateUnionChannelRequest extends Model
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

    // 联盟ID
    /**
     * @var int
     */
    public $unionId;

    // 通信通道的名称
    /**
     * @var string
     */
    public $channelName;

    // 发起创建channel的用户
    /**
     * @var string
     */
    public $userDid;

    // Channel中数据是否联盟内公开，true为公开可访问，支持后续更新是否公开
    /**
     * @var bool
     */
    public $publicAcl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
        'userDid'           => 'user_did',
        'publicAcl'         => 'public_acl',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('publicAcl', $this->publicAcl, true);
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
        if (null !== $this->publicAcl) {
            $res['public_acl'] = $this->publicAcl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUnionChannelRequest
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
        if (isset($map['public_acl'])) {
            $model->publicAcl = $map['public_acl'];
        }

        return $model;
    }
}
