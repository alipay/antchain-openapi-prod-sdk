<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicSubDetailDTO extends Model
{
    // 最近发送时间
    /**
     * @example
     *
     * @var int
     */
    public $latestSendTime;

    // SubscriptionData 数组
    /**
     * @example
     *
     * @var SubscriptionGroupDTO[]
     */
    public $subscriptionDataList;

    // Topic 名称
    /**
     * @example test
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'latestSendTime'       => 'latest_send_time',
        'subscriptionDataList' => 'subscription_data_list',
        'topic'                => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('latestSendTime', $this->latestSendTime, true);
        Model::validateRequired('subscriptionDataList', $this->subscriptionDataList, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->latestSendTime) {
            $res['latest_send_time'] = $this->latestSendTime;
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
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicSubDetailDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['latest_send_time'])) {
            $model->latestSendTime = $map['latest_send_time'];
        }
        if (isset($map['subscription_data_list'])) {
            if (!empty($map['subscription_data_list'])) {
                $model->subscriptionDataList = [];
                $n                           = 0;
                foreach ($map['subscription_data_list'] as $item) {
                    $model->subscriptionDataList[$n++] = null !== $item ? SubscriptionGroupDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
