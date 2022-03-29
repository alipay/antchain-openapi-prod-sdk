<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicStatusDTO extends Model
{
    // Topic 的最后更新时间时间戳
    /**
     * @example
     *
     * @var int
     */
    public $lastTimestamp;

    // 设置该 Topic 的读写模式。取值说明如下：6：同时支持读写；4：禁写；2：禁读。
    /**
     * @example 6
     *
     * @var int
     */
    public $perm;

    // 消息总量
    /**
     * @example
     *
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'lastTimestamp' => 'last_timestamp',
        'perm'          => 'perm',
        'totalCount'    => 'total_count',
    ];

    public function validate()
    {
        Model::validateRequired('lastTimestamp', $this->lastTimestamp, true);
        Model::validateRequired('perm', $this->perm, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lastTimestamp) {
            $res['last_timestamp'] = $this->lastTimestamp;
        }
        if (null !== $this->perm) {
            $res['perm'] = $this->perm;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicStatusDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['last_timestamp'])) {
            $model->lastTimestamp = $map['last_timestamp'];
        }
        if (isset($map['perm'])) {
            $model->perm = $map['perm'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
