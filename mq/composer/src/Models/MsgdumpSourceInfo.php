<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MsgdumpSourceInfo extends Model
{
    // 源 instance id
    /**
     * @example SOFAMQ_DEFAULT_INS
     *
     * @var string
     */
    public $sourceInstanceId;

    // 源端 topic 列表
    /**
     * @example
     *
     * @var SourceTopic[]
     */
    public $sourceTopics;
    protected $_name = [
        'sourceInstanceId' => 'source_instance_id',
        'sourceTopics'     => 'source_topics',
    ];

    public function validate()
    {
        Model::validateRequired('sourceInstanceId', $this->sourceInstanceId, true);
        Model::validateRequired('sourceTopics', $this->sourceTopics, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sourceInstanceId) {
            $res['source_instance_id'] = $this->sourceInstanceId;
        }
        if (null !== $this->sourceTopics) {
            $res['source_topics'] = [];
            if (null !== $this->sourceTopics && \is_array($this->sourceTopics)) {
                $n = 0;
                foreach ($this->sourceTopics as $item) {
                    $res['source_topics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MsgdumpSourceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source_instance_id'])) {
            $model->sourceInstanceId = $map['source_instance_id'];
        }
        if (isset($map['source_topics'])) {
            if (!empty($map['source_topics'])) {
                $model->sourceTopics = [];
                $n                   = 0;
                foreach ($map['source_topics'] as $item) {
                    $model->sourceTopics[$n++] = null !== $item ? SourceTopic::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
