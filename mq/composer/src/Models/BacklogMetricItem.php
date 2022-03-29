<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class BacklogMetricItem extends Model
{
    // 积压消息量
    /**
     * @example 12121
     *
     * @var int
     */
    public $backlogCnt;

    // 积压数据的时间戳
    /**
     * @example 1576597976000
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'backlogCnt' => 'backlog_cnt',
        'timestamp'  => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('backlogCnt', $this->backlogCnt, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->backlogCnt) {
            $res['backlog_cnt'] = $this->backlogCnt;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BacklogMetricItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['backlog_cnt'])) {
            $model->backlogCnt = $map['backlog_cnt'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
