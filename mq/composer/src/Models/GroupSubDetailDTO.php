<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class GroupSubDetailDTO extends Model
{
    // Group ID
    /**
     * @example GID_test_group_id
     *
     * @var string
     */
    public $groupId;

    // 部署模型
    /**
     * @example CLUSTERING
     *
     * @var string
     */
    public $messageModel;

    // 是否在线
    /**
     * @example true
     *
     * @var bool
     */
    public $online;

    // 订阅信息列表
    /**
     * @example
     *
     * @var SubscriptionTopicDTO[]
     */
    public $subscriptionDataList;
    protected $_name = [
        'groupId'              => 'group_id',
        'messageModel'         => 'message_model',
        'online'               => 'online',
        'subscriptionDataList' => 'subscription_data_list',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('messageModel', $this->messageModel, true);
        Model::validateRequired('online', $this->online, true);
        Model::validateRequired('subscriptionDataList', $this->subscriptionDataList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->messageModel) {
            $res['message_model'] = $this->messageModel;
        }
        if (null !== $this->online) {
            $res['online'] = $this->online;
        }
        if (null !== $this->subscriptionDataList) {
            $res['subscription_data_list'] = [];
            if (null !== $this->subscriptionDataList && \is_array($this->subscriptionDataList)) {
                $n = 0;
                foreach ($this->subscriptionDataList as $item) {
                    $res['subscription_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GroupSubDetailDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['message_model'])) {
            $model->messageModel = $map['message_model'];
        }
        if (isset($map['online'])) {
            $model->online = $map['online'];
        }
        if (isset($map['subscription_data_list'])) {
            if (!empty($map['subscription_data_list'])) {
                $model->subscriptionDataList = [];
                $n                           = 0;
                foreach ($map['subscription_data_list'] as $item) {
                    $model->subscriptionDataList[$n++] = null !== $item ? SubscriptionTopicDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
