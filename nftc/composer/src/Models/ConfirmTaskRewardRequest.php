<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ConfirmTaskRewardRequest extends Model
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

    // 鲸探用户唯一标识
    /**
     * @var string
     */
    public $openUserId;

    // 前置通过消息获取的奖励流水唯—id(可用作幂等键，详情看下文的奖励消息通知)
    /**
     * @var string
     */
    public $rewardRecordId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openUserId'        => 'open_user_id',
        'rewardRecordId'    => 'reward_record_id',
    ];

    public function validate()
    {
        Model::validateRequired('openUserId', $this->openUserId, true);
        Model::validateRequired('rewardRecordId', $this->rewardRecordId, true);
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
        if (null !== $this->openUserId) {
            $res['open_user_id'] = $this->openUserId;
        }
        if (null !== $this->rewardRecordId) {
            $res['reward_record_id'] = $this->rewardRecordId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmTaskRewardRequest
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
        if (isset($map['open_user_id'])) {
            $model->openUserId = $map['open_user_id'];
        }
        if (isset($map['reward_record_id'])) {
            $model->rewardRecordId = $map['reward_record_id'];
        }

        return $model;
    }
}
