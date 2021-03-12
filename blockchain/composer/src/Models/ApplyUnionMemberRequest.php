<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyUnionMemberRequest extends Model
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

    // 联盟id
    /**
     * @var string
     */
    public $consortiumId;

    // 被邀请用户的bid
    /**
     * @var string
     */
    public $inviteBid;

    // 被邀请的用户id
    /**
     * @var int
     */
    public $inviteUserId;

    // 区域信息
    /**
     * @var string
     */
    public $regionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'consortiumId'      => 'consortium_id',
        'inviteBid'         => 'invite_bid',
        'inviteUserId'      => 'invite_user_id',
        'regionId'          => 'region_id',
    ];

    public function validate()
    {
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
        if (null !== $this->consortiumId) {
            $res['consortium_id'] = $this->consortiumId;
        }
        if (null !== $this->inviteBid) {
            $res['invite_bid'] = $this->inviteBid;
        }
        if (null !== $this->inviteUserId) {
            $res['invite_user_id'] = $this->inviteUserId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUnionMemberRequest
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
        if (isset($map['consortium_id'])) {
            $model->consortiumId = $map['consortium_id'];
        }
        if (isset($map['invite_bid'])) {
            $model->inviteBid = $map['invite_bid'];
        }
        if (isset($map['invite_user_id'])) {
            $model->inviteUserId = $map['invite_user_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
