<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SubscriptionTopicDTO extends Model
{
    // 是否在线
    /**
     * @example true
     *
     * @var bool
     */
    public $online;

    // 订阅匹配字符串
    /**
     * @example *
     *
     * @var string
     */
    public $subString;

    // Topic 名称
    /**
     * @example test-mq_topic
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'online'    => 'online',
        'subString' => 'sub_string',
        'topic'     => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('online', $this->online, true);
        Model::validateRequired('subString', $this->subString, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->online) {
            $res['online'] = $this->online;
        }
        if (null !== $this->subString) {
            $res['sub_string'] = $this->subString;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubscriptionTopicDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['online'])) {
            $model->online = $map['online'];
        }
        if (isset($map['sub_string'])) {
            $model->subString = $map['sub_string'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
