<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class EventSubConfig extends Model
{
    // 配置是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // 事件类型数组
    /**
     * @example EventA,EventB
     *
     * @var string[]
     */
    public $eventTypes;

    // 事件触发通知类型
    /**
     * @example DingTalk
     *
     * @var string
     */
    public $triggerType;

    // 钉钉通知的webhook
    /**
     * @example http://ssssxxxx
     *
     * @var string
     */
    public $webhook;

    // http 连接
    /**
     * @example http://xxx
     *
     * @var string
     */
    public $httpUrl;

    // topic
    /**
     * @example TP_Test
     *
     * @var string
     */
    public $topic;

    // tag
    /**
     * @example tag
     *
     * @var string
     */
    public $tag;
    protected $_name = [
        'enabled'     => 'enabled',
        'eventTypes'  => 'event_types',
        'triggerType' => 'trigger_type',
        'webhook'     => 'webhook',
        'httpUrl'     => 'http_url',
        'topic'       => 'topic',
        'tag'         => 'tag',
    ];

    public function validate()
    {
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('eventTypes', $this->eventTypes, true);
        Model::validateRequired('triggerType', $this->triggerType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->eventTypes) {
            $res['event_types'] = $this->eventTypes;
        }
        if (null !== $this->triggerType) {
            $res['trigger_type'] = $this->triggerType;
        }
        if (null !== $this->webhook) {
            $res['webhook'] = $this->webhook;
        }
        if (null !== $this->httpUrl) {
            $res['http_url'] = $this->httpUrl;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventSubConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['event_types'])) {
            if (!empty($map['event_types'])) {
                $model->eventTypes = $map['event_types'];
            }
        }
        if (isset($map['trigger_type'])) {
            $model->triggerType = $map['trigger_type'];
        }
        if (isset($map['webhook'])) {
            $model->webhook = $map['webhook'];
        }
        if (isset($map['http_url'])) {
            $model->httpUrl = $map['http_url'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }

        return $model;
    }
}
