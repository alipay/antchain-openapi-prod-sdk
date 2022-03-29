<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MessageTrackDTO extends Model
{
    // 订阅该 Topic 的消费者所对应的 Group ID
    /**
     * @example GID_test_group_id
     *
     * @var string
     */
    public $consumerGroup;

    // 需查询的消息所对应的实例 ID
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 当前状态。取值说明如下：
    //
    // CONSUMED：已消费
    // CONSUMED_BUT_FILTERED：已被过滤
    // NOT_CONSUME_YET：暂未消费
    // NOT_ONLINE：客户端不在线
    // UNKNOWN：其他问题
    //
    /**
     * @example CONSUMED
     *
     * @var string
     */
    public $trackType;
    protected $_name = [
        'consumerGroup' => 'consumer_group',
        'instanceId'    => 'instance_id',
        'trackType'     => 'track_type',
    ];

    public function validate()
    {
        Model::validateRequired('consumerGroup', $this->consumerGroup, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('trackType', $this->trackType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consumerGroup) {
            $res['consumer_group'] = $this->consumerGroup;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->trackType) {
            $res['track_type'] = $this->trackType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MessageTrackDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consumer_group'])) {
            $model->consumerGroup = $map['consumer_group'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['track_type'])) {
            $model->trackType = $map['track_type'];
        }

        return $model;
    }
}
