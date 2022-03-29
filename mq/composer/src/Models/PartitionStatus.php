<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class PartitionStatus extends Model
{
    // 分区ID
    /**
     * @example guid-1
     *
     * @var string
     */
    public $id;

    // 消费位点
    /**
     * @example 1297
     *
     * @var int
     */
    public $consumeOffset;

    // 延迟时间
    /**
     * @example 2021-01-01 11:11:11
     *
     * @var string
     */
    public $consumeTime;

    // 积压数量
    /**
     * @example 123
     *
     * @var int
     */
    public $backlogNum;
    protected $_name = [
        'id'            => 'id',
        'consumeOffset' => 'consume_offset',
        'consumeTime'   => 'consume_time',
        'backlogNum'    => 'backlog_num',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->consumeOffset) {
            $res['consume_offset'] = $this->consumeOffset;
        }
        if (null !== $this->consumeTime) {
            $res['consume_time'] = $this->consumeTime;
        }
        if (null !== $this->backlogNum) {
            $res['backlog_num'] = $this->backlogNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartitionStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['consume_offset'])) {
            $model->consumeOffset = $map['consume_offset'];
        }
        if (isset($map['consume_time'])) {
            $model->consumeTime = $map['consume_time'];
        }
        if (isset($map['backlog_num'])) {
            $model->backlogNum = $map['backlog_num'];
        }

        return $model;
    }
}
