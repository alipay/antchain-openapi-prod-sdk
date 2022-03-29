<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SourceTopic extends Model
{
    // 源端 topic
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $sourceTopic;

    // 此源端 topic 所有的 event code列表
    /**
     * @example
     *
     * @var string[]
     */
    public $sourceEventCode;
    protected $_name = [
        'sourceTopic'     => 'source_topic',
        'sourceEventCode' => 'source_event_code',
    ];

    public function validate()
    {
        Model::validateRequired('sourceTopic', $this->sourceTopic, true);
        Model::validateRequired('sourceEventCode', $this->sourceEventCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sourceTopic) {
            $res['source_topic'] = $this->sourceTopic;
        }
        if (null !== $this->sourceEventCode) {
            $res['source_event_code'] = $this->sourceEventCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SourceTopic
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['source_topic'])) {
            $model->sourceTopic = $map['source_topic'];
        }
        if (isset($map['source_event_code'])) {
            if (!empty($map['source_event_code'])) {
                $model->sourceEventCode = $map['source_event_code'];
            }
        }

        return $model;
    }
}
